package pkg.mwb.beiwanglu;

public class MementoPattern
{
    public static void mpevent()
    {
        Originator or=new Originator(); //创建和恢复备忘录
        Caretaker cr=new Caretaker(); //保存和获取备忘录
        or.setState("正常");
        System.out.println("产品的配方:"+or.getState());
        cr.setMemento(or.createMemento()); //保存状态
        or.setState("断电导致配方丢失！");
        System.out.println("断电情况:"+or.getState());
        or.restoreMemento(cr.getMemento()); //恢复状态
        System.out.println("备忘录系统介入！产品的配方:"+or.getState());
    }
}
//备忘录
class Memento
{
    private String state;
    public Memento(String state)
    {
        this.state=state;
    }
    public void setState(String state)
    {
        this.state=state;
    }
    public String getState()
    {
        return state;
    }
}
//发起人
class Originator
{
    private String state;
    public void setState(String state)
    {
        this.state=state;
    }
    public String getState() //获取数据
    {
        return state;
    }
    public Memento createMemento() //创建备忘录
    {
        return new Memento(state);
    }
    public void restoreMemento(Memento m) //保存备忘录
    {
        this.setState(m.getState());
    }
}
//管理者
class Caretaker
{
    private Memento memento;

    //保存备忘录（保存配方）
    public void setMemento(Memento m)
    {
        memento=m;
    }

    //获取备忘录（获取新的配方）
    public Memento getMemento()
    {
        return memento;
    }
}