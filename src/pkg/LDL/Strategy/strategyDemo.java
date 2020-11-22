package pkg.LDL.Strategy;

public class strategyDemo {
    public void strategyEvent(){
        strategyContext contextBlack=new strategyContext(new BlackChocolate());
        //选择了做黑巧克力的策略，然后实施该策略，进行巧克力的制作
        contextBlack.doStrategy("black chocolate");
        strategyContext contextWhite=new strategyContext(new WhiteChocolate());
        //选择了做白巧克力的策略，然后实施该策略，进行巧克力的制作
        contextWhite.doStrategy("white chocolate");
        strategyContext contextStuffed=new strategyContext(new StuffedChocolate());
        //选择了做夹心巧克力的策略，然后实施该策略，进行巧克力的制作
        contextStuffed.doStrategy("stuffed chocolate");
    }
//    public static void main(String[] args){
//        strategyContext contextBlack=new strategyContext(new BlackChocolate());
//        //选择了做黑巧克力的策略，然后实施该策略，进行巧克力的制作
//        contextBlack.doStrategy("black chocolate");
//        strategyContext contextWhite=new strategyContext(new WhiteChocolate());
//        //选择了做白巧克力的策略，然后实施该策略，进行巧克力的制作
//        contextWhite.doStrategy("white chocolate");
//        strategyContext contextStuffed=new strategyContext(new StuffedChocolate());
//        //选择了做夹心巧克力的策略，然后实施该策略，进行巧克力的制作
//        contextStuffed.doStrategy("stuffed chocolate");
//    }
}
