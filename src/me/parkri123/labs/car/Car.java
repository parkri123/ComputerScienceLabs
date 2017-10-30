package me.parkri123.labs.car;

//an object is a class that describes some concrete idea
//any given object has STATE and BEHAVIOR
//STATE- GLOBAL OR INSTANCE VARIABLES
//BEHAVIOR- METHODS THAT ARE REQUIRED FOR THE OBJECT TO FUNCTION
public class Car {
    //STATE
    //COLOR use string
    //MAKE  use string
    //MPG   use double
    //IS IT ANTIQUE use boolean
    //instance/global variables- variables that ban be used at any point in this class
    private String color;
    private String make;
    private double mpg;
    private boolean isAntique;

    //constructors- initialize the instance variable to some default or given values
    //default constructor- take in no parameters
    public Car(){
        color = "";
        make = "";
        mpg = 0.0;
        isAntique = false;
    }
    //parameterized constructor
    public Car(String color, String make, double mpg, boolean isAntique){
        this.color = color;
        this.make = make;
        this.mpg = mpg;
        this.isAntique = isAntique;
    }


    //accessors- get methods
    public String getColor(){
        return this.color;
    }

    public String getMake() {
        return make;
    }

    public double getmpg() {
        return mpg;
    }
    public boolean getisAntique(){
        return isAntique;
    }

    //modifiers
    public void setColor(String c){
        color = c;
    }

    public void setMake(String m) {
        make = m;
    }

    public void setMpg(double mp) {
        mpg = mp;
    }

    public void setAntique(boolean antique) {
        isAntique = antique;
    }
    //helpers

    //private/public returntype identifier(parameter){
    //  ***code goes here***
    //}

}
