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
        validateVertex(source);
        validateVertex(var);
        list.get(source).add(var);
        list.get(var).add(source);
    }

    private void validateVertex(Vertex index){
        if(!list.containsKey(index)){
            throw new IllegalArgumentException("Vertex " + index + " is out of range");
        }
    }

    public void removeEdge(Vertex source, Vertex var){
        if(!hasEdge(source, var)) {
            System.out.println("These two vertices do not have an edge");
            return;
        }
        list.get(source).remove(var);
        list.get(var).remove(source);
    }

    public boolean hasEdge(Vertex source, Vertex var){
        validateVertex(source);
        validateVertex(var);
        List<Vertex> neighbors = list.get(source);
        return neighbors != null && neighbors.contains(var);
    }

    public void DFS(Vertex startVertex){
        validateVertex(startVertex);

        Map<Vertex, Boolean> visited= new HashMap<Vertex, Boolean>();
        for(Vertex vertex : list.keySet()){
            visited.put(vertex, false);
        }
        DFS(startVertex, visited);
    }

    private void DFS(Vertex vertex, Map<Vertex, Boolean> visited){
        visited.put(vertex,true);
        System.out.print(vertex + " ");
        for(Vertex neighbor : list.get(vertex)){
            if(!visited.get(neighbor)){
                DFS(neighbor, visited);
            }
        }
    }
}
