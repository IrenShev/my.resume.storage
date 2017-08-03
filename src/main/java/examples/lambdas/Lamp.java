package examples.lambdas;

public class Lamp implements  ElectrisityConsumer {

    public void lightOn() {
        System.out.println("Лампа зажглась!");
    }

    @Override
    public void electicityOn() {
            lightOn();
    }
}
