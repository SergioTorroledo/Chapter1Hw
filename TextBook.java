/**
 * Class:TextBook
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:9/12/2024
 * Course:ITEC 2150-section 01
 * This class models a textbook with title, author, and number of pages
 * */
package Chapter1Hw;
// The Textbook class models a textbook with title, author, and number of pages
public class TextBook {
    // Instance variables that attributes of the textbook)
    private String title; //Stores the title of the textbook
    private String author;//Stores the author if the textbook
    private int pages;//Store the number of pages in the textbook
    //Default settings
    public TextBook(){
        this.title="";
        this.author ="";
        this.pages =0;
    }
    // The 3-argument constructor to initialize instance variables
    public TextBook(String title, String author, int pages ){
        this.title=title;
        this.author=author;
        this.pages=pages;
    }
    //Getter method for the title
    public String getTitle(){
        return title;
    }
    //Setter method for the title
    public void setTitle(String title){
        this.title = title;
    }
    //Getter method for the author
    public String getAuthor(){
        return author;
    }
    //Setter method for the author
    public void setAuthor(String author) {
        this.author = author;
    }
    //Getter method for pages
    public int getPages() {
        return pages;
    }
    //Setter method for pages
    public void setPages(int pages) {
        this.pages = pages;
    }
    //Instance method to print the textbook's details
    public void readBook(){
        System.out.println("Reading the textbook: " + title + " by " + author);
    }
    //Overriding the toString method to provide a string representation of the textbook object
    public String toString(){
        return "Text book [Title: " + title + ", Author: " + author + ", Pages: " + pages + "]";
    }
}
