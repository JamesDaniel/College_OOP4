/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author t00126681
 */
public class BinarySearchTreeTest {
    
    public BinarySearchTreeTest() {
    }
    
    @Test
    public void testContains() {
        System.out.println("contains");
        BinarySearchTree elements = new BinarySearchTree();
        elements.insert("c");
        elements.insert("d");
        elements.insert("b");
        
        
        
        boolean expResult = false;
        boolean result = elements.contains("a");
        assertEquals(expResult, result);
        
        expResult = true;
        result = elements.contains("b");
        assertEquals(expResult, result);
        
        expResult = true;
        result = elements.contains("d");
        assertEquals(expResult, result);
        
        expResult = false;
        result = elements.contains("e");
        assertEquals(expResult, result);
        
        expResult = true;
        result = elements.contains("c");
        assertEquals(expResult, result);
        
    }
    
}
