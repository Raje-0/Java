package graph3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Graph {
	private int V;
	private List<Integer> adjList[];

	public Graph(int v) {
		V = v;
		adjList = new LinkedList[v];
		for (int i = 0; i < v; ++i) {
			adjList[i] = new LinkedList<>();
		}
	}

	public void addEdge(int v, int w) {
		adjList[v].add(w);
	}

	private int[] calculateInDegrees() {
		int[] inDegree = new int[V];

		for (int i = 0; i < V; ++i) {
			for (Integer neighbor : adjList[i]) {
				inDegree[neighbor]++;
			}
		}

		return inDegree;
	}

	public void topologicalSort() {
		int[] inDegree = calculateInDegrees();

		Queue<Integer> queue = new LinkedList<>();

		// Add vertices with in-degree 0 to the queue
		for (int i = 0; i < V; ++i) {
			if (inDegree[i] == 0) {
				queue.add(i);
			}
		}

		List<Integer> result = new ArrayList<>();

		// Process vertices in topological order
		while (!queue.isEmpty()) {
			int current = queue.poll();
			result.add(current);

			// Reduce in-degree of adjacent vertices
			for (Integer neighbor : adjList[current]) {
				inDegree[neighbor]--;
				if (inDegree[neighbor] == 0) {
					queue.add(neighbor);
				}
			}
		}

		// Check if the graph is a Directed Acyclic Graph (DAG)
		if (result.size() != V) {
			System.out.println("Graph has a cycle. Topological sorting is not possible.");
		} else {
			System.out.println("Topological Sorting: " + result);
		}
	}
}

public class TopologicalSortBFS {
	public static void main(String[] args) {
		int vertices = 6;
		Graph graph = new Graph(vertices);

		graph.addEdge(5, 2);
		graph.addEdge(5, 0);
		graph.addEdge(4, 0);
		graph.addEdge(4, 1);
		graph.addEdge(2, 3);
		graph.addEdge(3, 1);

		System.out.println("Topological Sort using BFS:");
		graph.topologicalSort();
	}
}
