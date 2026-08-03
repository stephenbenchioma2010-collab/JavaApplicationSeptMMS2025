
package classwork1;

public class Book {
    String title;
    String author;
    double price;
    
    public Book() {
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
    }
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display(){
        System.out.println("Title: " + title + " | Author: " + author + " | Price: $" + price);
    }
    
    
}
