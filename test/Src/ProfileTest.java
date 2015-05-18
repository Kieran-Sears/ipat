/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Src;

import java.io.File;
import java.util.Hashtable;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.jdom.Document;

/**
 *
 * @author kieran
 */
public class ProfileTest extends TestCase {
    
    public ProfileTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ProfileTest.class);
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
     * Test of addKernel method, of class Profile.
     */
    public void testAddKernel() {
        System.out.println("addKernel");
        Kernel kernel = null;
        Profile instance = null;
        instance.addKernel(kernel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeKernel method, of class Profile.
     */
    public void testRemoveKernel() {
        System.out.println("removeKernel");
        String kernelName = "";
        Profile instance = null;
        instance.removeKernel(kernelName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addVariable method, of class Profile.
     */
    public void testAddVariable() {
        System.out.println("addVariable");
        SolutionAttributes var = null;
        Profile instance = null;
        instance.addVariable(var);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeVariable method, of class Profile.
     */
    public void testRemoveVariable() {
        System.out.println("removeVariable");
        String varname = "";
        Profile instance = null;
        instance.removeVariable(varname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFreezeBGColour method, of class Profile.
     */
    public void testIsFreezeBGColour() {
        System.out.println("isFreezeBGColour");
        Profile instance = null;
        boolean expResult = false;
        boolean result = instance.isFreezeBGColour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFreezeBGColour method, of class Profile.
     */
    public void testSetFreezeBGColour() {
        System.out.println("setFreezeBGColour");
        boolean FreezeBGColour = false;
        Profile instance = null;
        instance.setFreezeBGColour(FreezeBGColour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChangeGFContrast method, of class Profile.
     */
    public void testGetChangeGFContrast() {
        System.out.println("getChangeGFContrast");
        Profile instance = null;
        int expResult = 0;
        int result = instance.getChangeGFContrast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChangeGFContrast method, of class Profile.
     */
    public void testSetChangeGFContrast() {
        System.out.println("setChangeGFContrast");
        int ChangeGFContrast = 0;
        Profile instance = null;
        instance.setChangeGFContrast(ChangeGFContrast);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChangeFontSize method, of class Profile.
     */
    public void testGetChangeFontSize() {
        System.out.println("getChangeFontSize");
        Profile instance = null;
        int expResult = 0;
        int result = instance.getChangeFontSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChangeFontSize method, of class Profile.
     */
    public void testSetChangeFontSize() {
        System.out.println("setChangeFontSize");
        int ChangeFontSize = 0;
        Profile instance = null;
        instance.setChangeFontSize(ChangeFontSize);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFreezeFGFonts method, of class Profile.
     */
    public void testIsFreezeFGFonts() {
        System.out.println("isFreezeFGFonts");
        Profile instance = null;
        boolean expResult = false;
        boolean result = instance.isFreezeFGFonts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFreezeFGFonts method, of class Profile.
     */
    public void testSetFreezeFGFonts() {
        System.out.println("setFreezeFGFonts");
        boolean FreezeFGFonts = false;
        Profile instance = null;
        instance.setFreezeFGFonts(FreezeFGFonts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFile method, of class Profile.
     */
    public void testGetFile() {
        System.out.println("getFile");
        Profile instance = null;
        File expResult = null;
        File result = instance.getFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFile method, of class Profile.
     */
    public void testSetFile() {
        System.out.println("setFile");
        File thisfile = null;
        Profile instance = null;
        instance.setFile(thisfile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGlobalScore method, of class Profile.
     */
    public void testGetGlobalScore() {
        System.out.println("getGlobalScore");
        Profile instance = null;
        int expResult = 0;
        int result = instance.getGlobalScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKernels method, of class Profile.
     */
    public void testGetKernels() {
        System.out.println("getKernels");
        Profile instance = null;
        Hashtable expResult = null;
        Hashtable result = instance.getKernels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Profile.
     */
    public void testGetName() {
        System.out.println("getName");
        Profile instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSolutionAttributes method, of class Profile.
     */
    public void testGetSolutionAttributes() {
        System.out.println("getSolutionAttributes");
        Profile instance = null;
        Hashtable expResult = null;
        Hashtable result = instance.getSolutionAttributes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printProfile method, of class Profile.
     */
    public void testPrintProfile() {
        System.out.println("printProfile");
        Profile instance = null;
        instance.printProfile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGlobalScore method, of class Profile.
     */
    public void testSetGlobalScore() {
        System.out.println("setGlobalScore");
        int globalScore = 0;
        Profile instance = null;
        instance.setGlobalScore(globalScore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertStringToDocument method, of class Profile.
     */
    public void testConvertStringToDocument() {
        System.out.println("convertStringToDocument");
        String string = "";
        Profile instance = null;
        Document expResult = null;
        Document result = instance.convertStringToDocument(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Profile.
     */
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Profile instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeProfileToFile method, of class Profile.
     */
    public void testWriteProfileToFile_Profile_String() {
        System.out.println("writeProfileToFile");
        Profile parent = null;
        String outputPath = "";
        Profile instance = null;
        boolean expResult = false;
        boolean result = instance.writeProfileToFile(parent, outputPath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfile method, of class Profile.
     */
    public void testGetProfile() {
        System.out.println("getProfile");
        File file = null;
        Profile instance = null;
        Profile expResult = null;
        Profile result = instance.getProfile(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfile method, of class Profile.
     */
    public void testSetProfile() {
        System.out.println("setProfile");
        Profile profile = null;
        Profile instance = null;
        boolean expResult = false;
        boolean result = instance.setProfile(profile);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfileVariableValue method, of class Profile.
     */
    public void testSetProfileVariableValue() {
        System.out.println("setProfileVariableValue");
        String varname = "";
        double newValue = 0.0;
        Profile instance = null;
        instance.setProfileVariableValue(varname, newValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeProfileToFile method, of class Profile.
     */
    public void testWriteProfileToFile_String() {
        System.out.println("writeProfileToFile");
        String outputPath = "";
        Profile instance = null;
        boolean expResult = false;
        boolean result = instance.writeProfileToFile(outputPath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
