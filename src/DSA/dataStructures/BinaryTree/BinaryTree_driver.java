package DSA.dataStructures.BinaryTree;
class Node {
    int data;
    Node left;
    Node right;
    Node parent;

    public Node(){};
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
        parent = null;
    }
}
class binaryTree{
    Node root = null;     //  If I use the equation like [Node root = new Node()] it will create a node with data == 0; that is not = null;)
    public binaryTree(){}
}
public class BinaryTree_driver {


    Node current = new Node();

    public void treeInsert(binaryTree T, Node n){
        Node y = null;
        current = T.root;
        while (current != null) {
            y = current;
            if (n.data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        n.parent = y;
        if(y == null) T.root = n;
        else if(y.data>n.data) y.left = n;
        else y.right = n;
    }

    public void inorderTreeTraversal(Node x){
        if(x != null){
            inorderTreeTraversal(x.left);
            System.out.print(x.data+", ");
            inorderTreeTraversal(x.right);
        }
    }public void preorderTreeTraversal(Node x){
        if(x != null){
            System.out.print(x.data+", ");
            preorderTreeTraversal(x.left);
            preorderTreeTraversal(x.right);
        }
    }public void postorderTreeTraversal(Node x){
        if(x != null){
            postorderTreeTraversal(x.left);
            postorderTreeTraversal(x.right);
            System.out.print(x.data+", ");
        }
    }

    public static void main(String[] args) {

        binaryTree t = new binaryTree();
        BinaryTree_driver T = new BinaryTree_driver();

        T.treeInsert(t, new Node(15));
        T.treeInsert(t, new Node(6));
        T.treeInsert(t, new Node(18));
        T.treeInsert(t, new Node(3));
        T.treeInsert(t, new Node(7));
        T.treeInsert(t, new Node(17));
        T.treeInsert(t, new Node(20));
        T.treeInsert(t, new Node(2));
        T.treeInsert(t, new Node(4));
        T.treeInsert(t, new Node(13));
        T.treeInsert(t, new Node(9));

        System.out.println("PreOrder");
        T.preorderTreeTraversal(t.root);

        System.out.println("\nInorder");
        T.inorderTreeTraversal(t.root);

        System.out.println("\nPostOrder");
        T.postorderTreeTraversal(t.root);



    }
}