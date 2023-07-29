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
    public void DirectGraph(Vertex source, Vertex var){
        validateVertex(source);
        validateVertex(var);

        list.get(source).add(var);
    }
}
