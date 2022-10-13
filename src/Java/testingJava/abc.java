package Java.testingJava;
import java.io.*;
import java.util.*;

class App {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        l.add(33);
        l.add(52);
        l.add(18);
        l.add(42);
        l.add(64);

        int minimum = Collections.min(l);
        int maximum = Collections.max(l);

        if (minimum == maximum) {
            System.out.println("elements are equal");
        }
        else {
            System.out.println("Min : "+ minimum);
            System.out.println("Max : "+ maximum);
        }
    }
}