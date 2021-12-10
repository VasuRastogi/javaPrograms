package DSA.dataStructures.LinkedLists;

public class doublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        } //default constructor
    }
    static Node head = null;
    static Node tail = null;

    public static void addData(int data){
        Node N = new Node(data);
        if(head == null){
            head = tail = N;
            head.prev = null;
            tail.next = null;
        }
        else {
            tail.next = N;
            N.prev = tail;
            tail = N;
            tail.next = null;
        }
    }
    public static void displayData(){
        Node Temp = head;
        while (Temp != null){
            System.out.print(Temp.data + "<=>");
            Temp = Temp.next;
        }
        System.out.print("END!");
    }
    public static void main(String [] args){
        addData(3);
        addData(4);
        addData(10);
        displayData();
    }
}
