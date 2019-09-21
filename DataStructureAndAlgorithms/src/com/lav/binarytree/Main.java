package com.lav.binarytree;

import com.lav.binarytree.BinaryTree.TraversalUtil;

public class Main {

	public static void main(String[] args) {

		TreeNode root = new TreeNode("1");
		root.left = new TreeNode("2");
		root.right = new TreeNode("3");
		root.left.left = new TreeNode("4");
		root.left.right = new TreeNode("5");

		System.out.println("\npre order result:");
		TraversalUtil.preOrderTraversal(root);

		System.out.println("\nin order result:");
		TraversalUtil.inOrderTraversal(root);

		System.out.println("\npost order result:");
		TraversalUtil.postOrderTraversal(root);
	}

}
