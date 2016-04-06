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
    public Edge[] getEdges(){
	return this.edges;
    }
    public Vertex[] getVertexes()    {
	return this.vertices;
    }

    public boolean isAdjacent(Edge E1, Edge E2)  {
        return false;
	}
	}
    public void removeEdge(Edge edge)  {
        Edge[(edges.length)-1] newEdges;
        int i=0;
        int j=0;
        while (i<newEdges.length){
            if (edges[i].equals(edge)) {
                newEdges[j]=edges[i];
                i++;
                j++;
            }
            else i++;
            }
        edge=newEdges;
}

    public void removeVertex(Vertex vertex)  {}


    
}
