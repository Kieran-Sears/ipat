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
public class ResultItemTest extends TestCase {
    
    public ResultItemTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ResultItemTest.class);
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
     * Test of setCssFile method, of class ResultItem.
     */
    public void testSetCssFile() {
        System.out.println("setCssFile");
        File cssFile = null;
        ResultItem instance = null;
        instance.setCssFile(cssFile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHtmlFile method, of class ResultItem.
     */
    public void testSetHtmlFile() {
        System.out.println("setHtmlFile");
        File htmlFile = null;
        ResultItem instance = null;
        instance.setHtmlFile(htmlFile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfile method, of class ResultItem.
     */
    public void testSetProfile() {
        System.out.println("setProfile");
        Profile file = null;
        ResultItem instance = null;
        instance.setProfile(file);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCssFile method, of class ResultItem.
     */
    public void testGetCssFile() {
        System.out.println("getCssFile");
        ResultItem instance = null;
        File expResult = null;
        File result = instance.getCssFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHtmlFile method, of class ResultItem.
     */
    public void testGetHtmlFile() {
        System.out.println("getHtmlFile");
        ResultItem instance = null;
        File expResult = null;
        File result = instance.getHtmlFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIpatFile method, of class ResultItem.
     */
    public void testGetIpatFile() {
        System.out.println("getIpatFile");
        ResultItem instance = null;
        Artifact expResult = null;
        Artifact result = instance.getIpatFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfile method, of class ResultItem.
     */
    public void testGetProfile() {
        System.out.println("getProfile");
        ResultItem instance = null;
        Profile expResult = null;
        Profile result = instance.getProfile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
