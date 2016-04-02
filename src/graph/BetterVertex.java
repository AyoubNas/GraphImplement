/**
 * Addition on basic Vertex class provided in graph.jar, allowing use of edges.
 */
import graph.*;

import java.util.ArrayList;

public class BetterVertex extends Vertex {
    private ArrayList<BetterVertex> listNeighbor = new ArrayList<BetterVertex>();
    private ArrayList<BetterVertex> listUndirectNeighbor = new ArrayList<BetterVertex>();

    public BetterVertex(int i) {
        super(i);
    }

    public void addLinkToward(BetterVertex v) {
       new DirectedEdge(new BetterVertex[] {this, v});
        listNeighbor.add(v);
        v.addLinkFrom(this);
    }

    public void addLinkFrom(BetterVertex v) {
        listUndirectNeighbor.add(v);
    }

    public void addLink(BetterVertex v) {
        new UndirectedEdge(new BetterVertex[] {this, v});
        listNeighbor.add(v);
        v.addNeighbor(this);
    }

    public void addNeighbor(BetterVertex v) {
        listNeighbor.add(v);
    }

    public ArrayList<BetterVertex> getNeighbor() {
        return listNeighbor;
    }

    public void printNeighbor() {
        for (BetterVertex vertex : listNeighbor) {
            System.out.println(vertex.getNum());
        }
    }
}
