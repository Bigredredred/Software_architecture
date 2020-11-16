package pkg;

public class GoToProductAssemblyWorkshop implements Command {
    @Override
    public void execute() {
        Lift MagicLift = new Lift();
        MagicLift.move(new ProductAssemblyWorkshop());
    }
}
