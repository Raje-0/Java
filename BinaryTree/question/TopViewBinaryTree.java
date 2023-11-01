package question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class Info {
    Node node;
    int horizontalDistance;

    public  Info (Node node, int horizontalDistance) {
        this.node = node;
        this.horizontalDistance = horizontalDistance;
    }
}

public class TopViewBinaryTree {
    public static void topView(Node root) {
        if (root == null) {
            return;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue< Info > queue = new LinkedList<>();
        queue.add(new  Info (root, 0));

        while (!queue.isEmpty()) {
        	 Info  currentNode = queue.poll();
            int horizontalDistance = currentNode.horizontalDistance;
            Node node = currentNode.node;

            if (!map.containsKey(horizontalDistance)) {
                map.put(horizontalDistance, node.data);
            }

            if (node.left != null) {
                queue.add(new  Info (node.left, horizontalDistance - 1));
            }

            if (node.right != null) {
                queue.add(new Info (node.right, horizontalDistance + 1));
            }
        }

        for (int key : map.keySet()) {
            System.out.print(map.get(key) + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Top view of the binary tree is:");
        topView(root);
    }
}


