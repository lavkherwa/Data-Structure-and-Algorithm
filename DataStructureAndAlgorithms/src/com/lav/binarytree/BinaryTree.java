package com.lav.binarytree;

import java.util.ArrayList;
import java.util.List;

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

		public static void levelOrderTraversal(TreeNode root) {
			if (root == null) {
				return;
			} else {

				List<TreeNode> queue = new ArrayList<>();

				/* Keep adding children */
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