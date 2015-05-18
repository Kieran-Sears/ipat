/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import Src.Artifact;
import Src.Profile;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author kieran
 */
public class ProcessorTest extends TestCase {
    
    public ProcessorTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ProcessorTest.class);
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
     * Test of applyProfileToArtifact method, of class Processor.
     */
    public void testApplyProfileToArtifact() {
        System.out.println("applyProfileToArtifact");
        Profile profile = null;
        Artifact artifact = null;
        String outputFolder = "";
        Processor instance = new ProcessorImpl();
        Artifact expResult = null;
        Artifact result = instance.applyProfileToArtifact(profile, artifact, outputFolder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ProcessorImpl implements Processor {

        public Artifact applyProfileToArtifact(Profile profile, Artifact artifact, String outputFolder) {
            return null;
        }
    }

}
