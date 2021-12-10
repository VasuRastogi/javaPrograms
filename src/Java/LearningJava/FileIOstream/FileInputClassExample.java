package Java.LearningJava.FileIOstream;

import java.io.*;
import java.util.Arrays;


public class FileInputClassExample {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("/home/vasu/IdeaProjects/javaPrograms/src/com/company/inp.txt");
            FileOutputStream FO = new FileOutputStream("/home/vasu/IdeaProjects/javaPrograms/src/com/company/text.txt");
            int i, count=0;
            char[] save = new char[100];
            while ((i = fi.read())!=-1) {
                System.out.print((char) i);

                save[count]=(char)i;
                count++;

            }
            byte[]b2= Arrays.toString(save).getBytes();
            FO.write(b2);

        } catch (Exception e) {System.out.println(e);}
    }
}