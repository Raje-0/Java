package graph3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Graph1 {
	private int V;
	private List<Integer> adjList[];

	public Graph1(int v) {
		V = v;
		adjList = new LinkedList[v];
		for (int i = 0; i < v; ++i) {
			adjList[i] = new LinkedList<>();
		}
	}

	public void addEdge(int v, int w) {
		adjList[v].add(w);
	}

	public List<List<Integer>> findAllPaths(int source, int target) {
		List<List<Integer>> paths = new ArrayList<>();
		List<Integer> currentPath = new ArrayList<>();
		boolean[] visited = new boolean[V];

		findAllPathsDFS(source, target, visited, currentPath, paths);

		return paths;
	}

	private void findAllPathsDFS(int current, int target, boolean[] visited, List<Integer> currentPath,
			List<List<Integer>> paths) {
		visited[current] = true;
		currentPath.add(current);

		if (current == target) {
			paths.add(new ArrayList<>(currentPath));
		} else {
			for (Integer neighbor : adjList[current]) {
				if (!visited[neighbor]) {
					findAllPathsDFS(neighbor, target, visited, currentPath, paths);
				}
			}
		}

		// Backtrack
		visited[current] = false;
		currentPath.remove(currentPath.size() - 1);
	}
}

public class AllPathsDFS {
	public static void main(String[] args) {
		int vertices = 5;
		Graph1 graph = new Graph1(vertices);

		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 4);
		graph.addEdge(3, 4);

		int source = 0;
		int target = 4;

		List<List<Integer>> paths = graph.findAllPaths(source, target);

		System.out.println("All paths from " + source + " to " + target + ":");
		for (List<Integer> path : paths) {
			System.out.println(path);
		}
	}
}
