package com.company;

public class BSTreeNode {
    private int key;
    private BSTreeNode left, right;

    public BSTreeNode(int key, BSTreeNode leftPtr, BSTreeNode rightPtr){
        this.key = key;    left = leftPtr;    right = rightPtr;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        if (this.key == key) return;
        this.key = key;
    }

    public BSTreeNode getLeft() {
        return left;
    }

    public void setLeft(BSTreeNode left) {
        if (this.left == left) return;
        this.left = left;
    }

    public BSTreeNode getRight() {
        return right;
    }

    public void setRight(BSTreeNode right) {
        if (this.right == right) return;
        this.right = right;
    }

    @Override
    public String toString() {
        return "key = " + key ;
    }
}
