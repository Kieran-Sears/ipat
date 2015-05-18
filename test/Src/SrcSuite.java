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
public class SrcSuite extends TestCase {
    
    public SrcSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("SrcSuite");
        suite.addTest(ArtifactTest.suite());
        suite.addTest(ResultItemTest.suite());
        suite.addTest(InteractionTest.suite());
        suite.addTest(SolutionAttributesTest.suite());
        suite.addTest(KernelTest.suite());
        suite.addTest(ProfileTest.suite());
        suite.addTest(DisplayTest.suite());
        suite.addTest(UtilsTest.suite());
        suite.addTest(ControllerTest.suite());
        return suite;
    }
    
}
