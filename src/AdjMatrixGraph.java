import java.util.*;
package graph;

public class AdjMatrixGraph implements Graph{
	private LinkedList<LinkedList<Vertex>> adjacencyList= new LinkedList();

    private void addVertex(Vertex v){
		LinkedList<Vertex> l = new LinkedList();
		l.add(v);
		adjacencyList.add(l);
	}

    public void  addEdge(Edge e){
        Vertex v1=e.getExtremites()[0];
        Vertex v2=e.getExtremites()[1];
        LinkedList iterator;
        int i=0;
        boolean flag=False;
        while ((i<adjacencyList.size())&&(!flag)){
            iterator=get(i);
            if (iterator.getFirst().getNum()==v1.getNum()){
                iterator.add(v2);
                flag=True;
            }
        }

        if i=adjacencyList.size()

    }  

	
}
