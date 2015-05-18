/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import Src.Profile;
import java.io.File;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author kieran
 */
public class ESEvolutionTest extends TestCase {
    
    public ESEvolutionTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ESEvolutionTest.class);
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
     * Test of getNextGenProfileAtIndex method, of class ESEvolution.
     */
    public void testGetNextGenProfileAtIndex() {
        System.out.println("getNextGenProfileAtIndex");
        int which = 0;
        ESEvolution instance = new ESEvolution();
        Profile expResult = null;
        Profile result = instance.getNextGenProfileAtIndex(which);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateNextSolutions method, of class ESEvolution.
     */
    public void testGenerateNextSolutions() {
        System.out.println("generateNextSolutions");
        int howMany = 0;
        ESEvolution instance = new ESEvolution();
        instance.generateNextSolutions(howMany);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfileFromFile method, of class ESEvolution.
     */
    public void testGetProfileFromFile() {
        System.out.println("getProfileFromFile");
        File file = null;
        ESEvolution instance = new ESEvolution();
        Profile expResult = null;
        Profile result = instance.getProfileFromFile(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWorkingMemory method, of class ESEvolution.
     */
    public void testUpdateWorkingMemory() {
        System.out.println("updateWorkingMemory");
        Profile[] evaluatedSolutions = null;
        ESEvolution instance = new ESEvolution();
        instance.updateWorkingMemory(evaluatedSolutions);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
