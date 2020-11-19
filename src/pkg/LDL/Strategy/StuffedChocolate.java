package pkg.LDL.Strategy;

public class StuffedChocolate implements Strategy{
    //策略之三，制作夹心巧克力
    @Override
    public int doChocolate(String chocType) {
        System.out.println("选择制作夹心巧克力");
        return 1;
    }
}
