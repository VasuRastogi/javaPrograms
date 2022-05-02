package Java.LearningJava.Regex_Api;
import java.util.regex.*;
//The Java Regex or Regular Expression is an API to define a pattern for
// searching or manipulating strings.
public class Regex {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".s"); //
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        //could be written as
        //boolean b = Pattern.matches(".s", "as")
        boolean b1 = Pattern.matches("..s.", "vasu"); // pattern matches exactly.

        System.out.println(b);
        System.out.println(b1);
        System.out.println(Pattern.matches("[amn]", "ammma"));//false (m and a comes more than once)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "rrvasusr77"));//false (more than 6 char)
    }
}
