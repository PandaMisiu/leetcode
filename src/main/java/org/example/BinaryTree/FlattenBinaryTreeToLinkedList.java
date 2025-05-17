package org.example.BinaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class FlattenBinaryTreeToLinkedList {

    private List<TreeNode> preorder(TreeNode node, List<TreeNode> nodes) {
        if(node!=null)
        {
            nodes.add(node);
            preorder(node.left,nodes);
            preorder(node.right,nodes);
        }
        return nodes;
    }

    public void flatten(TreeNode root) {
        if(root == null) return;

        List<TreeNode> nodes = preorder(root,new ArrayList<>());

        for(int i =1;i<nodes.size();i++){
            TreeNode prev = nodes.get(i-1);

            prev.right = nodes.get(i);
            prev.left = null;
        }
    }
}
