package Exercises.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphList {
    private int V;
    private int E;
    private final LinkedList<Integer>[] adj;

    public GraphList(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];

        for (int i = 0; i < nodes; i++) {
            this.adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int u, int v) {
        this.adj[u].add(v);
        this.adj[v].add(u);
        E++;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(V + " vertices, " + E + " edges\n");

        for (int v = 0; v < this.adj.length; v++) {
            str.append(v + ": ");
            for (int w : adj[v]) {
                str.append("--> " + w);
            }

            str.append("\n");
        }

        return str.toString();
    }

    public static void main(String[] args) {
        var graph = new GraphList(5);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(0,3);
        graph.addEdge(3,2);
        graph.addEdge(2,4);

        System.out.println(graph);
        graph.bfs(0);
    }

    public void bfs(int start) {
        boolean[] visited = new boolean[this.V];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            System.out.print(temp + " - ");

            for (int v = 0; v < this.V; v++) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.offer(v);
                }
            }
        }
    }
}
