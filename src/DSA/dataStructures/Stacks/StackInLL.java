package DSA.dataStructures.Stacks;
import java.util.EmptyStackException;
import java.util.Scanner;

/*
 * (CLRS Question.)Implement a Stack using a singly linked List L. The operation push and pop should take O(1) time.
 */
public class StackInLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    public static void AddData(int data) {

        Node N = new Node(data);
        if(head==null){
            head = tail = N;
        }else{
            tail.next = N; // purani tail
            N.prev = tail; // purani tail
            tail = N;  // tail  == N so new tail.
        }
    }
    public static void deleteTop(){
        Node N = new Node(9);
        tail = tail.prev;
        tail.next = null;
    }
    public static void displayData(){
        Node Temp = head;
        while (Temp != null){
            System.out.print(Temp.data + "<=>");
            Temp = Temp.next;
        }
        System.out.print("END!");
    }

    public static class StackinLL{
        static int size;
        static int top = -1;

        public StackinLL(int s){
            size = s;
        }
        public static void push(int data) {
            try {
                top++;
                if (top + 1 == size) {
                    throw new StackOverflowError();
                } else {
                    AddData(data);
                }
            }catch(Exception e){System.out.println(e);}

        }
        public static void pop(){
            try {
                top--;

                if (top == -1) {
                    throw new EmptyStackException();
                } else {
                    deleteTop();
                }
            }catch(Exception e ){System.out.println(e);}
        }
        public static void show(){
            displayData();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the stack: ");
        int size = sc.nextInt();

        StackinLL s = new StackinLL(size);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.show();
        s.pop();
        System.out.println("");
        s.show();
    }
}
