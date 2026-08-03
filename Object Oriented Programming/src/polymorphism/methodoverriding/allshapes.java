
package polymorphism.methodoverriding;

public class allshapes {
    public static void main(String[] args){
        shape[] shapeObject ={
            new circle(),
            new triangle(),
            new rectangle()
        };
        
        for(shape Shape : shapeObject){
            Shape.draw();
        }
    }
}