package DSA.dataStructures.LinkedLists;
public class reversing_LL{
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    static Node head=null;
    static Node tail=null;

    static void addData(int data){
        Node N1 = new Node(data);
        if(head==null){
            head=N1;
            tail=N1;
        }
        else{
            tail.next=N1;
            tail=N1;
        }
    }
    static void display(){
        Node temp=head;
        if(head==null){
            System.out.println("List is empty :)");
        }
        while (temp!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END!");
    }static void display(Node h){
        Node temp=h;
        if(h==null){
            System.out.println("List is empty :)");
        }
        while (temp!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END!");
    }
    public static Node reverse(){
        Node current = head;
        Node prev = null;
        Node temp = null;

        while(current!=null){
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
    public static void main(String[]args){
        addData(1);
        addData(2);
        addData(3);
        addData(4);
        display();
        System.out.println("");
        display(reverse());

    }
}