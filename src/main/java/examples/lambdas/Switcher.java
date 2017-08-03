package examples.lambdas;

public class Switcher {
    public ElectrisityConsumer consumer;

    public void switchOn(){
        System.out.println("Выключатель включен!");
        if (consumer != null){
            consumer.electicityOn();
        }
    }
}
