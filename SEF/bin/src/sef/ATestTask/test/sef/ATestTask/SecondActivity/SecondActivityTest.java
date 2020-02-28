package sef.ATestTask.SecondActivity;

import groovy.util.GroovyTestCase;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecondActivityTest extends GroovyTestCase {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sum() {
        SecondActivity c=new SecondActivity();
        assertEquals(4,c.sum(4,4));
        assertEquals(1,c.sum(4,-3));
        assertEquals(5.5,c.sum(2.2,2.3));
    }

    @Test
    public void subtract() {
        SecondActivity c=new SecondActivity();
        assertEquals(2,c.subtract(4,2));
        assertEquals(6,c.subtract(4,-2));
        assertEquals(2.5,c.subtract(4,1.5));
    }

    @Test
    public void multiply() {
        SecondActivity c=new SecondActivity();
        assertEquals(4,c.multiply(2,2));
        assertEquals(-8,c.multiply(2,-4));
        assertEquals(15,c.multiply(10,1.5));
    }

    @Test
    public void divide() {
        SecondActivity c=new SecondActivity();
        assertEquals(2,c.divide(4,2));
        assertEquals(-3,c.divide(6,-2));
        assertEquals(6,c.divide(9,1.5));
    }
}