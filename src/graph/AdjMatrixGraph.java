package graph;
import java.util.*;
import graph.*;

public class AdjMatrixGraph implements Graph{

    public boolean[][] adjacencyMatrix = new boolean[50][50];
    public Vertex[] vertice = new Vertex[50];
    public Edge[] edges = new Edge[50];
    public int lastVertex=-1;
    public int lastEdge = -1;

    public AdjMatrixGraph(){
        int i=0;
        int j=0;
        for(i=0;i<50;i++){
            for(j=0;j<50;j++){
                adjacencyMatrix[i][j]=false;
            }
        }
    }

     public void addVertex(Vertex v){
     	int i=0;
        vertice[lastVertex+1]=v;
        lastVertex++;

        for(i=0;i<=lastVertex;i++){

        	adjacencyMatrix[i][lastVertex]=false;
        	adjacencyMatrix[lastVertex][i]=false;
        }        
    }

    public void  addEdge(Edge e){
	Vertex source=e.getExtremites()[0];
	Vertex dest=e.getExtremites()[1];
	int d=-1;
	int s=-1;
	int i=0;

        edges[lastEdge+1]=e;
        lastEdge++;
        
         for(i=0;i<lastVertex;i++){
		    if (vertice[i].equals(source)){
			    s=i;
		    }
		    if (vertice[i].equals(dest)){
			    d=i;
		    }
	    }
	    
	    adjacencyMatrix[s][d]=true;
	    if (e instanceof UndirectedEdge){
	        adjacencyMatrix[d][s]=true;
	    }
	 
	 

    }



    public Edge[] getEdges(){
	return this.edges;
    }
    public Vertex[] getVertexes()    {
	return this.vertice;
    }

  
    public void removeEdge(Edge edge)  {
	int i=0;
	boolean flag=false;
	Edge e=null;
	Vertex source=null;
	Vertex dest=null;
	int d=-1;
	int s=-1;

	while((i<=lastEdge)&&(!flag)){
	    if (edges[i].equals(edge)){
		flag=true;
		e=edges[i];
		
	    }
	    else{
		i++;
	    }
	}
	while(i<lastEdge){
	    edges[i]=edges[i+1];
		i++;
	}
	lastEdge--;

	if (e!=null){
	    source=e.getExtremites()[0];
	    dest=e.getExtremites()[1];
	    for(i=0;i<lastVertex;i++){
		if (vertice[i].equals(source)){
			s=i;
		}
		if (vertice[i].equals(dest)){
			d=i;
		}
	    }
	    adjacencyMatrix[s][d]=false;
		    if(edge instanceof UndirectedEdge){
		        adjacencyMatrix[d][s]=false;
		    }
	}

	    
}

    public void removeVertex(Vertex vertex)  {
        int i=0;
        int v=-1;
        boolean flag=false;
        int j=0;
        for(i=0;i<=lastVertex;i++){
			if (vertice[i].equals(vertex)){
				v=i;
			}
		}
		i=0;                                                                                 
		for (i=v;i<lastVertex;i++){
			vertice[i]=vertice[i+1];			        
		}

		
		for(i=v;i<=lastVertex;i++){
			for(j=0;j<=lastVertex;j++){
				adjacencyMatrix[i][j]=adjacencyMatrix[i+1][j];
			} 
		}

		for(i=v;i<=lastVertex;i++){
			for(j=0;j<=lastVertex;j++){
				adjacencyMatrix[i][j]=adjacencyMatrix[i][j+1];
			} 
		}


    lastVertex--;    
    }


	public boolean isAdjacent(Edge E1, Edge E2)  {
	
        return ((E1.getExtremites()[0].equals(E2.getExtremites()[1])^(E1.getExtremites()[1].equals(E2.getExtremites()[0]))));
	}

    public Edge[] adjascentEdges(Vertex v){
    	return null;
    }
    
    public boolean edgeIsInGaph(Vertex v)  {
    	return false;
    

    }
    
    public  Edge getEdgeBetween(Vertex source, Vertex dest){
    
        int i=0;
        boolean flag=false;
        Edge res=null;
        while( (i<edges.length) && (!flag)) {
            if ( (edges[i]) instanceof DirectedEdge){
                if((edges[i].getExtremites()[0].equals(source))&&((edges[i].getExtremites()[1].equals(dest)))){
                    flag=true;
                    res=edges[i];
                }
            }
            else if (((edges[i].getExtremites()[0].equals(source))&&((edges[i].getExtremites()[1].equals(dest)))^(edges[i].getExtremites()[0].equals(dest))&&((edges[i].getExtremites()[1].equals(source))))){
                flag=true;
                res=edges[i];
            }
            i++;
        }
        return res;
    }

    
}

