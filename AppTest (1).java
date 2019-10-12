package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    public void testNull() {
        int array[] = new int[0];
        array = null;
        assertFalse(new App().method1(array, 1, 4, 4));
    }

    public void testbLessThanZero() {
        int array[] = new int[2];
        array[0] = 3;
        array[1] = 5;
        assertFalse(new App().method1(array, 1, 7, -1));
    }


    public void testaLessThanZero() {
        int array[] = new int[2];
        array[0] = 3;
        array[1] = 5;
        assertFalse(new App().method1(array, 1, -3, 2));
    }

    public void testabequalsTarget(){
        int array[] = new int[2];
        array[0] = 3;
        array[1] = 5;
        assertTrue(new App().method1(array, 4, 2, 2));
    }
    public void testarrayEqualsTarget(){
        int array[] = new int[2];
        array[0] = 3;
        array[1] = 5;
        assertTrue(new App().method1(array, 3, 2, 2));
    }

}