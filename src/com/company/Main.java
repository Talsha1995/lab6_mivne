package com.company;

public class Main {

    public static void main(String[] args) {
        BSTree myTree = new BSTree();
        
        myTree.insert(2);
        myTree.insert(4);
        myTree.insert(7);
        myTree.insert(1);
        myTree.insert(5);
        myTree.insert(10);

        System.out.println(myTree.retrieve(5));
        System.out.println("Preorder: ");
        System.out.println(myTree.Preorder());
        System.out.println("Inorder: ");
        System.out.println(myTree.Inorder());
        System.out.println("Postorder: ");
        System.out.println(myTree.Postorder());
        System.out.println("hieght: ");
        System.out.println(myTree.hieght());

        }
}
