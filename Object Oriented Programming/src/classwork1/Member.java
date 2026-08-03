
package classwork1;
import java.util.ArrayList;

class Member{
    String id,name;
    ArrayList<Book2> borrowedBooks = new ArrayList<>();

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
}

