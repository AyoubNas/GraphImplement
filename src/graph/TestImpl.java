package graph;
import graph.*;
import java.util.*;


public class TestImpl {
    public static void main(String[] args) {
        AdjMatrixGraph g = new AdjMatrixGraph();
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);
        g.addVertex(v5);

        Vertex[] vert=new Vertex[2];
        vert[0]=v1;
        vert[1]=v2;
        Edge e1 = new DirectedEdge(vert);
        vert[0]=v2;
        vert[1]=v4;
        Edge e2 = new UndirectedEdge(vert);
        vert[0]=v5;
        vert[1]=v1;
        Edge e3 = new DirectedEdge(vert);
        vert[0]=v3;
        vert[1]=v5;
        Edge e4 = new UndirectedEdge(vert);
        g.addEdge(e1);
        g.addEdge(e2);
        g.addEdge(e3);
        g.addEdge(e4);
        afficheMat(g);
    }

    private static void afficheMat(AdjMatrixGraph g){
        for(int i=0;i<=g.getLastVertex();i++){
            for(int j=0;j<=g.getLastVertex();j++){
                System.out.print(g.adjacencyMatrix[i][j]);
            }
            System.out.print("\n");
        }
    }
}
