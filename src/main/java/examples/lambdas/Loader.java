package examples.lambdas;

public class Loader {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();

        //event subscribe
        sw.consumer = lamp;
        sw.switchOn();
    }
}
