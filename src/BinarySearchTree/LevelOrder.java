package BinarySearchTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    /*public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        if(root == null){
            return output;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> levelNodes = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                levelNodes.add(node.val);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            output.add(levelNodes);
        }

        return output;

    }*/
}
