/* extracting all names by surname  in  a string . */
package Java.LearningJava.String;

public class substring_example1 {
    public static void main(String[] args) {
        String str[] =
                {
                        "Praveen Kumar",
                        "Yuvraj Singh",
                        "Harbhajan Singh",
                        "Gurjit Singh",
                        "Virat Kohli",
                        "Rohit Sharma",
                        "Sandeep Singh",
                        "Milkha Singh"
                };

        String surName = "Kohli";
        int surNameSize = surName.length();

        int size = str.length;

        for(int j = 0; j < size; j++)
        {
            int length = str[j].length();
            // extracting the surname
            String subStr = str[j].substring(length - surNameSize); // aage ke (surname.length) characters.

            // checks whether the surname is equal to "Singh" or not
            if(subStr.equals(surName))
            {
                System.out.println(str[j]);
            }
        }

    }
}
