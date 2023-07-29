import java.util.*;

public class Direct_graph<Vertex> {

    public Direct_graph(){
        list = new HashMap<Vertex, List<Vertex>>();
    }
    private Map<Vertex, List<Vertex>> list;
    private void validateVertex(Vertex index){
        if(!list.containsKey(index)){
            throw new IllegalArgumentException("Vertex " + index + " is out of range");
        }
    }

    public boolean hasEdge(Vertex source, Vertex var){
        validateVertex(source);
        validateVertex(var);
        List<Vertex> neighbors = list.get(source);
        return neighbors != null && neighbors.contains(var);
    }
    public void DirectGraph(Vertex source, Vertex var){
        validateVertex(source);
        validateVertex(var);

        for (int i = 0; i < list.size(); i++){

        }

        list.get(source).add(var);
    }
}
