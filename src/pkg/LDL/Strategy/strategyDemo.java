package pkg.LDL.Strategy;

public class strategyDemo {
    public static void main(String[] args){
        strategyContext context=new strategyContext(new BlackChocolate());
        //选择了做黑巧克力的策略，然后实施该策略，进行巧克力的制作
        context.doStrategy("black chocolate");
    }
}
