package com.dataStructures;
public class linkedList{
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
    }
    static void insertFirst(int data){
        Node N = new Node(data);
        N.next = head;
        head=N;
    }
    static void insertLast(int data){
        Node N = new Node(data);
        tail.next=N;
        tail=N;
    }
    static void insertMid(int data, int index){
        Node N = new Node(data);
        Node temp = head;
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        N.next=temp.next;
        temp.next=N;
    }
    public static void main(String[]args){
        addData(1);
        addData(2);
        addData(3);
        addData(4);
        insertFirst(0);
        insertLast(5);
        insertMid(6,3);
        display();
    }
}