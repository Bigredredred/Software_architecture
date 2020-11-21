package pkg;
//import pkg.wck.Iterator.Iterator;
import pkg.wck.Iterator.IteratorDemo;
import pkg.wck.Builder.MakingWorkShop;

public class ChocolateMakingWorkshop implements Scene {
    @Override
    public void welcome() {
        System.out.println("Welcome to ChocolateMakingWorkshop!");
        Builder();
    }

    public void Builder(){
        MakingWorkShop makingWorkShop = new MakingWorkShop();
        Iterator();
    }

    public void Iterator() {
        IteratorDemo iteratorDemo = new IteratorDemo();
    }
}
