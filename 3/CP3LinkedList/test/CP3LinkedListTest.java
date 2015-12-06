/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class CP3LinkedListTest {
    
    public CP3LinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addFirst method, of class CP3LinkedList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object element = null;
        CP3LinkedList<String> instance = new CP3LinkedList();
        instance.addFirst("Bob");
        instance.addFirst("Sue");
        
        String expResult = "Sue";
        String result = instance.getFirst();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class CP3LinkedList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        CP3LinkedList<String> instance = new CP3LinkedList();
        instance.addFirst("sally");
        //Object expResult = null;
        String expResult = "sally";
        String result = instance.getFirst();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class CP3LinkedList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        CP3LinkedList<String> instance = new CP3LinkedList();
        instance.addFirst("billy");
        String expResult = "billy";
        String result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class CP3LinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        CP3LinkedList<String> instance = new CP3LinkedList();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class CP3LinkedList.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        CP3LinkedList instance = new CP3LinkedList();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class CP3LinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        CP3LinkedList<String> instance = new CP3LinkedList();
        instance.addFirst("billy");
        instance.addFirst("bob");
        instance.addFirst("thornton");
        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of getLast method, of class CP£LinkedList.
     */
    @Test
    public void getLast() {
        System.out.println("getLast");
        CP3LinkedList<String> instance = new CP3LinkedList();
        instance.addFirst("billy");
        instance.addFirst("bob");
        instance.addFirst("thornton");
        String expResult = "billy";
        String result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
