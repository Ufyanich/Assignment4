import java.util.*;
import java.awt.image.VolatileImage;

public class Graph<Vertex> {
    private Map<Vertex, List<Vertex>> list;

    public Graph(){
        list = new HashMap<Vertex, List<Vertex>>();
    }
}
