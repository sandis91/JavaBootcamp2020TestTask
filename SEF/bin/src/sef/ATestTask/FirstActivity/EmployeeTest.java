package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    public void checkEmployeeCreatedProperly(){
        Employee employee = new Employee();
        employee.setFirstName("Test1");
        assertEquals("I am an error message", "Test1", employee.getFirstName());
        employee.setEmpId(22);
        assertEquals("I am an error message", 22, employee.getEmpId());
        employee.setSalary(444);
        assertEquals("I am an error message", 444, employee.getSalary());
        employee.setJobTitle("Test1");
        assertEquals("I am an error message", "Test1", employee.getJobTitle());
        employee.setCompanyName("Test1");
        assertEquals("I am an error message", "Test1", employee.getCompanyName());
        employee.setSecondName("Test1");
        assertEquals("I am an error message", "Test1", employee.getSecondName());
    }

}