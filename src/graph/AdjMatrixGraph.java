package graph;
import java.util.*;
import graph.*;

public class AdjMatrixGraph implements Graph{
	public boolean[][] adjacency;
    public Vertex[] vertice;
    public Edge[] edges;

    private void AdjMatrixGraph(){
		for(int i=0;i<50;i++){
            for (int j=0;j<50;j++){
                adjacency[i][j]=false;
            }
        }
	}

     public void addVertex(Vertex v){

        
    }

    public void  addEdge(Edge e){

    }

    public Edge[] adjascentEdges(Vertex v){}
    public boolean edgeIsInGaph(Vertex v)  {}
    public  Edge getEdgeBetween(Vertex source, Vertex dest){}
    public Edge[] getEdges(){}
    public Vertex[] getVertexes()    {}
    public boolean isAdjacent(Edge E1, Edge E2)  {}
    public void removeEdge(Edge edge)  {}
    public void removeVertex(Vertex vertex)  {}


    
}
