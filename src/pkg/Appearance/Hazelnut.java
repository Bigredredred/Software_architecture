package Appearance;
public class Hazelnut implements RawMaterial {
    private int nut;
    private int Nutshell;
    Hazelnut()
    {
        nut=0;
        Nutshell=0;
    }
    @Override
    public void product() {
        System.out.println("The squirrel opened the hazelnut and get the nuts \n");
        System.out.println("Strange nuts and shells plus one\n");
        this.nut++;
        this.Nutshell++;
    }

    @Override
    public void transportation() {
        System.out.println("The Hazelnut nuts are placed on a conveyor belt \n");
        this.nut--;
        this.Nutshell--;
    }

}
