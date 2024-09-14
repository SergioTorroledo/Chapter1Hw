/**
 * Class:Person
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:9/12/2024
 * Course:ITEC 2150-section 01
 * This class displays a Person name , age and eye color and saved.
 * */
package Chapter1Hw;

//The Person class is what we using to created the code for the person
public class Person {
    //This the instance variables this is the properties for the Person Class
    private String name;
    private int age;
    private String eyeColor;

    //This the started of the default values
    public Person(){
    this.name=" ";
    this.age=0;
    this.eyeColor=" ";
    }
    // The 3 arguments constructor to initialize instance variable
    public Person(String name, int age,String eyeColor){
        this.name=name;
        this.age = age;
        this.eyeColor=eyeColor;

    }
    //Getter method for  Name
    public String getName(){
        return name;
}
//Setter method for Name
    public void setName(String name) {
        this.name = name;
    }
    //Getter method for age
    public int getAge() {
        return age;
    }
    //Setter method for age
    public void setAge(int age){
        this.age = age;
    }
    //Getter for EyeColor
public String getEyeColor(){
        return eyeColor;
}
//Setter for EyeColor
    public void setEyeColor(java.lang.String eyeColor) {
        this.eyeColor = eyeColor;
    }
    // Overriding the toString method to provide a string representatation of the Person object
public String  toString(){
        return "Person [Name: " + name + ", Age: " + age + ", Eye Color:" + eyeColor + "]";
}
//Method to print a message with the person's name
public void talk(){
    System.out.println("welcome,coders! I am " + name);
}

}
