package pkg;
import pkg.hzc.Decorator.*;

public class ProductAssemblyWorkshop implements Scene {
    @Override
    public void welcome() {
        System.out.println("Welcome to ProductAssemblyWorkshop!");
        introduce();
    }

    public void introduce(){
        System.out.println("小查理在流水线上看到了几张金光闪闪的券，问厂长是什么");
        System.out.println("这个呀，这个就是我给善良诚实的孩子的礼物，厂长笑着说");
        System.out.println("小查理问，这是怎么做到的呀？");
        System.out.println("原来厂长运用了一种魔法，它能识别购买巧克力的孩子的本性，并让善良的孩子优先选择含有奖券的巧克力购买");
        System.out.println("小查理非常好奇，看着流水线旁的出货屏幕，不由得入了神");
        System.out.println("屏幕上正好显示了几种不同的巧克力：\n");
        Material paper = new Paper();
        MaterialDecorator havingGiftPaper = new MaterialWithContainerDecorator(new Paper());
        MaterialDecorator havingGiftTinfoil = new MaterialWithContainerDecorator(new Tinfoil());
        System.out.println("---------------");
        System.out.println("普通巧克力包装：");
        paper.wrap();

        System.out.println("\n含有奖券的纸装巧克力：");
        havingGiftPaper.wrap();

        System.out.println("\n含有奖券的锡箔装巧克力：");
        havingGiftTinfoil.wrap();
        System.out.println("---------------");

        System.out.println("\n小查理若有所思，这时厂长说:6楼还有更好玩的东西，快跟我来吧！");
        System.out.println("于是一行人走到了电梯口");
    }
}
