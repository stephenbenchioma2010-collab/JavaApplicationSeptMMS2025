
package abstraction;

public class TestMe {
    public static void main(String[] args) {
        Student s1 = new Student("John","Doe","09012345678","12 Dalish Street,Manchester",001);
        
        s1.read();
        System.out.println("=======================\n");
        s1.study();
        
    }
}
