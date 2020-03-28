
package problem1.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain {

    public static void main(String[] args) {

        MyBinarySearchTree bst = new MyBinarySearchTree();

        TreeNode root;

        root = new TreeNode(10);

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

        bst.leftView(root);
        System.out.println();
        bst.NodeWithOutLeftChild(root);

    }
}
