package com.lav.binarytree;

import com.lav.binarytree.BinaryTreeAdvance.TraversalUtilAdvance;
import com.lav.binarytree.BinaryTreeBasics.TraversalUtilBasics;

public class Main {

	public static void main(String[] args) {

		TreeNode root = new TreeNode("1");
		root.left = new TreeNode("2");
		root.right = new TreeNode("3");
		root.left.left = new TreeNode("4");
		root.left.right = new TreeNode("5");

		/*----------------------BASICS--------------------------*/
		System.out.println("\nPre order traversal [recursive] result:");
		TraversalUtilBasics.preOrderTraversal(root);

		System.out.println("\n\nPre order traversal [iterative] result:");
		TraversalUtilBasics.preOrderTraversalIterative(root);

		System.out.println("\n\nIn order traversal [recursive] result:");
		TraversalUtilBasics.inOrderTraversal(root);

		System.out.println("\n\nIn order traversal [iterative] result:");
		TraversalUtilBasics.inOrderTraversalIterative(root);

		System.out.println("\n\nPost order traversal [recursive] result:");
		TraversalUtilBasics.postOrderTraversal(root);

		System.out.println("\n\nPost order traversal [iterative] result:");
		TraversalUtilBasics.postOrderTraversalIterative(root);

		System.out.println("\n\nLevel order traversal [recursive] result:");
		TraversalUtilBasics.levelOrderTraversal(root);

		System.out.println("\n\nVertical order traversal result:");
		TraversalUtilBasics.verticalOrderTraversal(root);
		/*----------------------BASICS--------------------------*/

		/////////////////////// BREAK //////////////////////////

		/*----------------------ADVANCE-------------------------*/
		System.out.println("\nHeight of tree is:");
		System.out.println(TraversalUtilAdvance.heightOfBinaryTree(root));

		System.out.println("\nNumber of nodes in given tree [recursive]:");
		System.out.println(TraversalUtilAdvance.numberOfNodesInBinaryTreeRecursive(root));

		System.out.println("\nNumber of nodes in given tree [iterative]:");
		System.out.println(TraversalUtilAdvance.numberOfNodesInBinaryTreeIterative(root));

		System.out.println("\nNumber of leaf nodes in given tree [iterative]:");
		System.out.println(TraversalUtilAdvance.noOfLeafNodesInBinaryTree(root));

		System.out.println("\nTop view of given tree [iterative]:");
		TraversalUtilAdvance.topViewOfBinaryTree(root);
		
		/*----------------------ADVANCE-------------------------*/
	}

}
