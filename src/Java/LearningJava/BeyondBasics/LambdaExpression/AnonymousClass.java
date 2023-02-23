package Java.LearningJava.BeyondBasics.LambdaExpression;

interface demoInterface{
    void meth1();
    void meth2();
}

class demoClass implements demoInterface{

    @Override
    public void meth1() {
        System.out.println("meth1 declared class");
    }

    public void meth2() {
        System.out.println("meth2 declared class");
    }
}
public class AnonymousClass {

    // Defining & writing interface's methods without implementing actual class.
    demoInterface annonymousClass = new demoInterface() {
        @Override
        public void meth1() {
            System.out.println("meth1 anonymous class.");
        }

        @Override
        public void meth2() {
            System.out.println("meth2 anonymous class.");
        }
    };

    public static void main(String[] args) {
        demoClass dc = new demoClass();
        dc.meth1();
        dc.meth2();
        AnonymousClass ac = new AnonymousClass();
        ac.annonymousClass.meth1();
        ac.annonymousClass.meth2();
    }
}
