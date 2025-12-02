package BinarySearchTree;

import javax.swing.tree.TreeNode;
import java.util.*;
import java.util.stream.Collectors;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        Map<Integer, List<Integer>> inputMap = new HashMap<>();
        levelOrder(inputMap, root,1);
        return new ArrayList<>(inputMap.values());
    }

    private void levelOrder(Map<Integer, List<Integer>> inputMap, Node root,
                            int level){
        if(root == null){
            return;
        }
        if(!inputMap.containsKey(level)){
            ArrayList<Integer> newList = new ArrayList<>();
            newList.add(root.value);
            inputMap.put(level, newList);
        }else{
            List<Integer> values = inputMap.get(level);
            values.add(root.value);
            inputMap.put(level, values);
        }
        levelOrder(inputMap, root.left,level + 1 );
        levelOrder(inputMap, root.right,level + 1 );
    }
}
