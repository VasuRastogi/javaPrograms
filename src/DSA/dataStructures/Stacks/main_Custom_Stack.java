package DSA.dataStructures.Stacks;

public class main_Custom_Stack {
    public static void main(String[] args) throws customStackException {
        customStack meriStack = new Dynamic_Stack(5);
        meriStack.push(5);
        System.out.print(meriStack.peek() + ", ");
        meriStack.push(4);
        System.out.print(meriStack.peek()+ ", ");
        meriStack.push(3);
        System.out.print(meriStack.peek()+ ", ");
        meriStack.push(2);
        System.out.print(meriStack.peek()+ ", ");
        meriStack.push(1);
        System.out.print(meriStack.peek()+"\n");

        //for checking dynamic stack
        meriStack.push(99);
        System.out.print(meriStack.peek()+"\n");

        System.out.println(meriStack.pop());
        System.out.println(meriStack.pop());
        System.out.println(meriStack.pop());
        System.out.println(meriStack.pop());
        System.out.println(meriStack.pop());
        System.out.println(meriStack.pop());
//        System.out.println(meriStack.pop());  /* Error "UNDERFLOW" */
    }
}
