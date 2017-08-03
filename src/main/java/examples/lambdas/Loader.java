package examples.lambdas;

public class Loader {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        Switcher sw = new Switcher(lamp,radio);
        sw.switchOn();
    }
}
