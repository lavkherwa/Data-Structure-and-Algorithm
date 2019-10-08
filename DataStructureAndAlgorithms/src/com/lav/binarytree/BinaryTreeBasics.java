package com.lav.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;

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
 *  3. Vertical order traversal
 * 
 * */

public class BinaryTreeBasics {

	class Obj {
		public TreeNode node;
		public int distance;

		public Obj(TreeNode node, int distance) {
			this.node = node;
			this.distance = distance;
		}
	}

	public static class TraversalUtilBasics {

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

				postOrderTraversal(root.left);
				postOrderTraversal(root.right);

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
				 * preOrder - print while add
				 * inOrder - print while pop
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

		public static void verticalOrderTraversal(TreeNode root) {

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
				
				// Now print the values
				for (Integer key : result.keySet()) {
					List<TreeNode> nodes = result.get(key);
					for(TreeNode node: nodes) {
						System.out.print(node.data + " ");
					}
					System.out.println();
				}
			}
		}
	}

}
