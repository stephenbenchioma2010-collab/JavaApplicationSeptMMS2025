
package abstraction;

public class Nokia3310 implements Music,Game{
   
    @Override
    public void playMusic(){
        System.out.println("John is playing music.......");
    }
    @Override
    public void playGame(){
        System.out.println("John is playing a game.......");
    }
}
