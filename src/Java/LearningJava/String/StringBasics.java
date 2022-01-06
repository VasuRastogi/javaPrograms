package Java.LearningJava.String;

import java.util.*;
import java.lang.String;

public class StringBasics {

    public static void main(String[] args) {
        String st1 = "vasu";       //String literal
        String st2 = "vasu";

        String St3 = new String("Hello");          //using new keyword
        String St4 = new String("Hello");

        System.out.println("----------");
        System.out.println(St3.charAt(0));   // charAt method

        System.out.println("----------");
        System.out.println(St3.length());    //length method
        System.out.println("----------");

        float arr = (float) 33.33;           // String.format method
        String.format("%53.2f ", arr );
        System.out.println(arr);

        System.out.println("----------");
        String str = String.format("%d", 1024);   // String.format method
        System.out.println(str);

        //BeginIndex()
        System.out.println("----------");
        String store = St3.substring(1); // substring(beginIndex, endIndex)
        System.out.println(store);


    }
}