/**
 * Class:BikeTester
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:9/12/2024
 * Course:ITEC 2150-section 01
 * This class displays that the bike class works properly
 * */
package Chapter1Hw;

import java.util.ArrayList;
import java.util.List;

public class BikeTester {
    //main class
    public static void main(String[] args) {
        // Creating Bike object using the no-arg constructor
        Bike bike1 = new Bike();
        //Print details of bike 1
        System.out.println("Bike 1 details:");

        System.out.println(bike1.toString());
        // Creating Bike2 object using the no-arg constructor
        Bike bike2 =  new Bike();
        // Changing bike2 properties using setter methods
        bike2.setNumberOfWheels(3);//Set the number of wheels

        bike2.setManufacturer("Trek");//Set the manufacturer to Trek

        bike2.setYear(2019);//Set the year to 2018
        //Print the details of Bike2
        System.out.println("\nBike 2 details:");

        System.out.println(bike2.toString());
        //Creating a ArrayList of bikes
        List<Bike> bikeList = new ArrayList<>();
        //Adding the  bikes to the list
        bikeList.add(bike1);
        bikeList.add(bike2);
        // Printing all bikes in bikeList
        System.out.println("\nList of Bikes:");
        for (Bike bike : bikeList){
            System.out.println(bike);
        }
        // Count total number of wheels from all bikes in the list
        int totalWheels = 0;

        for(Bike bike : bikeList){
            totalWheels += bike.getNumberOfWheels();
        }
        System.out.println("\nTotal number of wheels: " + totalWheels);
        // Find the year of the oldest bike in the list
        int oldestYear= bikeList.get(0).getYear();
        for (Bike bike : bikeList){
            if(bike.getYear() < oldestYear){
                oldestYear = bike.getYear();
            }
        }
        System.out.println("Year of the oldest bike " + oldestYear);
    }


}
