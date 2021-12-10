package Java.LearningJava.FinalPracical;

public class TestEmployee extends Employee {
    public static void main(String []args){

        // Initializing Employee objects using constructor of Employee.
        Employee Emp1 = new Employee(90000,2011,"IEASSFU","Mr.ONE");
        Employee Emp2 = new Employee(100000,2014,"OEADAF","Mr.TWO");
        Employee Emp3 = new Employee(80000,2015,"FSADFL","Mr.THREE");
        Employee Emp4 = new Employee(45000,2021,"VDGJSD","Mr.FOUR");

        System.out.println("*********************");

        //printing name & Insurance no
        System.out.println(Emp1.name+" | "+Emp1.NationalInsuranceNo);
        //printing emp4's name & Salary
        System.out.println(Emp4.name+" | "+Emp4.annualSalary);

        System.out.println("*********************");
    }
}
