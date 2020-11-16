package pkg;

public class GoToMaterialHandlingWorkshop implements Command {
    @Override
    public void execute() {
        Lift MagicLift = new Lift();
        MagicLift.move(new MaterialHandlingWorkshop());
    }
}
