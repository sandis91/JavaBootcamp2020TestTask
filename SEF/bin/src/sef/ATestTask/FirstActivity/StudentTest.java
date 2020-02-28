package sef.ATestTask.FirstActivity;


import static org.junit.Assert.assertEquals;

public class StudentTest {

    public void checkStudentCreatedProperly() {
        Student s = new Student();
        s.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", s.getFirstName());
        s.setSecondName("Test1");
        assertEquals("I am an error message", "Test1", s.getSecondName());
        s.setAge(111);
        assertEquals("I am an error message",111,s.getAge());
        s.setSchoolName("Test1");
        assertEquals("I am an error message", "Test1", s.getSchoolName());
    }
}