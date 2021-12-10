package Java.LearningJava.FinalPracical;

public class Employee extends Person{
    double annualSalary;
    int year;
    String NationalInsuranceNo;

    public Employee(){annualSalary=0.0;   //Default constructor
                      year=0;
                      NationalInsuranceNo=null;
                      name=null;
    }
    public Employee(double annualSalary, int year, String NationalInsuranceNo, String name) { // parameterised constructor
        this.annualSalary = annualSalary;
        this.name=name;
        this.year=year;
        this.NationalInsuranceNo=NationalInsuranceNo;
    }
}
