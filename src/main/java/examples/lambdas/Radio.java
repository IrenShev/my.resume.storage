package examples.lambdas;

public class Radio implements ElectrisityConsumer {
    public void lightOn(){
        System.out.println("радио включено");
    }

    @Override
    public void electicityOn() {
        lightOn();
    }
}
