package org.example.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// BFS
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<List<Integer>> traversalOrder = new ArrayList<>();

        while(!queue.isEmpty()){
            int levelSize = queue.size();

            List<Integer> nodeValues = new LinkedList<>();
            for(int i =0;i<levelSize;i++){
                TreeNode current = queue.poll();

                nodeValues.add(current.val);

                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
            }
            traversalOrder.add(nodeValues);
        }
        return traversalOrder;
    }
}
