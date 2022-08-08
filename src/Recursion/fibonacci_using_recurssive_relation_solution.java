package Recursion;
import java.lang.Math;

/*
  if we solve this linear recursive relation, we will get a relation:
  (1/Math.sqrt(5)) * Math.pow(((1+Math.sqrt(5))/2),n) - (1/Math.sqrt(5)) * Math.pow(((1-Math.sqrt(5))/2),n)
*/

public class fibonacci_using_recurssive_relation_solution {
    static double fib(double n){
        return (1/Math.sqrt(5)) * Math.pow(((1+Math.sqrt(5))/2),n) - (1/Math.sqrt(5)) * Math.pow(((1-Math.sqrt(5))/2),n);
    }

    public static void main(String[] args) {
        double o = fib(5);
        System.out.println((int)o);
    }
}
