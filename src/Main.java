import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        System.out.println("Addition of Vertexes");
        System.out.println();

        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        System.out.println("Edge between Vertexes");
        System.out.println();

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(1,3);

        System.out.println("Show of the Graph");
        System.out.println();

        graph.printGraph();

        System.out.println("Test of Remove method and check through Graph print");
        System.out.println();

        graph.removeEdge(0,3);

        graph.printGraph();
    }
}
