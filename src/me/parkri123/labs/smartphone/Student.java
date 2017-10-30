package me.parkri123.labs.smartphone;

public class Student {
    //instance/global variables
    private String firstName;
    private String lastName;
    private double gpa;
    private String focus;

    //default constructor
    public Student(){
        firstName="J";
        lastName="Doe";
        gpa=0.0;
        focus="none";
    }

    //parameterized constructor
    public Student(String firstName, String lastName, double gpa, String focus){
        this.firstName=firstName;
        this.lastName= lastName;
        this.gpa= gpa;
        this.focus= focus;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getFocus() {
        return focus;
    }

    public void setFocus(String focus) {
        this.focus = focus;
    }

//helper/auxilary methods

    public String toString() {
        return "Name: "+lastName+", "+firstName+"\nGPA: "+gpa+"\nFocus:"+focus;
    }
}