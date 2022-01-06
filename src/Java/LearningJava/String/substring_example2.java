/*
(C) Vasu Rastogi
-checking if a sting is a palindrome or not.
4_Jan_2022
*/

package Java.LearningJava.String;

import java.util.*;
import java.lang.String;

public class substring_example2 {
    static boolean isPalindrome(String str){

        int n = str.length();

        //check if zero or one digit ##__ always palindrome __##
        if(n == 0 || n == 1){
            return true;
        }
        char leftChar = str.charAt(0);
        char rightChar = str.charAt(n-1);

        if(leftChar == rightChar){
            return isPalindrome(str.substring(1, n-1));
        }
        // last one doesn't end up in 0 or 1. i.e. not a palindrome.
        return false;
    }
    public static void main(String[] args) {
        String st = "eye";
        System.out.print(isPalindrome(st));
    }
}
