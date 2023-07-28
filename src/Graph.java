import java.util.*;
import java.awt.image.VolatileImage;

public class Graph<Vertex> {
    private Map<Vertex, List<Vertex>> list;

    public Graph(){
        list = new HashMap<Vertex, List<Vertex>>();
    }

    public void addVertex(Vertex vertex){
        list.put(vertex, new LinkedList<Vertex>());
    }

    public void addEdge(Vertex source, Vertex var){
        list.get(source).add(var);
        list.get(var).add(source);
    }
}
