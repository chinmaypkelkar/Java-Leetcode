package BinarySearchTree;

public class BST {
    public Node getRoot() {
        return root;
    }
    private Node root;

    public BST(){
        this.root = null;
    }

    public void insert(int value){
        root = insert_helper(root, value);
    }

    public Node insert_helper(Node node, int value){
        if(node == null){
            return new Node(value);
        }
        else if(value < node.value){
            node.left = insert_helper(node.left, value);
        }
        else if(value > node.value){
            node.right = insert_helper(node.right,value);
        }
        return node;
    }

    public void inorder(){
        inorder_helper(root);
    }

    public void inorder_helper(Node node){
        if(node == null){
            return;
        }
        inorder_helper(node.left);
        System.out.print(node.value + "->");
        inorder_helper(node.right);
    }

    public boolean search(int value){
        return search_helper(root, value);
    }

    public boolean search_helper(Node node, int value){
        if(node == null){
            return false;
        }
        if(node.value == value){
            return true;
        }

        return value < node.value ?
                search_helper(node.left, value) :
                search_helper(node.right, value);
    }

}
