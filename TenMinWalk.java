//codewars's problem 'Take a Ten Minute Walk' solution by (C) Vasu Rastogi.
/*
You live in the city of Cartesia where all roads are laid out in a perfect grid.
You arrived ten minutes too early to an appointment, so you decided to take the opportunity
to go for a short walk. The city provides its citizens with a Walk Generating App on their phones
-- everytime you press the button it sends you an array of one-letter strings representing
directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each letter
(direction) and you know it takes you one minute to traverse one city block,
so create a function that will return true if the walk the app gives you will take you
exactly ten minutes (you don't want to be early or late!) and will, of course,
return you to your starting point. Return false otherwise.

Note: you will always receive a valid array (string in COBOL) containing
a random assortment of direction letters ('n', 's', 'e', or 'w' only).
It will never give you an empty array (that's not a walk, that's standing still!).
*/
package javaPrograms;
class TenMinWalk {
    public static boolean isValid(char[] walk) {
        // Insert brilliant code here

        // laut fir ke starting point par aana hai
        // total steps 10 ho
        if(walk.length>10)return false;
        if(walk.length<=4)return false;
         
        int ns = 0;
        int ew = 0;
        for(int i = 0; i<walk.length; i++) {
            if (walk[i] == 'n') {
                ns = ns + 1;
            }
            if (walk[i] == 's') {
                ns = ns - 1;
            }
            if (walk[i] == 'e') {
                ew = ew + 1;
            }
            if (walk[i] == 'w') {
                ew = ew - 1;
            }
        }
        //now check if net is still 0;
        if(ns == 0 && ew == 0){return true;}
        else return false;
    }

    public static void main(String[] args) {
        char[]arr = new char[]{'e','n','w','n','w','s','s','s','e','n'};
        System.out.println(isValid(arr));
    }
}
