/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author kieran
 */
public class AlgorithmsSuite extends TestCase {
    
    public AlgorithmsSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("AlgorithmsSuite");
        suite.addTest(MetaHeuristicTest.suite());
        suite.addTest(ESEvolutionTest.suite());
        suite.addTest(CSSProcessorTest.suite());
        suite.addTest(ProcessorTest.suite());
        suite.addTest(HintsProcessorTest.suite());
        return suite;
    }
    
}
