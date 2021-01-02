package com.maolin.algorithm.binarytree;

import lombok.Data;

@Data
public class TreeNode {
    Integer data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(Integer val) {
        this.data = val;
    }
}
