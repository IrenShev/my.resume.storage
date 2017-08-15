package examples.generic;

public class Loader2 {
    public static void main(String[] args) {
        BoxPrinterGeneric<Integer> value1 = new BoxPrinterGeneric<>(new Integer(10));
        System.out.println(value1);
        Integer intValue1 = value1.getValue();
        BoxPrinterGeneric<String> value2 = new BoxPrinterGeneric<>("Hello world");
        System.out.println(value2);
    }
}
class BoxPrinterGeneric<T> {
    private T val;

    public  BoxPrinterGeneric(T arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }
}
