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
public class UtilsTest extends TestCase {
    
    public UtilsTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UtilsTest.class);
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
     * Test of GetGaussN01Double method, of class Utils.
     */
    public void testGetGaussN01Double() {
        System.out.println("GetGaussN01Double");
        double expResult = 0.0;
        double result = Utils.GetGaussN01Double();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetRandDouble01 method, of class Utils.
     */
    public void testGetRandDouble01() {
        System.out.println("GetRandDouble01");
        double expResult = 0.0;
        double result = Utils.GetRandDouble01();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetRandIntInRange method, of class Utils.
     */
    public void testGetRandIntInRange() {
        System.out.println("GetRandIntInRange");
        int b1 = 0;
        int b2 = 0;
        int expResult = 0;
        int result = Utils.GetRandIntInRange(b1, b2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Abs method, of class Utils.
     */
    public void testAbs_double() {
        System.out.println("Abs");
        double x = 0.0;
        Utils instance = new Utils();
        double expResult = 0.0;
        double result = instance.Abs(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Abs method, of class Utils.
     */
    public void testAbs_int() {
        System.out.println("Abs");
        int n = 0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.Abs(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetClosestEvenNumber method, of class Utils.
     */
    public void testGetClosestEvenNumber() {
        System.out.println("GetClosestEvenNumber");
        double x = 0.0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.GetClosestEvenNumber(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetClosestMultipleOf4 method, of class Utils.
     */
    public void testGetClosestMultipleOf4_double() {
        System.out.println("GetClosestMultipleOf4");
        double x = 0.0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.GetClosestMultipleOf4(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetClosestMultipleOf4 method, of class Utils.
     */
    public void testGetClosestMultipleOf4_int() {
        System.out.println("GetClosestMultipleOf4");
        int n = 0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.GetClosestMultipleOf4(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetClosestOddNumber method, of class Utils.
     */
    public void testGetClosestOddNumber() {
        System.out.println("GetClosestOddNumber");
        double x = 0.0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.GetClosestOddNumber(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetEvenRandIntInRange method, of class Utils.
     */
    public void testGetEvenRandIntInRange() {
        System.out.println("GetEvenRandIntInRange");
        int b1 = 0;
        int b2 = 0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.GetEvenRandIntInRange(b1, b2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetOddRandIntInRange method, of class Utils.
     */
    public void testGetOddRandIntInRange() {
        System.out.println("GetOddRandIntInRange");
        int b1 = 0;
        int b2 = 0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.GetOddRandIntInRange(b1, b2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetOneOfThese method, of class Utils.
     */
    public void testGetOneOfThese_double_double() {
        System.out.println("GetOneOfThese");
        double a = 0.0;
        double b = 0.0;
        Utils instance = new Utils();
        double expResult = 0.0;
        double result = instance.GetOneOfThese(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetOneOfThese method, of class Utils.
     */
    public void testGetOneOfThese_int_int() {
        System.out.println("GetOneOfThese");
        int a = 0;
        int b = 0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.GetOneOfThese(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetRandBool method, of class Utils.
     */
    public void testGetRandBool() {
        System.out.println("GetRandBool");
        Utils instance = new Utils();
        boolean expResult = false;
        boolean result = instance.GetRandBool();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetRndNbFromGaussianDistr01 method, of class Utils.
     */
    public void testGetRndNbFromGaussianDistr01() {
        System.out.println("GetRndNbFromGaussianDistr01");
        Utils instance = new Utils();
        double expResult = 0.0;
        double result = instance.GetRndNbFromGaussianDistr01();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetRndNbFromGaussianDistrMeanSigma method, of class Utils.
     */
    public void testGetRndNbFromGaussianDistrMeanSigma() {
        System.out.println("GetRndNbFromGaussianDistrMeanSigma");
        double mean = 0.0;
        double sigma = 0.0;
        Utils instance = new Utils();
        double expResult = 0.0;
        double result = instance.GetRndNbFromGaussianDistrMeanSigma(mean, sigma);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IntToStringFilledWith0 method, of class Utils.
     */
    public void testIntToStringFilledWith0() {
        System.out.println("IntToStringFilledWith0");
        int n = 0;
        int sizeToReach = 0;
        Utils instance = new Utils();
        String expResult = "";
        String result = instance.IntToStringFilledWith0(n, sizeToReach);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsEven method, of class Utils.
     */
    public void testIsEven() {
        System.out.println("IsEven");
        int n = 0;
        Utils instance = new Utils();
        boolean expResult = false;
        boolean result = instance.IsEven(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsMultipleOf4 method, of class Utils.
     */
    public void testIsMultipleOf4() {
        System.out.println("IsMultipleOf4");
        int n = 0;
        Utils instance = new Utils();
        boolean expResult = false;
        boolean result = instance.IsMultipleOf4(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of KeepArgt1BetweenArgt2AndArgt3 method, of class Utils.
     */
    public void testKeepArgt1BetweenArgt2AndArgt3_3args_1() {
        System.out.println("KeepArgt1BetweenArgt2AndArgt3");
        double var = 0.0;
        double bound1 = 0.0;
        double bound2 = 0.0;
        Utils instance = new Utils();
        instance.KeepArgt1BetweenArgt2AndArgt3(var, bound1, bound2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of KeepArgt1BetweenArgt2AndArgt3 method, of class Utils.
     */
    public void testKeepArgt1BetweenArgt2AndArgt3_3args_2() {
        System.out.println("KeepArgt1BetweenArgt2AndArgt3");
        int var = 0;
        int bound1 = 0;
        int bound2 = 0;
        Utils instance = new Utils();
        instance.KeepArgt1BetweenArgt2AndArgt3(var, bound1, bound2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of KeepInside01 method, of class Utils.
     */
    public void testKeepInside01() {
        System.out.println("KeepInside01");
        double x = 0.0;
        Utils instance = new Utils();
        double expResult = 0.0;
        double result = instance.KeepInside01(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Max method, of class Utils.
     */
    public void testMax_double_double() {
        System.out.println("Max");
        double a = 0.0;
        double b = 0.0;
        Utils instance = new Utils();
        double expResult = 0.0;
        double result = instance.Max(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Max method, of class Utils.
     */
    public void testMax_int_int() {
        System.out.println("Max");
        int a = 0;
        int b = 0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.Max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MaxArray1D method, of class Utils.
     */
    public void testMaxArray1D() {
        System.out.println("MaxArray1D");
        int[] array1D = null;
        int arraySize = 0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.MaxArray1D(array1D, arraySize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MaxArray2D method, of class Utils.
     */
    public void testMaxArray2D_3args_1() {
        System.out.println("MaxArray2D");
        double[][] array2D = null;
        int width = 0;
        int height = 0;
        Utils instance = new Utils();
        double expResult = 0.0;
        double result = instance.MaxArray2D(array2D, width, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MaxArray2D method, of class Utils.
     */
    public void testMaxArray2D_3args_2() {
        System.out.println("MaxArray2D");
        int[][] array2D = null;
        int width = 0;
        int height = 0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.MaxArray2D(array2D, width, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Min method, of class Utils.
     */
    public void testMin_double_double() {
        System.out.println("Min");
        double a = 0.0;
        double b = 0.0;
        Utils instance = new Utils();
        double expResult = 0.0;
        double result = instance.Min(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Min method, of class Utils.
     */
    public void testMin_int_int() {
        System.out.println("Min");
        int a = 0;
        int b = 0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.Min(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MinArray1D method, of class Utils.
     */
    public void testMinArray1D() {
        System.out.println("MinArray1D");
        int[] array1D = null;
        int arraySize = 0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.MinArray1D(array1D, arraySize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MinArray2D method, of class Utils.
     */
    public void testMinArray2D_3args_1() {
        System.out.println("MinArray2D");
        double[][] array2D = null;
        int width = 0;
        int height = 0;
        Utils instance = new Utils();
        double expResult = 0.0;
        double result = instance.MinArray2D(array2D, width, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MinArray2D method, of class Utils.
     */
    public void testMinArray2D_3args_2() {
        System.out.println("MinArray2D");
        int[][] array2D = null;
        int width = 0;
        int height = 0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.MinArray2D(array2D, width, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RealToStringFilledWith0 method, of class Utils.
     */
    public void testRealToStringFilledWith0() {
        System.out.println("RealToStringFilledWith0");
        double x = 0.0;
        int sizeToReach = 0;
        Utils instance = new Utils();
        String expResult = "";
        String result = instance.RealToStringFilledWith0(x, sizeToReach);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Round method, of class Utils.
     */
    public void testRound() {
        System.out.println("Round");
        double x = 0.0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.Round(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Sq method, of class Utils.
     */
    public void testSq_double() {
        System.out.println("Sq");
        double a = 0.0;
        Utils instance = new Utils();
        double expResult = 0.0;
        double result = instance.Sq(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Sq method, of class Utils.
     */
    public void testSq_int() {
        System.out.println("Sq");
        int a = 0;
        Utils instance = new Utils();
        int expResult = 0;
        int result = instance.Sq(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
