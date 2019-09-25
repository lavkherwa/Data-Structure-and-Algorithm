package com.lav.binarytree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import com.lav.binarytree.BinaryTreeBasics.Obj;
import com.sun.javafx.collections.MappingChange.Map;

public class BinaryTreeAdvance {

	public static class TraversalUtilAdvance {

		public static int heightOfBinaryTree(TreeNode root) {

			/* HINT: post order traversal is useful in this case */
			int height = 0;
			if (root == null) {
				return height;

			} else {
				int leftHeight = heightOfBinaryTree(root.left);
				int rightHeight = heightOfBinaryTree(root.right);

				height = Math.max(leftHeight, rightHeight) + 1;
				return height;
			}
		}

		public static int numberOfNodesInBinaryTreeRecursive(TreeNode root) {

			/* HINT: post order traversal is useful in this case */
			int nodeCount = 0;
			if (root == null) {
				return nodeCount;
			} else {
				int leftCount = numberOfNodesInBinaryTreeRecursive(root.left);
				int rightCount = numberOfNodesInBinaryTreeRecursive(root.right);

				nodeCount = (leftCount + rightCount) + 1;

				return nodeCount;
			}
		}

		public static int numberOfNodesInBinaryTreeIterative(TreeNode root) {

			/* HINT: level order traversal is useful in this case */
			int nodeCount = 0;
			if (root == null) {
				return nodeCount;
			} else {
				List<TreeNode> queue = new ArrayList<>();

				/* Add root to queue and then keep adding children */
				queue.add(root);

				while (queue.size() > 0) {

					/* Take first element and remove from queue */
					TreeNode node = queue.get(0);
					queue.remove(0);

					nodeCount = nodeCount + 1;

					/* Add children to queue again */
					if (node.left != null) {
						queue.add(node.left);
					}
					if (node.right != null) {
						queue.add(node.right);
					}
				}

				return nodeCount;
			}
		}

		public static int noOfLeafNodesInBinaryTree(TreeNode root) {

			/* HINT: level order traversal is useful in this case */
			int nodeCount = 0;
			if (root == null) {
				return nodeCount;
			} else {

				List<TreeNode> queue = new ArrayList<>();

				/* Add root to queue and then keep adding children */
				queue.add(root);

				while (queue.size() > 0) {

					/* Take first element and remove from queue */
					TreeNode node = queue.get(0);
					queue.remove(0);

					/* count when both left and right child are absent */
					if (node.left == null && node.right == null) {
						nodeCount = nodeCount + 1;
					}

					/* Add children to queue again */
					if (node.left != null) {
						queue.add(node.left);
					}
					if (node.right != null) {
						queue.add(node.right);
					}
				}

				return nodeCount;
			}
		}

		public static void topViewOfBinaryTree(TreeNode root) {

			/* HINT: Use vertical order traversal */
			BinaryTreeBasics binaryTreeBasics = new BinaryTreeBasics();

			if (root == null) {
				return;
			} else {
				List<Obj> queue = new ArrayList<>();
				TreeMap<Integer, List<TreeNode>> result = new TreeMap<>();

				/* Add root to queue and also distance */
				queue.add(binaryTreeBasics.new Obj(root, 0));
				while (queue.size() > 0) {

					Obj element = queue.get(0);
					queue.remove(0);
					/* Check if already exists then update the list in map */
					if (result.containsKey(element.distance)) {
						result.get(element.distance).add(element.node);
					} else {
						List<TreeNode> list = new ArrayList<>();
						list.add(element.node);
						result.put(element.distance, list);
					}

					if (element.node.left != null) {
						queue.add(binaryTreeBasics.new Obj(element.node.left, element.distance - 1));
					}

					if (element.node.right != null) {
						queue.add(binaryTreeBasics.new Obj(element.node.right, element.distance + 1));
					}
				}

				// Now print the keys
				for (Integer key : result.keySet()) {
					List<TreeNode> nodes = result.get(key);
					/* Take the first element will give you the top view */
					System.out.print(nodes.get(0).data + " ");
				}
			}
		}

		public static void bottomViewOfBinaryTree(TreeNode root) {

			/* HINT: Use vertical order traversal */
			BinaryTreeBasics binaryTreeBasics = new BinaryTreeBasics();

			if (root == null) {
				return;
			} else {
				List<Obj> queue = new ArrayList<>();
				TreeMap<Integer, List<TreeNode>> result = new TreeMap<>();

				/* Add root to queue and also distance */
				queue.add(binaryTreeBasics.new Obj(root, 0));
				while (queue.size() > 0) {

					Obj element = queue.get(0);
					queue.remove(0);
					/* Check if already exists then update the list in map */
					if (result.containsKey(element.distance)) {
						result.get(element.distance).add(element.node);
					} else {
						List<TreeNode> list = new ArrayList<>();
						list.add(element.node);
						result.put(element.distance, list);
					}

					if (element.node.left != null) {
						queue.add(binaryTreeBasics.new Obj(element.node.left, element.distance - 1));
					}

					if (element.node.right != null) {
						queue.add(binaryTreeBasics.new Obj(element.node.right, element.distance + 1));
					}
				}

				// Now print the keys
				for (Integer key : result.keySet()) {
					List<TreeNode> nodes = result.get(key);
					/* Take the last element will give you the bottom view */
					if (nodes.size() > 0) {
						System.out.print(nodes.get(nodes.size() - 1).data + " ");
					}
				}
			}
		}

		public static void leftViewOfBinaryTree(TreeNode root) {
			/*
			 * HINT: level order traversal is useful, take all the max elements at each
			 * level
			 */
			if (root == null) {
				return;
			} else {

				List<TreeNode> queue = new ArrayList<>();

				/* Add root to queue and then keep adding children */
				queue.add(root);

				while (queue.size() > 0) {

					int count = queue.size();
					int countMax = queue.size();

					while (count > 0) {
						/* Take first element and remove from queue */
						TreeNode node = queue.get(0);
						queue.remove(0);

						/*
						 * Only print the first item in each iteration [level] countMax will gives us
						 * the first item fetch from the queue at each level
						 */
						if (count == countMax) {
							System.out.print(node.data + " ");
						}

						/* Add children to queue again */
						if (node.left != null) {
							queue.add(node.left);
						}
						if (node.right != null) {
							queue.add(node.right);
						}
						count--;
					}
					System.out.println();
				}
			}
		}

		public static void rightViewOfBinaryTree(TreeNode root) {
			/*
			 * HINT: level order traversal is useful, take all the max elements at each
			 * level
			 */
			if (root == null) {
				return;
			} else {

				List<TreeNode> queue = new ArrayList<>();

				/* Add root to queue and then keep adding children */
				queue.add(root);

				while (queue.size() > 0) {

					int count = queue.size();

					while (count > 0) {
						/* Take first element and remove from queue */
						TreeNode node = queue.get(0);
						queue.remove(0);

						/*
						 * Only print the last item in each iteration [level] 1 will gives us the last
						 * item fetch from the queue at each level
						 */
						if (count == 1) {
							System.out.print(node.data + " ");
						}

						/* Add children to queue again */
						if (node.left != null) {
							queue.add(node.left);
						}
						if (node.right != null) {
							queue.add(node.right);
						}
						count--;
					}
					System.out.println();
				}
			}
		}
	}
}
