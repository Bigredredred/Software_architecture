package pkg;

public class MaterialHandlingWorkshop implements Scene {
    @Override
    public void welcome() {
        System.out.println("Welcome to MaterialHandlingWorkshop!");
        introduce();
    }

    public void introduce() {
        //厂长讲述加工虚空原料的过程（例如仓鼠加工榛果）
        //Code

        //介绍熔炉制作工艺
        System.out.println("看到那些大火炉了吗，我的孩子？");
        System.out.println("告诉你个秘密吧，其实起初只有一台熔炉哦");
        System.out.println("一位好心的魔法师使用神奇的原型魔法，帮我‘克隆’出了其他的熔炉，这可帮了大忙了！");
    }
}
