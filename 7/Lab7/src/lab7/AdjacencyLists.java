package lab7;

/*****************************************************
*    Title: AdjacencyLists.java
*    Author: Koffman and Wolfgang
*    Site owner/sponsor: wiley.com
*    Date: 21/04/2010
*    Code version:
*    Availability: http://eu.wiley.com/WileyCDA/WileyTitle/productCd-EHEP001607.html(Accessed November 2014)- Only available to Instructors
*    Modified:  No
*****************************************************/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class AdjacencyLists extends AbstractGraph {

    private ArrayList<LinkedList<Edge>> adjacencyLists;

    public AdjacencyLists(int nv, boolean directed) {
        super(nv, directed);
        adjacencyLists = new ArrayList(nv);
        for (int i = 0; i < nv; i++) {
            //adjacencyLists.add(i, new LinkedList());
            adjacencyLists.add(new LinkedList());


        }
    }

    public boolean isEdge(int source, int dest) {
       //complete this method
        return false;
    }

    public void insert(Edge edge) {
        LinkedList lList = adjacencyLists.get(edge.getSource());
        lList.add(edge);
        if (!isDirected()) {
            Edge e = new Edge(edge.getDestination(), edge.getSource());
            lList = adjacencyLists.get(edge.getDestination());
            lList.add(e);
        }
    }

    public void remove(Edge edge) {
        // complete this method
    }
}
