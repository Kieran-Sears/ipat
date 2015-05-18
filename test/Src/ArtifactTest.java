/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Src;

import java.io.File;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author kieran
 */
public class ArtifactTest extends TestCase {
    
    public ArtifactTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ArtifactTest.class);
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
     * Test of getFile method, of class Artifact.
     */
    public void testGetFile() {
        System.out.println("getFile");
        Artifact instance = null;
        File expResult = null;
        File result = instance.getFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilename method, of class Artifact.
     */
    public void testGetFilename() {
        System.out.println("getFilename");
        Artifact instance = null;
        String expResult = "";
        String result = instance.getFilename();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilepath method, of class Artifact.
     */
    public void testGetFilepath() {
        System.out.println("getFilepath");
        Artifact instance = null;
        String expResult = "";
        String result = instance.getFilepath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setupFile method, of class Artifact.
     */
    public void testSetupFile() {
        System.out.println("setupFile");
        Artifact instance = null;
        instance.setupFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
