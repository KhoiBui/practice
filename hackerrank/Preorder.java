/* Do a pre-order traversal of a binary tree and print out the 
 * value in each node. */

public class Preorder {
    
    class Node {
        int data;
        Node left;
        Node right;
    }

    void Preorder(Node root) {
        // nothing to do
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }
}
