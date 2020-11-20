package pkg.zhaoge.Bridgepattern;

public class Air_conditioner extends Device{


    @Override
    public void excuteOperation(Operation operation) {

    }

    @Override
    public String getName() {
        return "空调"+this.operation.getOperationName();
    }


}
