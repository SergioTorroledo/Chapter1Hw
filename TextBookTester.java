/**
 * Class:TextBookTester
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:9/12/2024
 * Course:ITEC 2150-section 01
 * This class checks if the TextBook class works properly
 * */
package Chapter1Hw;

import java.util.ArrayList;

public class TextBookTester {
    public static void main(String[] args) {
        // Creating the first Textbook object using the no-argument constructor

        TextBook book1 = new TextBook();
        //prints the details of  book1 using the toString method
        System.out.println("Book 1 details");
        System.out.println(book1.toString());
        // Creating the second Textbook object using the 3-argument constructor
        TextBook book2 = new TextBook("A SIMPLE INTRODUCTION TO PYTHON","Stephen Lynch",112 );
        // Print the details of book2
        System.out.println("Book 2 details");
        System.out.println(book2.toString());
        // Modifying book1 using setter methods
        book1.setTitle("Intermediate Programing");
        book1.setAuthor("Hyesung Park, Sonal S. Dekhane, Wei Jin, Cynthia Johnson, Yan Zong Ding, Tacksoo Im");
        book1.setPages(185);
        // Print the modified details of book1
        System.out.println("\nModified Book 1 details:");
        System.out.println(book1.toString());
        // Testing the instance method on book2
        System.out.println("\nTesting instance method on book2:");
        book2.readBook();
        // Creating an ArrayList of Textbooks
        ArrayList<TextBook> bookList = new ArrayList<>();
        // Adding both books to the list
        bookList.add(book1);
        bookList.add(book2);
        // Print the entire list of textbooks
        System.out.println("\nList of all Textbooks:");
        for (TextBook book : bookList){
            System.out.println(book);
        }


    }
}
