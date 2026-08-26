
package runtime;

public class ArrayOutOfBoundsException {
    public static void main(String[] args) {
        try{
        int[] age = {16,21,19,20,14};
        
        System.out.println("Element st index 5 is " + age[2]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }
    }
}
