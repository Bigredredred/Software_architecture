package pkg;

import pkg.zhaoge.Context;
import pkg.zhaoge.events;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("查理来到庄严雄伟的巧克力工厂门口");
        System.out.println("门口的威利旺卡已经等候多时了");
        System.out.println("威利旺卡：欢迎参观我的巧克力工厂！");
        System.out.println(".........");
        System.out.println("工厂大厅剧情空缺");
        System.out.println(".........");
        //------------------------------------------------------------------------------------------------
        events.ExpressionEvent();
        //身份验证事件
        //------------------------------------------------------------------------------------------------
        //命令发起者实例--男孩查理
        Invoker Charlie = new Invoker();
        while(true){
            //男孩查理发出命令
            Charlie.setCommand();
        }
    }
}
