package DSA.dataStructures.Stacks;

public class customStack {
    protected int[] myStack;
    private static final int DEFAULT_SIZE = 10;

    public customStack(){
        this(DEFAULT_SIZE); // will call constructor that is taking an integer.
    }
    public customStack(int size){
        this.myStack = new int[size];
    }

    int ptr = -1;
    public boolean push(int item){
         if(isFull(myStack) == true){
             System.out.println("Stack is full!!!");
             return false;
         }
         ptr++;
         myStack[ptr]=item;
         return true;
     }
    public boolean isFull(int[]stack){
        if(ptr == stack.length)
            return true;
        return false;
    }
    public boolean isEmpty(int []stack){
        if(ptr == -1)
            return true;
        return false;
    }
    public int pop() throws customStackException{
        if(isEmpty(myStack))
            throw new customStackException("UNDERFLOW");
        int removed = myStack[ptr];
        ptr--;
        return removed;
    }
    public int peek() throws customStackException{
        if(isEmpty(myStack))
            throw new customStackException("UNDERFLOW");
        return myStack[ptr];
    }
}