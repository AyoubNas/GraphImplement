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

    public Edge[] adjascentEdges(Vertex v){return null;}
    public boolean edgeIsInGaph(Vertex v)  {return false;}
    public  Edge getEdgeBetween(Vertex source, Vertex dest){return null;}
    public Edge[] getEdges(){
	return this.edges;
    }
    public Vertex[] getVertexes()    {
	return this.vertice;
    }

    public boolean isAdjacent(Edge E1, Edge E2)  {
        return false;
	}
    public void removeEdge(Edge edge)  {
        Edge[] newEdges= new Edge[(edges.length)-1];
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
        edges=newEdges;
}

    public void removeVertex(Vertex vertex)  {
        
        Vertex[] newVertice= new Vertex[(vertice.length)-1];
        int i=0;
        int j=0;
        while (i<newVertice.length){
            if (edges[i].equals(vertex)) {
                newVertice[j]=vertice[i];
                i++;
                j++;
            }
            else i++;
        }
        vertice=newVertice;
    
    }


    
}
