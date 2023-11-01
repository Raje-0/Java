package basic;

public class Tries {
	static class Node {
		Node[] children = new Node[26]; // 26 Alphabet
		boolean eow; // endOfWord

		public Node() {
			for (int i = 0; i < 26; i++) {
				children[i] = null;
			}
		}
	}

	public static Node root = new Node();

	// insert in tries

	public static void insert(String word) { // O(n)

		// int len = word.length();
		// int idx = 0;

		Node curr = root;
		for (int level = 0; level < word.length(); level++) {
			int idx = word.charAt(level) - 'a';
			if (curr.children[idx] == null) {
				curr.children[idx] = new Node();
			}
			curr = curr.children[idx];
		}
		curr.eow = true;
	}

	// search

	public static boolean search(String key) { // O(n)
		int level = 0;
		int len = key.length();
		int idx = 0;

		Node curr = root;
		for (; level < len; level++) {
			idx = key.charAt(level) - 'a';
			if (curr.children[idx] == null) {
				return false;
			}
			curr = curr.children[idx];
		}
		return curr.eow == true;
	}

	public static void main(String args[]) {
		String words[] = { "the", "a", "there", "their", "any", "thee" };
		for (String word : words) {
			insert(word);
			System.out.println("inserted " + word);
		}

		System.out.println("thee -> " + search("thee"));
		System.out.println("thor -> " + search("thor"));

		// System.out.println(startsWith("the"));
		// System.out.println(startsWith("thi"));
	}
}
