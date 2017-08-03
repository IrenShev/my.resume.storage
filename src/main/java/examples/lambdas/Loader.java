package examples.lambdas;

public class Loader {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        Switcher sw = new Switcher(lamp,radio);

        class Fridge implements ElectrisityConsumer{
            @Override
            public void electicityOn() {
                System.out.println("Холодильник делает холод!");
            }
        }

        sw.switchOn();
    }
}
