package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

import java.util.Scanner;


public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree bst = new MyBinarySearchTree();
        MyQueue q = new MyQueue();
        TreeNode root;

        root = new TreeNode(10);

        bst.insert(root, 5);

        bst.insert(root, 1);

        bst.insert(root, 15);

        bst.insert(root, 3);

        bst.insert(root, 8);

        bst.insert(root, 12);

        bst.insert(root, 30);

        bst.insert(root, 25);

        bst.insert(root, 4);

        bst.insert(root, 55);

        bst.insert(root, 6);
        q.preOrder(root);
        q.queuePrint(q);
        System.out.println();

        System.out.print("Enter to find preorder Successor : ");

        q.printSuccessor(sc.nextInt());

    }
}