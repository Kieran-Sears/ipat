/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com;

import javax.servlet.http.HttpSessionEvent;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author kieran
 */
public class SessionCounterListenerTest extends TestCase {
    
    public SessionCounterListenerTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(SessionCounterListenerTest.class);
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
     * Test of getTotalActiveSession method, of class SessionCounterListener.
     */
    public void testGetTotalActiveSession() {
        System.out.println("getTotalActiveSession");
        int expResult = 0;
        int result = SessionCounterListener.getTotalActiveSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sessionCreated method, of class SessionCounterListener.
     */
    public void testSessionCreated() {
        System.out.println("sessionCreated");
        HttpSessionEvent arg0 = null;
        SessionCounterListener instance = new SessionCounterListener();
        instance.sessionCreated(arg0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sessionDestroyed method, of class SessionCounterListener.
     */
    public void testSessionDestroyed() {
        System.out.println("sessionDestroyed");
        HttpSessionEvent arg0 = null;
        SessionCounterListener instance = new SessionCounterListener();
        instance.sessionDestroyed(arg0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
