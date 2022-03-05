package classes;

import java.util.Scanner;

// Write a program to create a Person object, with the following
// attributes:
//        - name as string
//        - surname as string
//        - age as int
//        - identity number as long
//        - type as string.
// Define a constructor for this class as well as accessors (getters)
// and mutators (setters) for all the attributes.
// Create two objects of type Person and display the information for
// them on separate lines.

public class Person {
    private String name;
    private String surname;
    private int age;
    private long identityNumber;
    private String type;

    public Person(String name, String surname, int age, long identityNumber, String type) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.identityNumber = identityNumber;
        this.type = type;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Identity Number: " + identityNumber);
        System.out.println("Type: " + type);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public long getIdentityNumber() {
        return identityNumber;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdentityNumber(long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public void setType(String type) {
        this.type = type;
    }
}
