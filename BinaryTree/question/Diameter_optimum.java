package question;

public class Diameter_optimum {
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

	static class Info {
		int dia;
		int ht;

		public Info(int dia, int ht) {
			this.dia = dia;
			this.ht = ht;
		}
	}

	public static Info diameter(Node root) {
		
		if(root==null) {
			return new Info(0, 0);
		}
		Info leftInfo = diameter(root.left);
		Info rightInfo = diameter(root.right);

		int dia = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht + rightInfo.ht + 1);
		int ht = Math.max(leftInfo.ht, rightInfo.ht);

		return new Info(dia, ht);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
