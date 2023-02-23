package Java.LearningJava.BeyondBasics.LambdaExpression;
@FunctionalInterface
interface Operation{

    //method providing definition of lambda expression
    public double calculations(double num1, double num2);                     //Line 1
}
public class InfosysExample {
        public static void main(String[] args) {

            //creating lambda expression
            Operation adder =  (double x, double y)-> x + y;                  //Line 2

            //executing lambda expression
            double result = adder.calculations(5, 6);                      //Line 3

            System.out.println(result);
        }
}
