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
public class HintsProcessorTest extends TestCase {
    
    public HintsProcessorTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(HintsProcessorTest.class);
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
     * Test of InterpretHintInProfile method, of class HintsProcessor.
     */
    public void testInterpretHintInProfile() {
        System.out.println("HintsProcessor : InterpretHintInProfile()");
     
    }
    
}
