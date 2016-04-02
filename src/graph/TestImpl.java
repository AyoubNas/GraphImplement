public class TestImpl {

    public TestImpl() {

    }

    public static void main(String [] args) {
        //Graph g = new Graph();
        BetterVertex v1 = new BetterVertex(1);
        BetterVertex v2 = new BetterVertex(2);
        BetterVertex v3 = new BetterVertex(3);

        /*
            Will try :
            1 -> 2
            2 <-> 3
            3 -> 1
        */
        v1.addLinkToward(v2);
        v2.addLink(v3);
        v3.addLinkToward(v1);

        System.out.println("Voisins de v1 ;");
        v1.printNeighbor();
        System.out.println("");

        System.out.println("Voisins de v2 ;");
        v2.printNeighbor();
        System.out.println("");

        System.out.println("Voisins de v3 ;");
        v3.printNeighbor();
        System.out.println("");
    }
}