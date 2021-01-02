package com.maolin.algorithm.binarytree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeTraversal {

    public static void main(String[] args) {
        LinkedList<Integer> vals = new LinkedList<Integer>();
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        vals.add(6);
        vals.add(7);
        vals.add(8);
        vals.add(9);
        vals.add(10);
        TreeNode treeNode = BinaryTreeUtils.generateBinaryTree(vals);
        preOrderTraverse(treeNode);
    }

    public static void preOrderTraverse(TreeNode node) {
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        preOrderTraverse(node.leftChild);
        preOrderTraverse(node.rightChild);
    }
}
