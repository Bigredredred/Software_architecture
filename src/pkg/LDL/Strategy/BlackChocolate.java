package pkg.LDL.Strategy;

public class BlackChocolate implements Strategy{
    //策略之一，制作黑巧克力
    @Override
    public int doChocolate(String theType) {
        System.out.println("选择制作黑巧克力");
        return 1;
    }
}
