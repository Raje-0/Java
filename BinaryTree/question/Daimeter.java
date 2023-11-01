package question;

public class Daimeter {
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
	}

	public static int height(Node root) {
		if (root == null) {
			return 0;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}
//Diameter function
	public static int diameter(Node root) {
		if(root ==null) {
			return 0;
		}
		int leftDia=diameter(root.left);
		int leftHt= height(root.left);
		int rightDia=diameter(root.right);
		int rightHt= height(root.right);
		
		int selfDia = leftHt+rightHt+1;
		return Math.max(selfDia, Math.max(rightDia, leftDia));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Daimeter tree = new Daimeter();
		
	}

}
