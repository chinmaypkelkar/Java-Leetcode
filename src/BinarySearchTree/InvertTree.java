package BinarySearchTree;

import BinarySearchTree.Node;

public class InvertTree {
    public Node invertTree(Node root) {
        if(root == null){
            return root;
        }

        root.left = invertTree(root.left);
        root.right = invertTree(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
