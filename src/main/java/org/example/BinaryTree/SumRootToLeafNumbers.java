package org.example.BinaryTree;

public class SumRootToLeafNumbers {
    // NA STRINGACH 6ms
//    public int sumNumbers(TreeNode root) {
//        return sum(root, "");
//    }
//
//    public int sum(TreeNode node, String stringSum){
//
//        if(node == null) return 0;
//
//        stringSum+=node.val;
//        if(node.left == null && node.right == null){
//            return Integer.parseInt(stringSum);
//        }
//
//        return sum(node.left, stringSum) + sum(node.right, stringSum);
//    }

    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    public int sum(TreeNode node, int sum){

        if(node == null) return 0;

        sum*=10;
        sum+=node.val;
        if(node.left == null && node.right == null){
            return sum;
        }

        return sum(node.left, sum) + sum(node.right, sum);
    }
}
