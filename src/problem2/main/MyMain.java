/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        problem2.main.Traversal t = new problem2.main.Traversal();

        MyBinarySearchTree bst = new MyBinarySearchTree();

        TreeNode root = new TreeNode(7);
        bst.insert(root, 5);

        bst.insert(root, 1);

        bst.insert(root, 15);

        bst.insert(root, 9);

        bst.insert(root, 7);

        bst.insert(root, 12);

        bst.insert(root, 30);

        bst.insert(root, 25);

        bst.insert(root, 40);

        bst.insert(root, 45);

        bst.insert(root, 6);

        bst.insert(root, 3);

        System.out.println("PreOrder Traversal");

        t.printPreorder(root);

        System.out.println();

        System.out.println("PostOrder Traversal");

        t.printPostorder(root);
    }
}
