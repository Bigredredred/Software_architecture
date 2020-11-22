package pkg;

public class ControlRoom implements Scene {
    private static ControlRoom Instance = new ControlRoom();

    public static ControlRoom getInstance(){
        return Instance;
    }

    private ControlRoom(){}
    @Override
    public void welcome() {
        System.out.println("Welcome to ControlRoom!");
    }
}
