package DSA.dataStructures.LinkedLists;

public class InterviewQuestionLinkedList {
    // making linked lists
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;
    static Node tail = null;

    static void addData(int data){
        Node N = new Node(data);
        if(head==null){
            head = N;
            tail = N;
        }
        else{
            tail.next = N;
            tail = N;
        }
    }
    static void showData() {
        Node temp = head;
        if (head == null){
            System.out.println("Empty list :( ");
        }
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
    }
        System.out.print("null");
    }

    //Inserting using recursion !!!


    public static void main(String []args){
        addData(5);
        addData(7);
        showData();
    }
}