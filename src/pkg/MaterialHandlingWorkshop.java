package pkg;
import pkg.hzc.Prototype.BoilerProducing.BoilerCache;
import pkg.hzc.Prototype.BoilerProducing.Boiler;

public class MaterialHandlingWorkshop implements Scene {
    @Override
    public void welcome() {
        System.out.println("Welcome to MaterialHandlingWorkshop!");
        Prototype();
    }

    //厂长讲述加工虚空原料的过程（例如仓鼠加工榛果）
    //Code

    public void Prototype() {
        //介绍熔炉制作工艺
        System.out.println("看到那些大火炉了吗，我的孩子？");
        System.out.println("告诉你个秘密吧，其实起初只有一台熔炉哦");
        System.out.println("一位好心的魔法师使用神奇的原型魔法，帮我‘克隆’出了其他的熔炉，这可帮了大忙了！");
        System.out.println("来看看现在我们拥有的魔法熔炉吧！");
        System.out.println("---------------");
        BoilerCache.loadCache();

        Boiler clonedBoiler = (Boiler) BoilerCache.getBoiler("1");
        System.out.println("Boiler : " + clonedBoiler.getType());

        Boiler clonedBoiler2 = (Boiler) BoilerCache.getBoiler("2");
        System.out.println("Boiler : " + clonedBoiler2.getType());

        Boiler clonedBoiler3 = (Boiler) BoilerCache.getBoiler("3");
        System.out.println("Boiler : " + clonedBoiler3.getType());
        System.out.println("---------------");

        //保险箱，马文博
        //code
    }
}
