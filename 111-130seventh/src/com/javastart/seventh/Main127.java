package com.javastart.seventh;

public class Main127 {
    Tree root;
    Main127() {
        root = null;
    }
    public void print(Tree node) {

        if (node == null) {
            return;
        }
        print(node.left);
        print(node.right);
        System.out.println(node.head+" ");
    }

    void print () {
        print(root);
    }

    public static void main(String[] args) {
        Main127 tree = new Main127();
        tree.root = new Tree(100);
        tree.root.left = new Tree(10);
        tree.root.left.right = new Tree(0);
        tree.root.left.left = new Tree(1);
        tree.root.right = new Tree(20);
        tree.root.right.right = new Tree(0);
        tree.root.right.left = new Tree(2);

        tree.print();

    }
}