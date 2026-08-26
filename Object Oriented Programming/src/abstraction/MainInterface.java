
package abstraction;

public class MainInterface {
    public static void main(String[] args){
        SmartPhone smartPhone = new SmartPhone();
        
        Nokia3310 nokia3310 = new Nokia3310();
        
        System.out.println("\nSmartPhone Interface");
        smartPhone.playGame();
        smartPhone.playMusic();
        smartPhone.takePicture();
        smartPhone.playMovie();
        smartPhone.connectToWiFi();  
        
        System.out.println("\nNokia3310 Interface");
        nokia3310.playGame();
        nokia3310.playMusic();
    }
}
