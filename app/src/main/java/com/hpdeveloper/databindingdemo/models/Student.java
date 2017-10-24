package com.hpdeveloper.databindingdemo.models;

/**
 * Created by hirenpatel on 03/10/17.
 */

public class Student {

    private static final String TAG = Student.class.getSimpleName();

    public Student(int studentId, String studentFirstName, String studentLastname){
        id = studentId;
        firstName = studentFirstName;
        lastName = studentLastname;
    }

    private int id;
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void testing(int id) {
        // TODO implementation
    }

    public void getStudent() {
        // TODO implementation
    }
}
