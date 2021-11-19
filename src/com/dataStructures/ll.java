package com.dataStructures;

public class ll {

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    static Node head=null;
    static Node tail = null;
    public static void addData(int data){
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
    public static void displayData(){
        Node temp=head;
        if(head==null){
            System.out.println("List is empty :)");
        }
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }
    public static void main(String []args){
        addData(1);
        addData(2);
        addData(7);
        addData(9);
        addData(5);
        displayData();
    }
}
