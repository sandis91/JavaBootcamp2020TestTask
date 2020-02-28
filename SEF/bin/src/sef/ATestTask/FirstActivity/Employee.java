package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    public int empId;
    public String jobTitle;
    public String companyName;
    public double salary;

    //TODO 1 create different constructors
    //Behavior - default constructor
    public Employee() {
        this.empId = 0;
        this.jobTitle = "Unknown";
        this.companyName = "Unknown";
        this.salary = 0;
    }

    //Behavior - parameterized constructor
    public Employee(String firstName, String secondName,int age, int empId, String jobTitle, String companyName, double salary) {
        super(firstName,secondName,age);

        this.empId = empId;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    //TODO 2 add getters and setters
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //TODO 3 override method announce()
    public void announce() {
        Person p = new Person();
        p.setFirstName("Sandis");
        p.setSecondName("Arbidans");
        p.setAge(28);
        System.out.println("My name is " + p.getFirstName() + " " + p.getSecondName() + " and i am " + p.getAge() + " I work as " + getJobTitle() + " in company " + getCompanyName());

    }

    public static void main(String[] args) {
        Employee ez = new Employee();
        ez.setCompanyName("fictionalcompany");
        ez.setEmpId(0);
        ez.setJobTitle("fictionalposition");
        ez.setSalary(999999);
        ez.announce();
    }


}