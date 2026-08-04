abstract class Shape {
    public abstract String getDesc();
}
abstract class TwoDimensionalShape extends Shape {
    public abstract double getArea();
}
abstract class ThreeDimensionalShape extends Shape {
    public abstract double getArea();
    public abstract double getVolume();
}

class Circle extends TwoDimensionalShape {
    private double r;
    public Circle(double r){this.r=r;}
    public double getArea(){return Math.PI*r*r;}
    public String getDesc(){return "Circle (radius="+r+")";}
}
class Square extends TwoDimensionalShape {
    private double s;
    public Square(double s){this.s=s;}
    public double getArea(){return s*s;}
    public String getDesc(){return "Square (side="+s+")";}
}
class Sphere extends ThreeDimensionalShape {
    private double r;
    public Sphere(double r){this.r=r;}
    public double getArea(){return 4*Math.PI*r*r;}
    public double getVolume(){return (4.0/3)*Math.PI*r*r*r;}
    public String getDesc(){return "Sphere (radius="+r+")";}
}
class Cube extends ThreeDimensionalShape {
    private double s;
    public Cube(double s){this.s=s;}
    public double getArea(){return 6*s*s;}
    public double getVolume(){return s*s*s;}
    public String getDesc(){return "Cube (side="+s+")";}
}

// Test program
public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5),new Square(4),new Sphere(3),new Cube(2)};
        for (Shape s : shapes) {
            System.out.println(s.getDesc());
            if (s instanceof TwoDimensionalShape)
                System.out.printf("Area: %.2f%n",((TwoDimensionalShape)s).getArea());
            else if (s instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape t=(ThreeDimensionalShape)s;
                System.out.printf("Surface Area: %.2f%nVolume: %.2f%n",t.getArea(),t.getVolume());
            }
            System.out.println();
        }
    }
}