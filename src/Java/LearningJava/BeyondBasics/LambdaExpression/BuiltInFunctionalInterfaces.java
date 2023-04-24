package Java.LearningJava.BeyondBasics.LambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaces {
    // Function – It represents a function that takes a single input parameter and returns a single value/object
    static Function<Integer, Integer> f1 = (oneInp)-> oneInp+8; //one output.

    // Predicate: It represents a function that takes a single value/object as a parameter, and returns true or false.
    static Predicate<Integer> P1 = (oneInp)->oneInp>8;   // outputs true or false.

    // Supplier – It represents a function that produces a value/an object without taking any input parameter.
    static Supplier<Integer> S1 = ()-> new Integer((int) (Math.random() * 100));

    // Consumer – It represents a function that consumes or processes a value/an object without returning anything.
    static Consumer<Integer> C1 = (p)-> System.out.println(p);


    public static void main(String[] args) {
        System.out.print(f1.apply(7));

    }
}
