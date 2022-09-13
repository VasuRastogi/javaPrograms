package OnlineClass.Example;

import java.util.ArrayList;

//    Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
public class example {

    // 1. for-loop
    public static void iterateF(ArrayList List) {
        System.out.println("Iteration using For loop");
        for (int i = 0; i < List.size(); i++) {
            System.out.print(List.get(i) + ", ");
        }
        System.out.println("");
    }
//    2. while -loop
    public static void iterateW(ArrayList List) {
        System.out.println("Iteration using While loop");
        int i = 0;
        while(i < List.size()) {
            System.out.print(List.get(i) + ", ");
            i++;
        }
        System.out.println("");
    }
//    3. Advance for loop
    public static void iterateE(ArrayList List) {
        System.out.println("Iteration using Enhanced For loop");
        for (Object i : List) {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        ArrayList<Integer> List= new ArrayList<Integer>();
        List.add(1);
        List.add(4);
        List.add(2);
        List.add(3);
        List.add(8);

        iterateF(List);
        iterateW(List);
        iterateE(List);
    }
}
