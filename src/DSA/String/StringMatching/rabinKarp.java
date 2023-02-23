package DSA.String.StringMatching;

public class rabinKarp {
    // In RabinKarp we multiply character place with power of base
    // e.g. abc = a * 10^2 + b * 10^1 + c * 10^0
    // it takes care of character's positioning
    public static int rabinKarpAlgo(String Pattern, String str){
        int n = str.length();
        int m = str.length();

        // total ascii codes are 127,
        // so if we want to use algo for all characters
        // then we need to use 127 as the base.

        int hashValueSum = 0;
        for(int i=0; i<=n-m; i++){
            for (int j=i; j<i+m; j++){
//                hashValueSum+=;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        String str = "abdabeddfg";
        String pattern = "bed";
        System.out.println(rabinKarpAlgo(pattern, str));
    }
}
