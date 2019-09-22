package com.lav.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*- Traversals
 * 
 * 1. DFT Depth first traversal
 *    a. PreOrder    {root, left, right}
 *    b. InOrder     {left, root, right}
 *    c. PostOrder   {left, right, root}
 *    
 *  2. BFT Breath first traversal
 *     a. Level order traversal
 * 
 * */

public class BinaryTree {

	public static class TraversalUtil {

		public static void preOrderTraversal(TreeNode root) {
			// root->left->right
			if (root == null) {
				return;
			} else {

				System.out.print(root.data + " ");

				preOrderTraversal(root.left);
				preOrderTraversal(root.right);
			}
		}

		public static void inOrderTraversal(TreeNode root) {
			// left->root->right
			if (root == null) {
				return;
			} else {

				inOrderTraversal(root.left);

				System.out.print(root.data + " ");

				inOrderTraversal(root.right);
			}
		}

		public static void postOrderTraversal(TreeNode root) {
			// left->right->root
			if (root == null) {
				return;
			} else {

				inOrderTraversal(root.left);
				inOrderTraversal(root.right);

				System.out.print(root.data + " ");
			}
		}

		public static void preOrderTraversalIterative(TreeNode root) {
			// root->left->right
			if (root == null) {
				return;
			} else {
				/*- NOTE: Main difference between pre and in order traversal iterative
				 * 
				 * inOrder - print while pop
				 * preOrder - print while add
				 * 
				 */
				Stack<TreeNode> stack = new Stack<>();

				TreeNode node = root;

				while (node != null || stack.size() > 0) {
					if (node != null) {
						stack.add(node); /* keep adding elements from left */
						System.out.print(node.data + " ");
						node = node.left; /* traverse left */
					} else {
						/* when there is no node left then pop and show */
						node = stack.pop();
						node = node.right; /* traverse right */
					}
				}
			}
		}

		public static void inOrderTraversalIterative(TreeNode root) {
			// left->root->right
			if (root == null) {
				return;
			} else {

				/*- NOTE: Main difference between pre and in order traversal iterative
				 * 
				 * inOrder - print while pop
				 * preOrder - print while add
				 * 
				 */
				Stack<TreeNode> stack = new Stack<>();

				TreeNode node = root;

				while (node != null || stack.size() > 0) {
					if (node != null) {
						stack.add(node); /* keep adding elements from left */
						node = node.left; /* traverse left */
					} else {
						/* when there is no node left then pop and show */
						node = stack.pop();
						System.out.print(node.data + " ");
						node = node.right; /* traverse right */
					}
				}
			}
		}

		public static void postOrderTraversalIterative(TreeNode root) {
			// left->right->root
			if (root == null) {
				return;
			} else {
				/* Same as preOrder, but here traverse right first and then left */
				Stack<TreeNode> stack = new Stack<>();
				Stack<TreeNode> result = new Stack<>();

				TreeNode node = root;

				while (node != null || stack.size() > 0) {
					if (node != null) {
						stack.add(node); /* keep adding elements from left */

						result.add(node); /* keep the result and later print reverse */
						// System.out.print(node.data + " ");
						node = node.right; /* traverse right */
					} else {
						/* when there is no node left then pop */
						node = stack.pop();
						node = node.left; /* traverse left */
					}
				}

				while (result.size() > 0) {
					TreeNode currentNode = result.pop();
					System.out.print(currentNode.data + " ");
				}
			}
		}

		public static void levelOrderTraversal(TreeNode root) {

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
						System.out.print(node.data + " ");

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
