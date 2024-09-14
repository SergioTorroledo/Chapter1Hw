/**
 * Class:Bike
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:9/12/2024
 * Course:ITEC 2150-section 01
 * This class displays The odels a bike with attributes like number of wheels, manufacturer, and year.
 * */
package Chapter1Hw;
//The Bike class models a bike with attributes like number of wheels, manufacturer, and year.
public class Bike {
    // Instance variables (properties of the Bike class)
    private int numberOfWheels;
    private String manufacturer;
    private int year;
    //Default values
    public Bike(){
        this.numberOfWheels=2;
        this.manufacturer = "Schwinn";
        this.year=2014;

    }
    //Constructor with parameters to initialize instance variable
    public Bike(int numberOfWheels,String manufacturer,int year){
        this.numberOfWheels = numberOfWheels;
        this.manufacturer=manufacturer;
        this.year=year;
    }
    //Getter method for number of wheels
    public int getNumberOfWheels(){
        return numberOfWheels;
    }
    // Setter method for number of wheels
    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }
    //Getter method for the manufacturer
    public String getManufacturer() {
        return manufacturer;
    }
    // Setter method for manufacturer
    public void setManufacturer(String manufacturer){
        this.manufacturer=manufacturer;
    }
    //Getter method for the year
    public int getYear() {
        return year;
    }
    // Setter method for year
    public void setYear(int year ){
        this.year=year;
    }
    //// Overriding the toString method to provide a string representation of the Bike object
    public String toString(){
        return "Bike [Number of wheels: " + numberOfWheels + " , Manufacture: " + manufacturer + ", year: " + year + "]";

    }
}
