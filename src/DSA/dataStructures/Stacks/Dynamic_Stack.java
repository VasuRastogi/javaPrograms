package DSA.dataStructures.Stacks;

public class Dynamic_Stack extends customStack{
    public Dynamic_Stack (){
        super();  // it will call customStack()
    }
    public Dynamic_Stack(int size){
        super(size);  // it will call customStack(int size)
    }
    @Override
    public boolean push(int item){
        if(this.isFull(myStack)){
            // double array size
            int[] temp = new int[myStack.length * 2];

            //copy all previous items in new data
            for (int i = 0; i< myStack.length; i++){
                temp[i] = myStack[i];
            }
            myStack = temp;
        }
        return super.push(item);
    }
}
