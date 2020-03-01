package sef.ATestTask.FirstActivity;


import static org.junit.Assert.assertEquals;

public class StudentTest {

    public void checkStudentCreatedProperly() {
        Student s = new Student();
        try {
            s.setFirstName("Test1");
        } catch (CustomExceptionActivityy customExceptionActivityy) {
            customExceptionActivityy.printStackTrace();
        }
        assertEquals("I am an error message", "Test1", s.getFirstName());
        try {
            s.setSecondName("Test1");
        } catch (CustomExceptionActivityy customExceptionActivityy) {
            customExceptionActivityy.printStackTrace();
        }
        assertEquals("I am an error message", "Test1", s.getSecondName());
        s.setAge(111);
        assertEquals("I am an error message",111,s.getAge());
        s.setSchoolName("Test1");
        assertEquals("I am an error message", "Test1", s.getSchoolName());
    }
}