/* #############
 * #  PROBLEM  #
 * #############
 *  
 * Given a binary tree, print the top view of the tree. The top view is
 * defined as the outer-most nodes
 *
 * example:
 *
 *       3
 *     /   \
 *   5       2
 *  / \     / \
 * 1   4   6   7
 *  \         /
 *   9       8
 *
 * The top view would return the nodes 1 5 3 2 7
 *
 * ##############
 * #  APPROACH  #
 * ##############
 *
 * Use recursion to do depth first search of left subtree and 
 * print the node once the bottom is reached. Do the same thing for the
 * right subtree except print the node as the tree is traversed so that
 * the order of the tree is preserved.
 *
 */

public class Topview {

    class Node {
        int data;
        Node left;
        Node right;
    } 

    void top_view(Node root) {
        if(root == null) {
            return;
        }
        get_left(root.left);
        // print root node
        System.out.print(root.data + " ");
        get_right(root.right);
    }

    void get_left(Node root) {
        if (root == null) {
            return;
        }
        get_left(root.left);
        System.out.print(root.data + " ");   
    }

    void get_right(Node root) {
        if (root == null) {
            return;
        }
        // print first to preserve order
        System.out.print(root.data + " ");
        get_right(root.right);
    }
}
