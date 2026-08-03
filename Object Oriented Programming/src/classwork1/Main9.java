package classwork1;

public class Main9 {
    public static void main(String[] args){
       Librarian lib = new Librarian();
       lib.addBook(new Book2("B001","Clean Code","Robert Martin"));
       
       lib.addBook(new Book2("B002","Effective Java","Joshua Bloch"));
       
       Member std = new Member("M001","Chid Okoro");
       lib.registerMember(std);
       lib.showAvailableBooks();
               
       lib.borrowBook(std,lib.allBooks.get(0));
       lib.showAvailableBooks();
       
       lib.returnBook(std,lib.allBooks.get(0));
       lib.showAvailableBooks();
    }
}
