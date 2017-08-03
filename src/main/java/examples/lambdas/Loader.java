package examples.lambdas;

public class Loader {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        sw.addElListener(lamp);
        sw.addElListener(radio);
        //sw.addElListener(null);
        sw.switchOn();
    }
}
