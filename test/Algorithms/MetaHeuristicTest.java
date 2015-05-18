/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import Src.Profile;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author kieran
 */
public class MetaHeuristicTest extends TestCase {
    
    public MetaHeuristicTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(MetaHeuristicTest.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of updateWorkingMemory method, of class MetaHeuristic.
     */
    public void testUpdateWorkingMemory() {
        System.out.println("updateWorkingMemory");
        Profile[] evaluatedSolutions = null;
        MetaHeuristic instance = new MetaHeuristicImpl();
        instance.updateWorkingMemory(evaluatedSolutions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateNextSolutions method, of class MetaHeuristic.
     */
    public void testGenerateNextSolutions() {
        System.out.println("generateNextSolutions");
        int howMany = 0;
        MetaHeuristic instance = new MetaHeuristicImpl();
        instance.generateNextSolutions(howMany);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextGenProfileAtIndex method, of class MetaHeuristic.
     */
    public void testGetNextGenProfileAtIndex() {
        System.out.println("getNextGenProfileAtIndex");
        int which = 0;
        MetaHeuristic instance = new MetaHeuristicImpl();
        Profile expResult = null;
        Profile result = instance.getNextGenProfileAtIndex(which);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MetaHeuristicImpl implements MetaHeuristic {

        public void updateWorkingMemory(Profile[] evaluatedSolutions) {
        }

        public void generateNextSolutions(int howMany) {
        }

        public Profile getNextGenProfileAtIndex(int which) {
            return null;
        }
    }

    
}
