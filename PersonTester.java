/**
 * Class:Person
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:9/12/2024
 * Course:ITEC 2150-section 01
 * This class displays a Person class and it checks if works
 * */
package Chapter1Hw;

public class PersonTester {
    public static void main(String[] args) {
        //Person object using the no-argument constructor
        Person person1 = new Person();
        //Displaying the detail of person1 using the toString method
        System.out.println(person1.toString());
        //Changing the name of person1 using the setter method
        person1.setName(("Howard Roark"));
        //Invoking the talk method, which prints the name of the person
        person1.talk();
        //Person object using the argument constructor
        Person mainPerson = new Person("Sergio",25,"Brown");
        //Displaying the detail of mainPerson using the toString method
        System.out.println(mainPerson.toString());
        ////Invoking the talk method, which prints the name,age,eyeColor of the person
        mainPerson.talk();

    }
}
