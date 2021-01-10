package com.maolin.algorithm.binarytree;

public class BinaryTreeTraversal {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.setLeftChild(new TreeNode(2));
        treeNode.leftChild.setLeftChild(new TreeNode(4));
        treeNode.leftChild.setRightChild(new TreeNode(5));
        treeNode.setRightChild(new TreeNode(3));

        System.out.println("PreOder: ");
        preOrderTraverse(treeNode);
        System.out.println("\nInOder: ");
        inOrderTraverse(treeNode);
        System.out.println("\nPostOder: ");
        postOrderTraverse(treeNode);
    }

    public static void preOrderTraverse(TreeNode node) {
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        preOrderTraverse(node.leftChild);
        preOrderTraverse(node.rightChild);
    }

    public static void inOrderTraverse(TreeNode node) {
        if(node == null){
            return;
        }
        inOrderTraverse(node.leftChild);
        System.out.print(node.data+" ");
        inOrderTraverse(node.rightChild);
    }

    public static void postOrderTraverse(TreeNode node) {
        if(node == null){
            return;
        }
        postOrderTraverse(node.leftChild);
        postOrderTraverse(node.rightChild);
        System.out.print(node.data+" ");
    }
}
