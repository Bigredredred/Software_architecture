package pkg;
import pkg.wck.Iterator.IteratorDemo;

public class ChocolateMakingWorkshop implements Scene {
    @Override
    public void welcome() {
        System.out.println("Welcome to ChocolateMakingWorkshop!");
        introduce();
    }

    public void introduce() {
        IteratorDemo iteratorDemo = new IteratorDemo();
    }
}
