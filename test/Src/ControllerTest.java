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
public class ControllerTest extends TestCase {
    
    public ControllerTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ControllerTest.class);
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
     * Test of initialArtifacts method, of class Controller.
     */
    public void testInitialArtifacts() {
        System.out.println("ControllerTest : testInitialArtifacts()");
   
    }

    /**
     * Test of mainloop method, of class Controller.
     */
    public void testMainloop() {
        System.out.println("ControllerTest : testMainloop()");
      
    }
    
}
