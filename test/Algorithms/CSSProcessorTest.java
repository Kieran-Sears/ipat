/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import Src.Artifact;
import Src.Profile;
import java.util.Hashtable;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author kieran
 */
public class CSSProcessorTest extends TestCase {
    
    public CSSProcessorTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(CSSProcessorTest.class);
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
     * Test of applyProfileToArtifact method, of class CSSProcessor.
     */
    public void testApplyProfileToArtifact() {
        System.out.println("applyProfileToArtifact");
        Profile profile = null;
        Artifact artifact = null;
        String outputFolder = "";
        CSSProcessor instance = new CSSProcessor();
        Artifact expResult = null;
        Artifact result = instance.applyProfileToArtifact(profile, artifact, outputFolder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setupCSSLabelStore method, of class CSSProcessor.
     */
    public void testSetupCSSLabelStore() {
        System.out.println("setupCSSLabelStore");
        CSSProcessor instance = new CSSProcessor();
        Hashtable expResult = null;
        Hashtable result = instance.setupCSSLabelStore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
