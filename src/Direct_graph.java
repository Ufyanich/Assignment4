import java.util.*;

public class Direct_graph<Vertex> {
    private Map<Vertex, List<Vertex>> list;


    public void DirectGraph(Vertex source, Vertex var){
        validateVertex(source);
        validateVertex(var);

        list.get(source).add(var);
    }
}
