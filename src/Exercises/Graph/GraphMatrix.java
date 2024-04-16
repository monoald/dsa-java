package Exercises.Graph;

public class GraphMatrix {
    private int V;
    private int E;
    private final int[][] adjMatrix;

    public GraphMatrix(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public void addEdge(int u, int v) {
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1;
        E++;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append(V + " vertices, " + E + " edges" + "\n");

        for (int v = 0; v < V; v++) {
            string.append(v + ": ");
            for (int w : adjMatrix[v]) {
                string.append(w + " ");
            }
            string.append("\n");
        }

        return string.toString();
    }

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(3, 2);

        System.out.println(graph);
    }
}
