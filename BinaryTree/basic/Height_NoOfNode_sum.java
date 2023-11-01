package basic;

public class Height_NoOfNode_sum {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree {
		static int idx = -1;

		public static Node buildTree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;
		}

		// height
		public static int height(Node root) {
			if (root == null) {
				return 0;
			}

			int leftHeight = height(root.left);
			int rightHeight = height(root.right);
			return Math.max(leftHeight, rightHeight) + 1;
		}

		// Count of Nodes of Tree

		public static int countOfNodes(Node root) {
			if (root == null) {
				return 0;
			}

			int leftNodes = countOfNodes(root.left);
			int rightNodes = countOfNodes(root.right);
			return leftNodes + rightNodes + 1;
		}

		// Sum of Nodes of Tree

		public static int sumOfNodes(Node root) {
			if (root == null) {
				return 0;
			}

			int leftSum = sumOfNodes(root.left);
			int rightSum = sumOfNodes(root.right);
			return leftSum + rightSum + root.data;
		}

	}

	public static void main(String args[]) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree = new BinaryTree();

		Node root = tree.buildTree(nodes);
		System.out.println(root.data);
	}

}
