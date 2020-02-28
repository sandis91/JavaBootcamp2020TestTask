package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class FirstActivity extends Employee {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map
        //		System.out.println() result

        Employee e1 = new Employee("jack", "black", 22, 77, "bum", "ficcomp", 99);
        Employee e2 = new Employee("jack1", "black1", 42, 88, "bum1", "ficcomp", 9);
        Employee e3 = new Employee("jack2", "black2", 88, 11, "bum2", "ficcomp", 999);
        Employee e4 = new Employee("jack3", "black3", 66, 2, "bum3", "ficcomp", 9999);
        Employee e5 = new Employee("jack4", "black4", 46, 33, "bum4", "ficcomp", 99999);
        Employee e6 = new Employee("jack5", "black5", 25, 4, "bum5", "ficcomp", 99777);
        Employee etemp = new Employee();
        List<Employee> employees = new ArrayList<>();
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

        Student s = new Student();
        s.setFirstName("john");
        s.setSecondName("connor");
        s.setAge(20);
        s.setSchoolName("ficschool");
        Person tempPerson = s;
        tempPerson.announce();
        Student tempStudent = (Student) tempPerson;
        tempStudent.introduce();

        //TODO 4 Create method for full change of employee information
        // for example some employee change his work



       /* Employee[] empl = new Employee[6];
        empl[0] = new Employee();
        empl[0].setSalary(999);
        empl[0].setEmpId(1);
        empl[1] = new Employee();
        empl[1].setSalary(9);
		empl[1].setEmpId(2);
        empl[2] = new Employee();
        empl[2].setSalary(9999);
		empl[2].setEmpId(3);
        empl[3] = new Employee();
        empl[3].setSalary(99999999);
		empl[3].setEmpId(4);
        empl[4] = new Employee();
        empl[4].setSalary(99999);
		empl[4].setEmpId(5);
        empl[5] = new Employee();
        empl[5].setSalary(9999999);
		empl[5].setEmpId(6);

        for (int i = 0; i <= 5; i++) {

            System.out.println("Employee nr " + empl[i].empId + " salary " + empl[i].salary);
        } */



        /*int n = 6;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (empl[j].salary < empl[j + 1].salary) {
                    double temp = empl[j].salary;
                    empl[j].salary = empl[j + 1].salary;
                    empl[j + 1].salary = temp;
                    int temp1= empl[j].empId;
					empl[j].empId = empl[j + 1].empId;
					empl[j + 1].empId = temp1;

                }
        System.out.println("Employes from top salary to less");
        for (int i = 0; i <= 5; i++) {

            System.out.println("Employee nr " + empl[i].empId + " salary " + empl[i].salary);
        }
*/
/*int n = 6;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (e[j].salary < e[j + 1].salary) {
					temp = e[j];
					e[j] = e[j + 1];
					e[j + 1] = temp;

				} */


    }


}
