package pkg;

public class Lift implements Scene, Move{
    private static Lift theLift = new Lift();
    @Override
    public void welcome() {
        System.out.println("Welcome to Lift, where would you like to go?");
    }
    public void move(Scene newScene)
    {
        newScene.welcome();
    }

    public static Lift getInstance(){
        return theLift;
    }
}
