package org.example.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<List<Integer>> zigzagOrder = new LinkedList<>();

        int level = 0;
        while(!queue.isEmpty()){
            int levelSize = queue.size();

            List<Integer> nodeValues = new LinkedList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode current = queue.poll();

                nodeValues.add(current.val);

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            if(level%2==0){
                zigzagOrder.add(nodeValues);
            } else {
                zigzagOrder.add(nodeValues.reversed());
            }

            level++;
        }

        return zigzagOrder;
    }
}
