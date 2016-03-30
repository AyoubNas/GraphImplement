import java.util.*;
package graph;

public class AdjMatrixGraph implements Graph{
	private LinkedList<LinkedList<Vertex>> adjacencyList= new LinkedList();

	private void addVertex(Vertex v){
		LinkedList<Vertex> l = new LinkedList();
		l.add(v);
		adjacencyList.add(l);
	}

	
}
