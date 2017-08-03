package examples.lambdas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Switcher {
    private List<ElectrisityConsumer> consumers;

    public Switcher(ElectrisityConsumer ... consumers){
        this(Arrays.asList(consumers));  //теперь так нельзя
        this.consumers = new ArrayList<>();
        for (ElectrisityConsumer ec: consumers) {
            this.consumers.add(ec);
        }
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
