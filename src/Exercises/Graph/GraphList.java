package Exercises.Graph;

import java.util.LinkedList;

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
        var graph = new GraphList(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(0,3);
        graph.addEdge(3,2);

        System.out.println(graph);
    }
}
