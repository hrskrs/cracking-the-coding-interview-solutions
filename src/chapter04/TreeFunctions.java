package chapter04;

import java.util.Queue;
import java.util.LinkedList;

/* I thought it'd be useful to make this class */
public class TreeFunctions {
	/* Creates and returns this Tree:
	 *          5
	 *        /   \
	 *       1    -3
	 *      /     / \
	 *     0     2   4
	 */
	public static TreeNode createTree(){
		TreeNode root = new TreeNode(5);
		root.addLeftChild(1);
		root.left.addLeftChild(0);
		root.addRightChild(-3);
		root.right.addLeftChild(2);
		root.right.addRightChild(4);
		return root;
	}
	
	/* Creates and returns this binary search tree:
	 *          5
	 *        /   \
	 *       1     8
	 *      /     / \
	 *     0     6   9
	 */
	public static TreeNode createBST(){
		TreeNode root = new TreeNode(5);
		root.addLeftChild(1);
		root.left.addLeftChild(0);
		root.addRightChild(8);
		root.right.addLeftChild(6);
		root.right.addRightChild(9);
		return root;
	}
	
	public static void printPreOrder(TreeNode node){
		if (node != null){
			System.out.print(node); // our toString() method will be invoked here
			printPreOrder(node.left);
			printPreOrder(node.right);
		}
	}
	
	public static void printInOrder(TreeNode node){
		if (node != null){
			printInOrder(node.left);
			System.out.print(node); // our toString() method will be invoked here
			printInOrder(node.right);
		}
	}
	
	public static void printPostOrder(TreeNode node){
		if (node != null){
			printPostOrder(node.left);
			printPostOrder(node.right);
			System.out.print(node); // our toString() method will be invoked here
		}
	}
	
	/* Prints tree level 0, 1, ... n */
	public static void printLevelOrder(TreeNode root){
		Queue<TreeNode> queue = new LinkedList<>(); // Queue is an interface, so we use LinkedList
		queue.add(root);
		while (! queue.isEmpty()){
			TreeNode curr = queue.remove();
			System.out.print(curr + " ");
			if (curr.left != null)
				queue.add(curr.left);
			if (curr.right != null)
				queue.add(curr.right);
		}
	}
}
