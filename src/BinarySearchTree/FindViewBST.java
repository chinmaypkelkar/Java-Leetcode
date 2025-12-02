package BinarySearchTree;

public class FindViewBST {

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    int maxLevel = 0;

    public void findLeftView(Node node, int level){
        if(node == null){
            return;
        }

        // for each new level, we need to print first node
        if(maxLevel< level){
            System.out.print(node.value);
            maxLevel = level;
        }
        findLeftView(node.left, level+ 1);
        findLeftView(node.right, level + 1);
    }

    public void findRightView(Node node, int level){
        if(node == null){
            return;
        }

        if(maxLevel< level){
            System.out.print(node.value);
            maxLevel = level;
        }

        findRightView(node.right, level+ 1);
        findRightView(node.left, level + 1);
    }
}
