package DSA.dataStructures.Queue;


public class QueueInLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        static Node head = null;
        static Node tail = null;

        public static void EnQueue(int data) {

            Node N = new Node(data);
            if (head == null) {
                head = tail = N;
            } else {
                tail.next = N; // purani tail
                tail = N;  // tail  == N so new tail.
            }
        }

        public static void DeQueue() {
            head = head.next;
        }

        public static void displayData() {
            Node Temp = head;
            while (Temp != null) {
                System.out.print(Temp.data + "<=>");
                Temp = Temp.next;
            }
            System.out.print("END!");
            System.out.println("");
        }

        public static int countData(){
            Node temp = head;
            int count = 0;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            return count;
        }
    }

    public static class Queue extends Exception{
        static int size;
        public Queue(int size){
            this.size=size;
        }
        public static void Enqueue(int data) {
            try {
                if (Node.countData() <= size) {
                    Node.EnQueue(data);
                } else {
                    throw new StackOverflowError();
                }
            }catch (Exception e){System.err.println(e);}
        }
        public static void Dequeue(){
            try {
                if (Node.countData() != 0)
                    Node.DeQueue();
                else throw new StackOverflowError();
            }catch(Exception e ){System.err.println(e);}
        }
        public static void display(){
            Node.displayData();
        }
    }
    public static void main(String[] args) {
        Queue q= new Queue(5);

        q.display();
        q.Dequeue();
        q.display();

    }
}

