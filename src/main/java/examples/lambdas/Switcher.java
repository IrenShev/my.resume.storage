package examples.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    List<ElectrisityConsumer> consumers = new ArrayList<>();

    public void addElListener(ElectrisityConsumer listener){
        consumers.add(listener);
    }

    public void removeElListener(ElectrisityConsumer listener){
        consumers.remove(listener);
    }

    public void switchOn(){
        System.out.println("Выключатель включен!");
        for (ElectrisityConsumer ec: consumers) {
            ec.electicityOn();
        }
    }
}
