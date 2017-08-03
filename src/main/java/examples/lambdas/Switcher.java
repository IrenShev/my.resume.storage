package examples.lambdas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Switcher {
    List<ElectrisityConsumer> consumers;

    public Switcher(ElectrisityConsumer ... consumers){
        this.consumers = Arrays.asList(consumers);
    }
    public Switcher(List<ElectrisityConsumer> consumers) {
        this.consumers = consumers;
    }

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
