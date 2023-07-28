import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        //System.out.println("");

        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(1,3);

        graph.printGraph();

        graph.removeEdge(0,3);

        graph.printGraph();
    }
}
