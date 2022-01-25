package Java.LearningJava.String;

public class StringComparison {
    /*
     * for authentication :- .equals();
     * for Sorting :- .compareTo();
     * for reference matching :- (==);
    */
    public static void main(String[] args) {
        String S1 = "Vasu";
        String S2 = "Vasu";
        String S3 = "Rastogi";

        // equals() method.
        System.out.println(S1.equals(S2)); //true
        System.out.println(S1.equals(S3)); //false

        // compareTo() method.
        /*
        * s1 == s2 : The method returns 0.
        * s1 > s2 : The method returns a positive value.
        * s1 < s2 : The method returns a negative value.
        */
        System.out.println(S1.compareTo(S2)); //0
        System.out.println(S1.compareTo(S3)); //1 or any positive value

        // ( == )
        System.out.println(S1 == S2);  // true
        // as string pool does not create another objects with same value and does reference to same object if values are same.

    }
}
