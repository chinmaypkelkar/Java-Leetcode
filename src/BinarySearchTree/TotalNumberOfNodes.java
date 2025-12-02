package BinarySearchTree;

public class TotalNumberOfNodes {
    int totalNumberOfNodes = 0;
    public void findTotalNumberOfNodes(Node node){
        if(node == null){
            return;
        }
        findTotalNumberOfNodes(node.left);
        totalNumberOfNodes++;
        findTotalNumberOfNodes(node.right);
    }
}
