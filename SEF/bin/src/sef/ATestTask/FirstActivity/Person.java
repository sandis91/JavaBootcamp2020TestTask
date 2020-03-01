package sef.ATestTask.FirstActivity;


import java.io.IOException;
import java.util.regex.Pattern;

public class Person {
    public String firstName;
    public String secondName;
    public int age;


//TODO 1 Implement Person Attributes

    //Behavior - default constructor
    public Person() {
        this.firstName = "Unknown";
        this.secondName = "Unknown";
        this.age = 0;
    }

    //Behavior - parameterized constructor
    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }


    // getter for String firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws CustomExceptionActivityy{
        if (stringContainsNumber(firstName)==true) {throw new CustomExceptionActivityy();}
        else
        this.firstName = firstName;
    }

    // getter for int age
    public int getAge() {
        return age;
    }

    // setter for int age
    public void setAge(int age) {

            this.age = age;

    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) throws CustomExceptionActivityy{
        if (stringContainsNumber(secondName)==true) {throw new CustomExceptionActivityy();}
        else
        this.secondName = secondName;
    }

    //TODO 2 add all person info into announce() method

    public void announce() {
        System.out.println("My name is " + getFirstName() + " " + getSecondName() + " and i am " + age);
    }
    public static boolean stringContainsNumber(String s)
    {
        return Pattern.compile( "[0-9]" ).matcher( s ).find();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(stringContainsNumber("ahasjakk5"));
        Person a = new Person();
        try {
            a.setFirstName("Sandis1");
        } catch (CustomExceptionActivityy customExceptionActivityy) {
            customExceptionActivityy.printStackTrace();
        }
        try {
            a.setSecondName("Arbidans");
        } catch (CustomExceptionActivityy customExceptionActivityy) {
            customExceptionActivityy.printStackTrace();
        }
        a.setAge(28);
        a.announce();
    }
}

