package Java.LearningJava.String;

import java.util.*;
import java.lang.String;

public class StringBasics {

    public static void main(String[] args) {
        String st1 = "vasu";       //String literal
        String st2 = "vasu";

        String St3 = new String("Hello");          //using new keyword
        String St4 = new String("Hello");

        System.out.println("-----charAt()-----");
        System.out.println(St3.charAt(0));   // charAt method

        System.out.println("-----length()-----");
        System.out.println(St3.length());    //length method

        System.out.println("-----String.format()-----");
        float arr = (float) 33.33;           // String.format method
        String.format("%53.2f ", arr );
        System.out.println(arr);

        System.out.println("-----String.format2()-----");
        String str = String.format("%d", 1024);   // String.format method
        System.out.println(str);

        //substring()
        System.out.println("-----substring()-----");
        String store = St3.substring(1); // substring(beginIndex, endIndex)
        System.out.println(store);

        // contains()
        System.out.println("-----contains()-----");
        String Sttt = "Vasu Rastogi";
        System.out.println(Sttt.contains("f"));  //output == true;

        // join()
        //join(CharSequence Delimiter, charSequence ....elements);
        //public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) //for arraylist.
        System.out.println("-----join()-----");
        String date = String.join("/", "26", "11", "2008");
        String data = String.join("*","A", "B", "C", "D");
        System.out.println(date);
        System.out.println(data);

        //equals()
        System.out.println("-----equals()-----");
        String s1="vasu";
        String s2="vasu";
        String s3="VASU";
        System.out.println(s1.equals(s2));//true because content and case is same
        System.out.println(s1.equals(s3));//false because case is not same

        //isEmpty()
        System.out.println("-----isEmpty()-----");
        String s="";           // even space is considered as non-empty.
        System.out.println(s.isEmpty());

        //concat()
        System.out.println("-----concat()-----");
        String S1 = "Java String is";
        S1.concat("not added");    // not added as not assigned.   /* IMP */
        System.out.println(S1);    // will print previous & above will not be concatenated.
        S1=S1.concat(" immutable(can't be changed back) so a clear assignment is required.");  /* IMP */
        System.out.println(S1);    // this will print concatenated string.

        //replace()
        //replace(char/charSequence old/target , char/charSequence new/replacement)
        System.out.println("-----replace()-----");
        String S2="Hello i am vasu Rastogi";
        S2=S2.replace("vasu" ,"Vasu");
        S2.replace("i" ,"I");  //not work    //explicit (i.e. clear) assignment is required here.
        System.out.println(S2);

        // equalsIgnoreCase(String str)
        System.out.println("-----equalsIgnoreCase()-----");
        String Ss = "VAsU";
        String Ss1 = "vaSu";
        System.out.println(Ss.equals(Ss1));         //false as it checks case too.
        System.out.println(Ss.equalsIgnoreCase(Ss1));  // true as case is ignored.

        System.out.println("-----split(String regex)-----");
        String re = "The quick brown fox jumped over a lazy dog.";
        String spp[] = re.split("\\s");   //  "\\s" is regex for space
        for(String i : spp){
            System.out.println(i);
        }

        //intern()
        System.out.println("-----intern()-----");
        String strr = new String ("1.Hello this was in heap as created from new but using intern it is now in string pool.");
        String strr1 = "2.This is in StringPool as it is created using String literal.";
        String neww = strr.intern();
        System.out.println(neww);
        System.out.println(strr1);

        System.out.println("-----intern()-----");
    }
}