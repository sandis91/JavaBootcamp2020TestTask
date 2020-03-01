package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person{
    public String schoolName;

    public Student(){
        this.schoolName="unknown";
    }
    public Student(String schoolName){
        this.schoolName=schoolName;
    }
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void introduce() {

        System.out.println("My name is " + getFirstName() + " " + getSecondName() + " and i am " + getAge() + " I study in university " +schoolName);
    }
    public static void main(String[] args){
        Student s=new Student();Person p = new Person();
        try {
            p.setFirstName("Sandis");
        } catch (CustomExceptionActivityy customExceptionActivityy) {
            customExceptionActivityy.printStackTrace();
        }
        try {
            p.setSecondName("Arbidans");
        } catch (CustomExceptionActivityy customExceptionActivityy) {
            customExceptionActivityy.printStackTrace();
        }
        p.setAge(28);
        s.schoolName="fictional school name";
        s.introduce();
    }
}
