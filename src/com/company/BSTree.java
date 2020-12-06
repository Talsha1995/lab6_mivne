package com.company;

public class BSTree {
    private BSTreeNode root;
    public BSTree ( ){
        root = null;
    }
    public void insert ( int newKey ){ //check if tree is empty and insert to right place
        if (isEmpty()){
            root = new BSTreeNode(newKey, null, null);
            return;
        }
        insert_recursive(root, newKey);

    }

    public BSTreeNode retrieve ( int searchKey ){ //check if tree is not empty and return key if key is exist
        if (isEmpty()) return null;
        return retrieve_recursive(root, searchKey);
    }

    public void clear ( ){
        root = null;   // O(1).
    }

    public boolean isEmpty ( ){
        return (root == null);
    }
    public boolean isFull ( ){
        return false;
    }

    public String Preorder(){
        if (isEmpty()) return "";
        StringBuilder res= new StringBuilder();
        Preorder_recursive(root, res);
        return res.toString();
    }
    public String Inorder(){
        if (isEmpty()) return "";
        StringBuilder res= new StringBuilder();
        Inorder_recursive(root, res);
        return res.toString();
    }
    public String Postorder(){
        if (isEmpty()) return "";
        StringBuilder res= new StringBuilder();
        Postorder_recursive(root, res);
        return res.toString();
    }
    public int hieght(){
        return hieght_recursive(root);
    }

    private BSTreeNode insert_recursive(BSTreeNode node, int newKey ){
        if (node.getKey() == newKey) return node;
        if (node.getKey() > newKey){
            if (node.getLeft() == null){
                node.setLeft(new BSTreeNode(newKey, null ,null));
                return node.getLeft();
            }
            return insert_recursive(node.getLeft(), newKey);
        }
        else {
            if (node.getRight() == null){
                node.setRight(new BSTreeNode(newKey, null ,null));
                return node.getRight();
            }
            return insert_recursive(node.getRight(), newKey);
        }
    }

    private BSTreeNode retrieve_recursive(BSTreeNode node, int searchKey ){
        if (node.getKey() == searchKey) return node;
        if (node.getKey() > searchKey){
            if (node.getLeft() == null){
                return null;
            }
            return retrieve_recursive(node.getLeft(), searchKey);
        }
        if (node.getRight() == null){
            return null;
        }
        return retrieve_recursive(node.getRight(), searchKey);
    }

    private StringBuilder Preorder_recursive(BSTreeNode node, StringBuilder res){
        res.append(node.getKey());
        res.append(" ");
        if (node.getLeft() != null) Preorder_recursive(node.getLeft(), res);
        if (node.getRight() != null) Preorder_recursive(node.getRight(), res);
        return res;
    }

    private StringBuilder Inorder_recursive(BSTreeNode node, StringBuilder res){
        if (node.getLeft() != null) Inorder_recursive(node.getLeft(), res);
        res.append(node.getKey());
        res.append(" ");
        if (node.getRight() != null) Inorder_recursive(node.getRight(), res);
        return res;
    }
    private StringBuilder Postorder_recursive(BSTreeNode node, StringBuilder res){
        if (node.getLeft() != null) Postorder_recursive(node.getLeft(), res);
        if (node.getRight() != null) Postorder_recursive(node.getRight(), res);
        res.append(node.getKey());
        res.append(" ");
        return res;
    }

    private int hieght_recursive(BSTreeNode node){
        if(node.getRight() == null && node.getLeft() == null) return 0;
        if (node.getLeft() == null) return 1+hieght_recursive(node.getRight());
        if (node.getRight() == null) return 1+hieght_recursive(node.getLeft());
        return Math.max(1+hieght_recursive(node.getRight()), 1+ hieght_recursive(node.getLeft()));
    }

}

