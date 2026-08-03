package classwork1;

public class Main6 {
    public static void main(String[] args){
        Book defaultBook = new Book();
        Book paramBook = new Book("Java for Beginners","Sani Bello",3500);
        
        System.out.println("---Default Constructor---");
        defaultBook.display();
        System.out.println("---Parameterized Constructor---");
        paramBook.display();
    }
}
