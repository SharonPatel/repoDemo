/*
 * Name: Sharon Patel
 * Student Id: 991503002
 * System10199 - Web Programming
 */
package ca.sheridancollege.project;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sharon
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
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
     * Test of main method, of class GroupOfCards.
     */
    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        GroupOfCards.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of showCards method, of class GroupOfCards.
//     */
//    @Test
//    public void testShowCards() {
//        System.out.println("showCards");
//        GroupOfCards instance = null;
//        Card expResult = null;
//        Card result = instance.showCards();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of showCard method, of class GroupOfCards.
     */
    
   
    public void testShowCard() {
        System.out.println("showCardGoodtest");
        int no = 4;
        boolean expResult = true;
        boolean result = GroupOfCards.showCard(no);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
 @Test
    public void testShowCardbad() {
         Scanner in = new Scanner(System.in);
        System.out.println("showCardbadtest");
        
        int no = 9;
        boolean expResult = false;
        boolean result = GroupOfCards.showCard(no);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testShowCardboundry() {
        System.out.println("showCardboundrytest");
        int no = 5;
        boolean expResult = true;
        boolean result = GroupOfCards.showCard(no);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
   
    /**
     * Test of shuffle method, of class GroupOfCards.
     */
//    @Test
//    public void testShuffle() {
//        System.out.println("shuffle");
//        GroupOfCards instance = null;
//        instance.shuffle();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSize method, of class GroupOfCards.
//     */
//    @Test
//    public void testGetSize() {
//        System.out.println("getSize");
//        GroupOfCards instance = null;
//        int expResult = 0;
//        int result = instance.getSize();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setSize method, of class GroupOfCards.
//     */
//    @Test
//    public void testSetSize() {
//        System.out.println("setSize");
//        int givenSize = 0;
//        GroupOfCards instance = null;
//        instance.setSize(givenSize);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
