/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author kieran
 */
public class ComSuite extends TestCase {
    
    public ComSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("ComSuite");
        suite.addTest(newGenRequestTest.suite());
        suite.addTest(DispatcherTest.suite());
        suite.addTest(AbortTest.suite());
        suite.addTest(SessionCounterListenerTest.suite());
        return suite;
    }
    
}
