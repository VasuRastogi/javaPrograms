package DSA.dataStructures.BinaryTree;

public class deletion {
    // let node to-be deleted is z.

    // There are three cases:
    // 1. If z is leaf node, then replace its parent's child with null.
    // 2. If z have only one child, replace its position by its child

    //                   (15)
    //             (6)         (18)
    //          (3)   (7)   (17)  (20)
    //        (2)

    // if 3 is to be deleted, then 2 will simply replace 3's location.
    //                   (15)
    //             (6)         (18)
    //          (2)   (7)   (17)  (20)

    // (Most Important)  3. If Z has 2 children, then we need to find z's successor
    //                      that is Y


    /*
       Successor of the Node x is the node with the smallest data greater than x.data.
       e.g. the smallest value greater than 15 is 17.

       "Successor is the leftmost element in the right subtree."
     */

    // now, if y is at z's immediate right, then just put z's parent as y's parent
    // if y lies in z's right subtree and not immediate right child then,
}
