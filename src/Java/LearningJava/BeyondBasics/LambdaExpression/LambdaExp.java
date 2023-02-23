package Java.LearningJava.BeyondBasics.LambdaExpression;
@FunctionalInterface      // means an interface that have only 1 method.
interface iff {
    void meth1();
}

// to implement this Functional interface we can use a class and then call its object.
// like
class cls implements iff{
    @Override
    public void meth1() {
        System.out.println("Hello from meth1 of iff interface called from cls class.");
    }
}
// To make this easy we can use lambda function whenever there is
public class LambdaExp {
    public static void main(String[] args) {
        cls obj = new cls();
        obj.meth1();


        // Lambda expression
        iff obj1 = ()->{
            System.out.println("via lambda");
        };
        obj1.meth1();


    }
}
