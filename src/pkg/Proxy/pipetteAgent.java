package pkg.Proxy;

public class pipetteAgent implements pipette{

    //被代理的导管
    private pipetteEntity PipetteEntity;
    //开始代理
    pipetteAgent(pipetteEntity pipetteEntity)
    {
        this.PipetteEntity=pipetteEntity;
    }
    @Override
    public void move() {
     System.out.println("吸管正在移动.....\n");
    }

    @Override
    public void Extraction() {
    System.out.println("吸管正在快速抽取热可可......\n");
    }

    @Override
    public void PourOut() {
        System.out.println("吸管倒出热可可......\n");
    }

    public void ShowPipette()
    {
        System.out.println("Wonka:这边是工厂的超大吸管，它每小时可以从巧克力河中抽取几万加仑的热可可\n");
        move();
        Extraction();
        move();

    }
}
