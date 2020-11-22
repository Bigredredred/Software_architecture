package pkg;

public class GoToColdStorage implements Command {
    @Override
    public void execute() {
        Lift MagicLift = new Lift();
        MagicLift.move(ColdStorage.getInstance());
    }
}
