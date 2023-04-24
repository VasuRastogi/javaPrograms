package Java.LearningJava.BeyondBasics.LambdaExpression;
@FunctionalInterface      // means an interface that have only 1 method.
interface iff {
    void meth1(int a, int b);
}

// to implement this Functional interface we can use a class and then call its object.
// like
class cls implements iff{
    @Override
    public void meth1(int a, int b) {
        System.out.println("Hello from meth1 of iff interface called from cls class.");
    }
}
// To make this easy we can use lambda function whenever there is
public class LambdaExp {
    static int a = 3;
    static int b = 2;
    public static void main(String[] args) {
        cls obj = new cls();
        obj.meth1(a, b);


        // Lambda expression.
        iff obj1 = (a, b)->{
            System.out.println("via lambda");
        };
        obj1.meth1(a, b);

        // Can also use this form.
        iff d1 = (i, j) -> System.out.println("input done by lambda");
        d1.meth1(a, b);

    }
}
