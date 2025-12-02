package BinarySearchTree;

public class DeleteAllLeafNodesWithTargetValue {
    public Node deleteAllLeafNodesWithTargetValue(Node node, int value){
        if(node == null){
            return null;
        }

        if(node.value == value && node.left == null && node.right == null){
            return null;
        }
        node.left = deleteAllLeafNodesWithTargetValue(node.left, value);
        node.right = deleteAllLeafNodesWithTargetValue(node.right, value);
        return node;
    }
}
