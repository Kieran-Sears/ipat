/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Src;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author kieran
 */
public class SolutionAttributesTest extends TestCase {
    
    public SolutionAttributesTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(SolutionAttributesTest.class);
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
     * Test of getDfault method, of class SolutionAttributes.
     */
    public void testGetDfault() {
        System.out.println("getDfault");
        SolutionAttributes instance = null;
        String expResult = "";
        String result = instance.getDfault();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFlag method, of class SolutionAttributes.
     */
    public void testGetFlag() {
        System.out.println("getFlag");
        SolutionAttributes instance = null;
        String expResult = "";
        String result = instance.getFlag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRateOfEvolution method, of class SolutionAttributes.
     */
    public void testGetRateOfEvolution() {
        System.out.println("getRateOfEvolution");
        SolutionAttributes instance = null;
        double expResult = 0.0;
        double result = instance.getRateOfEvolution();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRateOfEvolution method, of class SolutionAttributes.
     */
    public void testSetRateOfEvolution() {
        System.out.println("setRateOfEvolution");
        double newval = 0.0;
        SolutionAttributes instance = null;
        instance.setRateOfEvolution(newval);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGranularity method, of class SolutionAttributes.
     */
    public void testGetGranularity() {
        System.out.println("getGranularity");
        SolutionAttributes instance = null;
        double expResult = 0.0;
        double result = instance.getGranularity();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLbound method, of class SolutionAttributes.
     */
    public void testGetLbound() {
        System.out.println("getLbound");
        SolutionAttributes instance = null;
        double expResult = 0.0;
        double result = instance.getLbound();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class SolutionAttributes.
     */
    public void testGetName() {
        System.out.println("getName");
        SolutionAttributes instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class SolutionAttributes.
     */
    public void testGetType() {
        System.out.println("getType");
        SolutionAttributes instance = null;
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUbound method, of class SolutionAttributes.
     */
    public void testGetUbound() {
        System.out.println("getUbound");
        SolutionAttributes instance = null;
        double expResult = 0.0;
        double result = instance.getUbound();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class SolutionAttributes.
     */
    public void testGetValue() {
        System.out.println("getValue");
        SolutionAttributes instance = null;
        double expResult = 0.0;
        double result = instance.getValue();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class SolutionAttributes.
     */
    public void testSetValue() {
        System.out.println("setValue");
        double value = 0.0;
        SolutionAttributes instance = null;
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnit method, of class SolutionAttributes.
     */
    public void testGetUnit() {
        System.out.println("getUnit");
        SolutionAttributes instance = null;
        String expResult = "";
        String result = instance.getUnit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUnit method, of class SolutionAttributes.
     */
    public void testSetUnit() {
        System.out.println("setUnit");
        String unit = "";
        SolutionAttributes instance = null;
        instance.setUnit(unit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
