
package abstraction;

public class SmartPhone implements Camera,Movie,Music,WiFi,Game{
   
    @Override
    public void takePicture(){
        System.out.println("John is taking pictures.......");
    }
    @Override
    public void playMovie(){
        System.out.println("John is playing a movie.......");
    }
    @Override
    public void playMusic(){
        System.out.println("John is playing music.......");
    }
    @Override
    public void connectToWiFi(){
        System.out.println("John is connecting to wifi.......");
    }
    @Override
    public void playGame(){
        System.out.println("John is playing a game.......");
    }
}
