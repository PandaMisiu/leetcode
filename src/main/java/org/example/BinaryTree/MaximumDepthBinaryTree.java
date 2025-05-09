package org.example.BinaryTree;

public class MaximumDepthBinaryTree {

    public int maxDepth(TreeNode root) {
        if(root == null) return -1;

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return Math.max(lh,rh)+1;
    }

}
