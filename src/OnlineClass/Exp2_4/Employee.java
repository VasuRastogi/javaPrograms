package OnlineClass.Exp2_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Employee {
    static ArrayList<Employee> list = new ArrayList<Employee>();
//    static ArrayList<Integer> list = new ArrayList<>();
    public static int EmpId;
    public static int Age;
    public static float salary;
    public static String name;
    public Employee(){}
    public Employee(int EmpId, int Age, float salary, String name){
        this.Age = Age;
        this.EmpId = EmpId;
        this.salary = salary;
        this.name = name;
    }

    public static void getEmp(Employee e){
        System.out.print(e.EmpId);
        System.out.print(" "+ e.name);
        System.out.print(" "+ e.Age);
        System.out.println(" "+ e.salary);
    }

}
