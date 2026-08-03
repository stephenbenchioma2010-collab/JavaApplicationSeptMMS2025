
package polymorphism.methodoverriding;

public class AllAnimals {
    public static void main(String[] args){
        animal[] animalObject ={
            new dog(),
            new cat(),
            new lion()
        };
        
        for(animal Animal : animalObject){
            Animal.sound();
        }
    }
}
