package Java.testingJava;
import java.io.*;
import java.util.*;

public class Solution {
//    public String longestPrefix(String s) {
//        int i=0;
//        int j=s.length()-1;
//        char [] arr = new char[s.length()];
//        char [] output = new char[s.length()];
//        String Output="";
//
//        // let's initialize an array to store elements as s
//
////        for (int k = 0; k<s.length(); k++){
////            arr[k] = Character.toString(s.charAt(k));
////        }
//        arr = s.toCharArray();
//        // now we have all elements in an array.
//        // complexity would be n^2. (  :(  )
////        for(i = 0; i<arr.length; i++){
////            for (j = arr.length-1; j>=0; j--){
//        while(i<=j){
//            if(arr[i] == arr[j]){
//                output[i] = arr[i];
//                output[j] = arr[j];
//                i++;
//                j--;
//            }else{
//                j--;
//            }
//        }
//        int p =0;
//        ArrayList<Character> updated_output = new ArrayList<Character>();
//        for(int l =0; l<s.length();l++){
//            if(output[l] != 0){
//                updated_output.add(output[l]);
//                p++;
//            }
//        }
//
//        for (Character ch : updated_output)
//        {
//            Output += ch;
//        }
//        return Output;
//    }
    public String longestPrefix(String s){
        int i = 0;
        int j = (s.length()+1)/2;
        while(j>=i) {
            if (s.charAt(i) == s.charAt(j-1)) {
                i++;
                j++;
            }else{
                j = j-i+1;
                i = 0;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("s = ");
        String s = sc.nextLine();

        Solution so = new Solution();
        System.out.println(so.longestPrefix(s));
    }
}