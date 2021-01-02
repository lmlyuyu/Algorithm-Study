package com.maolin.algorithm.binarytree;

import java.util.LinkedList;

public class BinaryTreeUtils {

    public static TreeNode generateBinaryTree(LinkedList<Integer> list) {
        TreeNode node = null;
        if(list == null || list.isEmpty()){
            return null;
        }
        Integer data = list.removeFirst();
        if(data!=null){
            node = new TreeNode(data);
            node.leftChild = generateBinaryTree(list);
            node.rightChild = generateBinaryTree(list);
        }
        return node;
    }
}
