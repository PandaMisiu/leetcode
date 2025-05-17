package org.example.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


// BFS
public class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null) return new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> avgSums = new LinkedList<>();
        queue.add(root);

        long sum = 0;
        while(!queue.isEmpty()){
            int levelSize = queue.size();

            for(int i =0 ; i<levelSize;i++) {
                TreeNode current = queue.poll();

                sum += current.val;

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            avgSums.add(sum/(double)levelSize);
            sum=0;
        }

        return avgSums;
    }
}
