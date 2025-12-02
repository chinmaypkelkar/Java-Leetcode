package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class ValidBST {
    public boolean isValidBST(Node root) {
        List<Integer> inorderList = new ArrayList<>();
        isValid(root, inorderList);
        for(int i = 0;i<inorderList.size(); i++){
            if(inorderList.get(i) >inorderList.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public void isValid(Node root,List<Integer> inorderList){
        if(root == null){
            return;
        }
        isValid(root.left, inorderList);
        inorderList.add(root.value);
        isValid(root.right, inorderList);
    }
}
