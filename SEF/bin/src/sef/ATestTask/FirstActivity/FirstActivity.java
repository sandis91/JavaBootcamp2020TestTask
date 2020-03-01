package sef.ATestTask.FirstActivity;

import java.io.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class FirstActivity extends Employee {


    public static void main(String[] args) throws IOException {

        //TODO 1 Create collection of employee (more than 5) list or map
        //		System.out.println() result

        Employee e1 = new Employee("jack", "black", 22, 77, "bum", "ficcomp", 99);
        Employee e2 = new Employee("dan", "white", 42, 88, "bum1", "ficcomp", 9);
        Employee e3 = new Employee("fin", "yellow", 88, 11, "bum2", "ficcomp", 999);
        Employee e4 = new Employee("shrek", "green", 66, 2, "bum3", "ficcomp", 9999);
        Employee e5 = new Employee("john", "red", 46, 33, "bum4", "ficcomp", 99999);
        Employee e6 = new Employee("eve", "purple", 25, 4, "bum5", "ficcomp", 99777);
        //Employee etemp = new Employee();
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getSecondName() + " " + employee.getAge() + " " + employee.getEmpId() + " " + employee.getJobTitle() + " " + employee.getCompanyName() + " " + employee.getSalary());
        }
        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result
        System.out.println(" ");
        System.out.println("Sorted by salary");
        Comparator<Employee> EmpSalary = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                double sal1 = o1.getSalary();
                double sal2 = o2.getSalary();

                return (int) (sal2 - sal1);
            }
        };
        Collections.sort(employees, EmpSalary);
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getSecondName() + " " + employee.getAge() + " " + employee.getEmpId() + " " + employee.getJobTitle() + " " + employee.getCompanyName() + " " + employee.getSalary());
        }


        //TODO 3 create instance of a Student as a Person ->
        // than ask him introduce()
        // than make them Student
        // than ask him introduce()
        System.out.println(" ");
        System.out.println("Student introduction");

        Student s = new Student();
        try {
            s.setFirstName("john");
        } catch (CustomExceptionActivityy customExceptionActivityy) {
            customExceptionActivityy.printStackTrace();
        }
        try {
            s.setSecondName("connor");
        } catch (CustomExceptionActivityy customExceptionActivityy) {
            customExceptionActivityy.printStackTrace();
        }
        s.setAge(20);
        s.setSchoolName("ficschool");
        Person tempPerson = s;
        tempPerson.announce();
        Student tempStudent = (Student) tempPerson;
        tempStudent.introduce();


        //TODO 4 Create method for full change of employee information
        // for example some employee change his work
        System.out.println(" ");
        System.out.println("Edited employee");
        employees.get(1).setCompanyName("newcompany");
        employees.get(1).setEmpId(777);
        employees.get(1).setJobTitle("newjobtitle");
        employees.get(1).setSalary(44444);
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getSecondName() + " " + employee.getAge() + " " + employee.getEmpId() + " " + employee.getJobTitle() + " " + employee.getCompanyName() + " " + employee.getSalary());
        }
        //write to file
        File file = new File("./Storage.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Employee employee : employees) {
            bw.write(employee.getFirstName() + " " + employee.getSecondName() + " " + employee.getAge() + " " + employee.getEmpId() + " " + employee.getJobTitle() + " " + employee.getCompanyName() + " " + employee.getSalary());
            bw.newLine();
        }
        bw.flush();
        bw.close();

        // sort by first name
        System.out.println(" ");
        System.out.println("Sorted by first name");
        Comparator<Employee> FirstName = new Comparator<Employee>() {
            @Override
            public int compare(Employee jc1, Employee jc2) {
                return (int) (jc1.getFirstName().compareTo(jc2.getFirstName()));
            }
        };

        Collections.sort(employees, FirstName);
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getSecondName() + " " + employee.getAge() + " " + employee.getEmpId() + " " + employee.getJobTitle() + " " + employee.getCompanyName() + " " + employee.getSalary());
        }
        // sort by second name
        System.out.println(" ");
        System.out.println("Sorted by second name");
        Comparator<Employee> SecondName = new Comparator<Employee>() {
            @Override
            public int compare(Employee jc1, Employee jc2) {
                return (int) (jc1.getSecondName().compareTo(jc2.getSecondName()));
            }
        };

        Collections.sort(employees, SecondName);
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getSecondName() + " " + employee.getAge() + " " + employee.getEmpId() + " " + employee.getJobTitle() + " " + employee.getCompanyName() + " " + employee.getSalary());
        }

    }
}
