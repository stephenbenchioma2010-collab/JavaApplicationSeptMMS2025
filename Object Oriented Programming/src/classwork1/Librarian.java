
package classwork1;
import java.util.ArrayList;

class Librarian{
    public ArrayList<Book2> allBooks = new ArrayList<>();
    public ArrayList<Member> allMembers = new ArrayList<>();
    
    public void addBook(Book2 b){
        allBooks.add(b);
    }
    public void registerMember(Member m){
        allMembers.add(m);
    }
    public void borrowBook(Member m,Book2 b){
        if(b.isAvailable){
            b.isAvailable = false;
            m.borrowedBooks.add(b);
            System.out.println(m.name + " borrowed: " + b.title);
        }
        else{
            System.out.println("Book not available");
        }
    }
    public void returnBook(Member m,Book2 b){
        if(m.borrowedBooks.contains(b)){
            b.isAvailable = true;
            m.borrowedBooks.remove(b);
            System.out.println(m.name + " returned: " + b.title);
        }
    }
    public void showAvailableBooks(){
        System.out.println("\n---Available Books---");
        for(Book2 b : allBooks){
            if(b.isAvailable){
                System.out.println(b.id + " | " + b.title + " | " + b.author);
            }
        }
    }
}


