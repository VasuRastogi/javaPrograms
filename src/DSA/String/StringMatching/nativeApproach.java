package DSA.String.StringMatching;

import javax.swing.text.AttributeSet;
import java.util.Hashtable;

public class nativeApproach {

    // Instead of making a hash table of my own I used ascii numbers
    // as it numbers each character by default.
    public static int nativeAlgo(String pattern, String string){
        int n = string.length();
        int m = pattern.length();
        int patternSum=0;
        for(int i =0; i<m; i++){
            patternSum += Character.getNumericValue(pattern.charAt(i));
        }
        int sum=0;
        for(int i =0; i<n; i++){
            for(int j = i; j<i+m; j++) {
                sum += Character.getNumericValue(string.charAt(j));
            }
            if(sum == patternSum)return i;
            else sum=0;
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "abdabeddfg";
        String pattern = "bed";
        System.out.println(nativeAlgo(pattern, str));
    }
}
