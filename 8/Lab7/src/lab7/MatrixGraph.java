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
     int[] visitOrder; // visitOrder[i] = the i-th vertex to be visited in order.
     int visitCount;  // We will track visits with this counter.
     int numVertices;
     
     private boolean[] marked;    // marked[v] = is there an s-v path?
    private int count;           // number of vertices connected to s
    
    public MatrixGraph(int nV, boolean direct){
        super(nV, direct);
        numVertices = nV;
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
        //http://www.seas.gwu.edu/~simhaweb/alg/lectures/module7/examples/UndirectedBreadthFirstMatrix.java
        //mark all vertices as not_visited
        int visited[] = new int[numVertices];
        
        
        // create an empty queue 
        Queue<Integer> que = new LinkedList<Integer>();
        que.add(start);  //add to queue    
            
        //while not queue.empty do  
        while (!que.isEmpty())
        {
            // vertex := queue.dequeue()  // remove from queue
            int vertex = que.poll();
            
            if (visited[vertex] == 0)
                continue;
            
            visitCount++;
            visitOrder[vertex] = visitCount;
            
            for (int i = 0; i<numVertices; i++)
            {
                if (matrix[vertex][i] > 0 && (i != vertex))
                {
                    if (visitOrder[i] == -1)
                        que.add(i);
                }
            }
        }
    }
    //http://algs4.cs.princeton.edu/41graph/DepthFirstSearch.java.html
    public void depthFirstTraversal(int start){
        //Output the vertices in depth first order
        boolean marked[] = new boolean[numVertices];
        count = 0;
        dfs(start);
        
    }    
    private void dfs(int v)
    {
        count++;
        marked[v] = true;
        /*
        for (int w: this.adj(v)){
            if (!marked[w]){
                dfs(w);
            }
        }*/
    }
}
