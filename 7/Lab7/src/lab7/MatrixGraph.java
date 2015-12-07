package lab7;

import java.util.LinkedList;
import static java.util.OptionalDouble.empty;
import java.util.Queue;
import static javafx.scene.control.cell.ComboBoxTableCellBuilder.create;

/*****************************************************
*    Title: MatrixGraph.java
*    Author: Koffman and Wolfgang
*    Site owner/sponsor: wiley.com
*    Date: 21/04/2010
*    Code version:
*    Availability: http://eu.wiley.com/WileyCDA/WileyTitle/productCd-EHEP001607.html(Accessed November 2014)- Only available to Instructors
*    Modified:  No
*****************************************************/

public class MatrixGraph extends AbstractGraph {
    //entries in matrix are 1.0 or 0.0
    //1.0 indicates an edge.
    //0.0 indicates no edge
    
    private double[][] matrix;
    
    public MatrixGraph(int nV, boolean direct){
        super(nV, direct);
        matrix = new double[nV][nV];
        for (int row = 0; row < nV; row++)
            for (int col = 0; col < nV; col++)
                    matrix[row][col] = 0.0;        
    }

    public boolean isEdge(int source, int dest) {
        if(matrix[source][dest] > 0)
            return true;
        return false;
    }

    public void insert(Edge edge) {
        if (super.isDirected())
        {
            int row = edge.getSource(); // source
            int col = edge.getDestination(); // destination
            
            matrix[row][col] = 1.0;
        }
        else
        {
            int row = edge.getSource(); // source
            int col = edge.getDestination(); // destination
            
            matrix[row][col] = 1.0;
            matrix[col][row] = 1.0;
        }
        //complete this method
        // if graph is undirected, insert two edges
        // otherwise, insert just one edge  
    }

    public void remove(Edge edge) {
        //complete this method
        // as for insert method
        if (super.isDirected())
        {
            int row = edge.getSource(); // source
            int col = edge.getDestination(); // destination
            
            matrix[row][col] = 0;
        }
        else
        {
            int row = edge.getSource(); // source
            int col = edge.getDestination(); // destination
            
            matrix[row][col] = 0;
            matrix[col][row] = 0;
        }
    }
    
    public void breadthFirstTraversal(int start){
        //mark all vertices as not_visited
	
    }
    
    public void depthFirstTraversal(int start){
        //Output the vertices in depth first order
    }    
}
