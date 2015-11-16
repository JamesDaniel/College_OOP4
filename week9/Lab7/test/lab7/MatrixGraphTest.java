/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab7;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author t00126681
 */
public class MatrixGraphTest {
    
    @Test
    public void testInsert() {
        MatrixGraph graph = new MatrixGraph(5, true);
        Edge edge = new Edge(0, 1);
        graph.insert(edge);
        
        boolean actual = graph.isEdge(0, 1);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void testIsEdge() {
        MatrixGraph graph = new MatrixGraph(5, false);
        Edge edge = new Edge(3, 4);
        graph.insert(edge);
        
        boolean actual = graph.isEdge(4, 3);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void testRemove() {
        
        MatrixGraph graph = new MatrixGraph(5, true);
        Edge edge = new Edge(0, 1);
        graph.insert(edge);
        graph.remove(new Edge(0,1));
        
        boolean actual = graph.isEdge(0, 1);
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void testGraph1Directed() {
        MatrixGraph graph = new MatrixGraph(5, true);
        Edge edge = new Edge(0, 1);
        graph.insert(edge);
        edge = new Edge(0, 2);
        graph.insert(edge);
        edge = new Edge(0, 3);
        graph.insert(edge);
        edge = new Edge(1, 2);
        graph.insert(edge);
        edge = new Edge(2, 4);
        graph.insert(edge);
        
        
        boolean actual = graph.isEdge(0, 1);
        boolean expected = true;
        assertEquals(expected, actual);
        
        actual = graph.isEdge(0, 2);
        expected = true;
        assertEquals(expected, actual);
        
        actual = graph.isEdge(0, 3);
        expected = true;
        assertEquals(expected, actual);
        
        actual = graph.isEdge(1, 2);
        expected = true;
        assertEquals(expected, actual);
        
        actual = graph.isEdge(2, 4);
        expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void testGraph2Undirected() {
        MatrixGraph graph = new MatrixGraph(5, false);
        Edge edge = new Edge(0, 1);
        graph.insert(edge);
        edge = new Edge(0, 2);
        graph.insert(edge);
        edge = new Edge(0, 3);
        graph.insert(edge);
        edge = new Edge(1, 2);
        graph.insert(edge);
        edge = new Edge(2, 4);
        graph.insert(edge);
        
        
        boolean actual = graph.isEdge(0, 1);
        boolean expected = true;
        assertEquals(expected, actual);
        actual = graph.isEdge(1, 0);
        expected = true;
        assertEquals(expected, actual);
        
        actual = graph.isEdge(0, 2);
        expected = true;
        assertEquals(expected, actual);
        actual = graph.isEdge(2, 0);
        expected = true;
        assertEquals(expected, actual);
        
        actual = graph.isEdge(0, 3);
        expected = true;
        assertEquals(expected, actual);
        actual = graph.isEdge(3, 0);
        expected = true;
        assertEquals(expected, actual);
        
        actual = graph.isEdge(1, 2);
        expected = true;
        assertEquals(expected, actual);
        actual = graph.isEdge(2, 1);
        expected = true;
        assertEquals(expected, actual);
        
        actual = graph.isEdge(2, 4);
        expected = true;
        assertEquals(expected, actual);
        actual = graph.isEdge(4, 2);
        expected = true;
        assertEquals(expected, actual);
    }
    
}
