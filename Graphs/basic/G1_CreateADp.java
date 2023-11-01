package basic;

import java.util.*;

public class G1_CreateADp {
	static class Edge {
		int src, dest, wt;

		public Edge(int s, int d, int w) {
			super();
			this.src = s;
			this.dest = d;
			this.wt = w;
		}

	}

//bfs
	public static void bfs(ArrayList<Edge> graph[]) {
		Queue<Integer> q = new LinkedList<>();
		boolean vis[] = new boolean[graph.length];
		q.add(0);

		while (!q.isEmpty()) {
			int curr = q.remove();
			if (!vis[curr] == false) { // visit current
				System.out.print(curr + " ");
				vis[curr] = true;

				for (int i = 0; i < graph[curr].size(); i++) {
					Edge e = graph[curr].get(i);
					q.add(e.dest);
				}
			}
		}
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int v = 5;
		ArrayList<Edge>[] graph = new ArrayList[5];
		for (int i = 0; i < v; i++) {
			graph[i] = new ArrayList<>();
		}

		// for 0 vertex
		graph[0].add(new Edge(5, 1, 5));

		// for 1 vertex
		graph[1].add(new Edge(1, 0, 5));
		graph[1].add(new Edge(1, 2, 1));
		graph[1].add(new Edge(1, 3, 3));

		// for 2 vertex
		graph[2].add(new Edge(2, 1, 1));
		graph[2].add(new Edge(2, 3, 1));
		graph[2].add(new Edge(2, 4, 2));

		// for 3 vertex
		graph[3].add(new Edge(3, 1, 3));
		graph[3].add(new Edge(3, 2, 1));

		// for 4 vertex
		graph[4].add(new Edge(4, 2, 2));

		// print 2's neighbor
		for (int i = 0; i < graph[2].size(); i++) {
			Edge e = graph[2].get(i);
			System.out.print(e.dest + " ");
		}

	}

}
