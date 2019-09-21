package com.lav.binarytree;

import com.lav.binarytree.BinaryTree.TraversalUtil;

public class Main {

	public static void main(String[] args) {

		TreeNode root = new TreeNode("1");
		root.left = new TreeNode("2");
		root.right = new TreeNode("3");
		root.left.left = new TreeNode("4");
		root.left.right = new TreeNode("5");

		System.out.println("\npre order recursive result:");
		TraversalUtil.preOrderTraversal(root);

		System.out.println("\n\nin order recursive result:");
		TraversalUtil.inOrderTraversal(root);

		System.out.println("\n\nin order iterative result:");
		TraversalUtil.inOrderTraversalIterative(root);

		System.out.println("\n\npost order recursive result:");
		TraversalUtil.postOrderTraversal(root);

		System.out.println("\n\nlevel order recursive result:");
		TraversalUtil.levelOrderTraversal(root);
	}

}
