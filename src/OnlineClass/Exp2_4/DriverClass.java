package OnlineClass.Exp2_4;

import java.util.ArrayList;
import java.util.Scanner;

public class DriverClass extends Employee {

    public static void display() {
        for (int i =0; i<list.size();i++) {
            getEmp(list.get(i));
        }
    }
    public static void main(String[] args) {
        int input;
        do{
        System.out.println("Main Menu");
        System.out.println("1. Add an Employee");
        System.out.println("2. Display All");
        System.out.println("3. Exit");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter Employee Id: ");
                    int id = sc1.nextInt();
                    System.out.println("Enter Employee Name: ");
                    String name = sc2.nextLine();
                    System.out.println("Enter Employee Age: ");
                    int age = sc3.nextInt();
                    System.out.println("Enter Employee salary: ");
                    float salary = sc4.nextFloat();

                    Employee e = new Employee(id, age, salary, name);
                    list.add(e);

                    break;
                case 2:
                    System.out.println("----Report----");
                        display();
                        break;
                    }
        }while(input!=3);

    }
}
