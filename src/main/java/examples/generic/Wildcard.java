package examples.generic;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {
        List<?> numList = new ArrayList<Integer>();
        numList = new ArrayList<String>();
        List<? extends Number> numList1 = new ArrayList<Integer>();
       // numList1 = new ArrayList<String>(); - no compile
        numList1 = new ArrayList<Integer>();
        Number num = 1.0f;
//        public abstract class Number
//        extends Object
//        implements Serializable
// Byte, Double, Float, Integer, Long, Short, Serialized Form
    }
}
