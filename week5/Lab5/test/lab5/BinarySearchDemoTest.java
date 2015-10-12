/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab5;

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
public class BinarySearchDemoTest {
    
    public BinarySearchDemoTest() {
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
     * Test of main method, of class BinarySearchDemo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BinarySearchDemo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of binarySearch method, of class BinarySearchDemo.
     */
    @Test
    public void testBinarySearch() {
        System.out.println("binarySearch");
        int[] array = null;
        int key = 0;
        int expResult = 0;
    //    int result = BinarySearchDemo.binarySearch(array, key);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of myPow method, of class BinarySearchDemo.
     */
    @Test
    public void testMyPow() {
        System.out.println("myPow");
        int x = 3;
        int y = 0;
        int expResult = 1;
        //int result = BinarySearchDemo.myPow(x, y);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of myPowRecursive method, of class BinarySearchDemo.
     */
    @Test
    public void testMyPowRecursive() {
        System.out.println("myPowRecursive");
        int x = 3;
        int y = 0;
        int expResult = 1;
        int result = BinarySearchDemo.myPowRecursive(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
