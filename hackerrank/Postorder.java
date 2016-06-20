/* Given a binary tree, do a post-order traversal and print
 * out the values in each node. */

public class Postorder {

    class Node {
        int data;
        Node left;
        Node right;
    }

    void Postorder(Node root) {
        // do nothing
        if (root == null) {
            return;
        }
        // find children
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }
}


