package org.example.BinaryTree;

public class CountCompleteTreeNodes {

    // O(n)
//    public int countNodes(TreeNode root) {
//        if(root == null) return 0;
//
//        return countNodes(root.left) + countNodes(root.right)+1;
//    }

    private int getDepth(TreeNode node, boolean goLeft){
        int depth = 0;

        while(node != null){

            depth++;
            node = goLeft ? node.left : node.right;
        }
        return depth;
    }

    public int countNodes(TreeNode root) {
        if(root == null) return 0;

        int leftDepth = getDepth(root, true);
        int rightDepth = getDepth(root, false);

        if(leftDepth == rightDepth){
            return (1<<leftDepth)-1;
        }
        else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }


}
