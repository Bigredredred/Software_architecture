package pkg;

import pkg.hzc.State.AirConditioner;
import pkg.hzc.State.CurrentState;
import pkg.hzc.State.HumidityController;
import pkg.zyl.Bridgepattern.Air_conditioner;
import pkg.zyl.Bridgepattern.TurnUp;
import pkg.zyl.Bridgepattern.humidityController;


public class HotCocoaFalls implements Scene{
    @Override
    public void welcome() {
        System.out.println("Welcome to HotCocoaFalls!");
        State();
    }

    public void State() {
        //厂长介绍这里的温度湿度控制器
        CurrentState currentState = new CurrentState();
        //温度
        currentState.setStemp("炎热");
        System.out.println("哎呀，刚加工完的热可可把整个楼层都变热了！");
        System.out.println("不过不要紧！我们有神奇的温度控制器！");
        System.out.println("我的上帝啊！它显示现在这层楼居然处于"+currentState.getStemp()+"状态！");
        //System.out.println("那么请看！");
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.doAction(currentState);
        System.out.println("---------------");

        //调用小赵的函数，输出提升功率的提示
        Air_conditioner air = new Air_conditioner();
        air.setOperation(new TurnUp());
        System.out.println(air.getName());

        System.out.println("---------------");
        currentState.setStemp("适宜");
        airConditioner.doAction(currentState);

        //湿度
        currentState.setShumi("潮湿");
        System.out.println("这个楼层很潮湿！不是吗？");
        System.out.println("没关系！我们还有奇妙的湿度控制器！");
        System.out.println("现在这层楼处于"+currentState.getShumi()+"状态！");
        HumidityController humidityController = new HumidityController();
        humidityController.Control(currentState);
        System.out.println("---------------");

        //调用小赵的函数，输出提升功率的提示
        humidityController humi = new humidityController();
        humi.setOperation(new TurnUp());
        System.out.println(humi.getName());

        System.out.println("---------------");
        currentState.setShumi("适宜");
        humidityController.Control(currentState);

        //巧克力河被抽出送到下一楼，谭杰
        //code
    }
}
