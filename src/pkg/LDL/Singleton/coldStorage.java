package pkg.LDL.Singleton;

public class coldStorage {
    private int temp;  //冷库的温度
    private int[][] Capacity = new int[20][20];  //冷库的分布，0表示位置为空，1代表该位置以被占

    //创建 SingleObject 的一个对象
    private static coldStorage theColdStorage = new coldStorage();

    //让构造函数为 private，这样该类就不会被实例化
    private coldStorage(){}

    //获取唯一可用的对象
    public static coldStorage getInstance(){
        return theColdStorage;
    }
    //将巧克力放入冷库
    public boolean putIn(int x,int y) {
        System.out.println("将包装好的巧克力放入冷库的横"+x+"纵向"+y);
        theColdStorage.Capacity[x][y]=1;
        return true;
    }
    //从冷库取出巧克力
    public  boolean takeOut(int x,int y){
        System.out.println("将包装好的巧克力放入冷库的横"+x+"纵向"+y);
        theColdStorage.Capacity[x][y]=0;
        return true;
    }
    //检查冷库的（x,y）处是否为空位
    public boolean isEmpty(int x,int y){
        if(theColdStorage.Capacity[x][y]==0){
            System.out.println("冷库该位置为空，可以放入巧克力");
        }else{
            System.out.println("冷库中该位置不为空，不可放入巧克力");
        }
        return true;
    }
    //搜寻冷库中的空位
    public int[] searchEmpty(){
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                if(theColdStorage.Capacity[i][j]==0){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0};
    }
    //查看冷库的温度
    public int checkTemp(){
        return theColdStorage.temp;
    }
    //调整冷库的温度
    public boolean setTemp(int x){
        theColdStorage.temp=x;
        return true;
    }
    public void showMessage(){
        System.out.println("巧克力制作过程进入冷库，开始冷藏巧克力！！！");
    }

}
