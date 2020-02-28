package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
    public void checkPersonCreatedProperly() {
        Person a = new Person();
        a.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", a.getFirstName());
        a.setSecondName("Test1");
        assertEquals("I am an error message", "Test1", a.getSecondName());
        a.setAge(22);
        assertEquals("I am an error message", 22, a.getAge());
    }
}
