package com.company;
import java.io.*;
import java.io.Serializable;

class Student implements Serializable{
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
public class Solution {
    public static void main(String args[]) {
        try {
            Student s1 = new Student(211, "Vasu");
            FileOutputStream fout = new FileOutputStream("newtxt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("Done!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}