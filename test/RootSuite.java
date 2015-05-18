/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Algorithms.AlgorithmsSuite;
import Com.ComSuite;
import GUI.GUISuite;
import Src.SrcSuite;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author kieran
 */
public class RootSuite extends TestCase {
    
    public RootSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("RootSuite");
        suite.addTest(GUISuite.suite());
        suite.addTest(ComSuite.suite());
        suite.addTest(SrcSuite.suite());
        suite.addTest(AlgorithmsSuite.suite());
        return suite;
    }
    
}
