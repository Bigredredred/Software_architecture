package pkg.LDL.Strategy;

public class WhiteChocolate implements Strategy{
    //策略之二，制作白巧克力
    @Override
    public int doChocolate(String chocType) {
        System.out.println("选择制作白巧克力");
        return 1;
    }
}
