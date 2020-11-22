package pkg.Appearance;
public class Cacao implements RawMaterial{
    private int SomeWholeCocoaBeans;
    private int SomeCocoaBeanPowder;
    Cacao()
    {
        SomeWholeCocoaBeans=100;
        SomeCocoaBeanPowder=0;
    }
    @Override
    public void product() {
        System.out.println("The dwarf pours a lot of cocoa beans out of the bag. \n");
        System.out.println("The dwarf pours a lot of cocoa beans from the bag into the Shredders(粉碎机).\n");
        System.out.println("Strange Cocoa Bean Powder Increases");
        this.SomeWholeCocoaBeans--;
        this.SomeCocoaBeanPowder++;
    }

    @Override
    public void transportation() {
        System.out.println("Cacao powder is taken away in a cart.\n");
        this.SomeCocoaBeanPowder--;
    }
}
