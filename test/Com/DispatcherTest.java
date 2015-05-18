/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author kieran
 */
public class DispatcherTest extends TestCase {
    
    public DispatcherTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(DispatcherTest.class);
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
     * Test of init method, of class Dispatcher.
     */
    public void testInit() throws Exception {
        System.out.println("DispatcherTest : init");
    
    }

    /**
     * Test of doGet method, of class Dispatcher.
     */
    public void testDoGet() throws Exception {
        System.out.println("DispatcherTest : doGet");
     
    }

    /**
     * Test of doPost method, of class Dispatcher.
     */
    public void testDoPost() throws Exception {
        System.out.println("DispatcherTest : doPost");
       
    }

    /**
     * Test of getServletInfo method, of class Dispatcher.
     */
    public void testGetServletInfo() {
        System.out.println("DispatcherTest : getServletInfo");
     
    }
    
}
