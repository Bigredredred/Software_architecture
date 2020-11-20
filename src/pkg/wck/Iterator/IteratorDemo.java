package pkg.wck.Iterator;

import pkg.zhaoge.ChainofResponsibility.ColorCheck;
import pkg.zhaoge.ChainofResponsibility.SizeCheck;
import pkg.zhaoge.ChainofResponsibility.WeightCheck;
import pkg.zhaoge.ChainofResponsibility.chocolategood;

public class IteratorDemo {
    public IteratorDemo (){
        ChocolateCase chocolateCase = new ChocolateCase();

        //正向检测
        for(Iterator iter = chocolateCase.getIterator(); iter.hasNext();){
            chocolategood choco = iter.next();
            new ColorCheck(choco).Handler();
            new SizeCheck(choco).Handler();
            new WeightCheck(choco).Handler();
        }

        System.out.println("小男孩不服");

        //反向检测
        for(Iterator iter1 = chocolateCase.getIterator(); iter1.hasLast();){
            chocolategood choco = iter1.last();
            new ColorCheck(choco).Handler();
            new SizeCheck(choco).Handler();
            new WeightCheck(choco).Handler();
        }

        System.out.println("小男孩服了");
    }
}
