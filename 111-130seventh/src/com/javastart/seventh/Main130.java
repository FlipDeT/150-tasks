package com.javastart.seventh;

public class Main130 {
    Tree root;

    public int maxDepth(Tree root) {
        if(root==null)
            return 0;
        int left_Depth = maxDepth(root.left);
        int right_Depth = maxDepth(root.right);
        int bigger = Math.max(left_Depth, right_Depth);
        return bigger+1;
    }
    public static void main(String[] args) {
        Main130 tree = new Main130();
        tree.root = new Tree(100);
        tree.root.left = new Tree(10);
        tree.root.left.right = new Tree(0);
        tree.root.left.left = new Tree(1);
        tree.root.right = new Tree(20);
        tree.root.right.right = new Tree(0);
        tree.root.right.left = new Tree(2);

        System.out.println(tree.maxDepth(tree.root));
    }
}