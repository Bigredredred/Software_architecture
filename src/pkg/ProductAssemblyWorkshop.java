package pkg;

public class ProductAssemblyWorkshop implements Scene {
    @Override
    public void welcome() {
        System.out.println("Welcome to ProductAssemblyWorkshop!");
        introduce();
    }

    public void introduce(){
        System.out.println("This used to be Mr. Ma Baoguo's martial arts training place, it's really, really amazing!");
    }
}
