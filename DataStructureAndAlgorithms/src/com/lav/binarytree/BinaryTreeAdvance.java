package com.lav.binarytree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.lav.binarytree.BinaryTreeBasics.Obj;

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

		/* Helper Function to keep map of all parent nodes */
		public static Map<TreeNode, TreeNode> getParentMap(TreeNode root) {

			Map<TreeNode, TreeNode> result = new HashMap<>();
			List<TreeNode> queue = new ArrayList<>();

			queue.add(root);
			result.put(root, null);

			while (queue.size() > 0) {

				TreeNode node = null;
				/* Add to the map and then pop */
				node = queue.get(0);
				queue.remove(0);

				/* Add children to queue again */
				/* Add parent and continue with next child */
				if (node.left != null) {
					result.put(node.left, node);
					queue.add(node.left);
				}
				if (node.right != null) {
					result.put(node.right, node);
					queue.add(node.right);
				}

			}

			return result;
		}

		/* Find all nodes kth distance from reference node */
		public static void findAllNodesKthDistanceFromReferenceNode(TreeNode root, TreeNode referenceNode, int k) {

			Map<TreeNode, TreeNode> parentMap = getParentMap(root);

			List<TreeNode> queue = new ArrayList<>();
			Set<TreeNode> visitedNodes = new HashSet<>();

			queue.add(referenceNode);
			visitedNodes.add(referenceNode);

			int level = 0;

			while (queue.size() > 0 && level != k) {

				int count = queue.size();

				/* Process all the queue items at current level */
				while (count > 0) {

					TreeNode node = queue.get(0);
					queue.remove(0);

					/*
					 * Evaluated not visited children and then add them to visited so that they won't
					 * be visited again
					 */
					if (node.left != null && visitedNodes.contains(node.left) == false) {
						queue.add(node.left);
						visitedNodes.add(node.left);
					}
					/*
					 * Evaluated not visited children and then add them to visited so that they won't
					 * be visited again
					 */
					if (node.right != null && visitedNodes.contains(node.right) == false) {
						queue.add(node.right);
						visitedNodes.add(node.right);
					}
					/*
					 * Evaluated not visited parent and then add them to visited so that they won't
					 * be visited again
					 */
					TreeNode pNode = parentMap.get(node);
					if (pNode != null && visitedNodes.contains(pNode) == false) {
						queue.add(pNode);
						visitedNodes.add(pNode);
					}

					count--;
				}

				level++;
			}

			/* Print all the items in the queue */
			for (TreeNode resultNode : queue) {
				System.out.print(resultNode.data + " ");
			}

		}
	}
}
