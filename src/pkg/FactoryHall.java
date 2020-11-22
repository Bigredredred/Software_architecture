package pkg;

public class FactoryHall implements Scene {
    private static FactoryHall Instance = new FactoryHall();

    public static FactoryHall getInstance(){
        return Instance;
    }

    private FactoryHall(){}
    @Override
    public void welcome() {
        System.out.println("Welcome to FactoryHall!");
    }
}
