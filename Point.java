class Point {
    private double x, y;
    public Point(double x, double y) { this.x = x; this.y = y; }
    public double getX() { return x; }
    public double getY() { return y; }
}

class Quadrilateral {
    private Point p1, p2, p3, p4;
    public Quadrilateral(Point a, Point b, Point c, Point d) {
        p1 = a; p2 = b; p3 = c; p4 = d;
    }
    public Point getP1() { return p1; }
    public Point getP2() { return p2; }
    public Point getP3() { return p3; }
    public Point getP4() { return p4; }
}

class Trapezoid extends Quadrilateral {
    public Trapezoid(Point a, Point b, Point c, Point d) { super(a,b,c,d); }
    public double area(double base1, double base2, double height) {
        return (base1 + base2) * height / 2;
    }
}

class Parallelogram extends Quadrilateral {
    public Parallelogram(Point a, Point b, Point c, Point d) { super(a,b,c,d); }
    public double area(double base, double height) { return base * height; }
}

class Rectangle extends Parallelogram {
    public Rectangle(Point a, Point b, Point c, Point d) { super(a,b,c,d); }
    public double area(double width, double length) { return width * length; }
}

class Square extends Rectangle {
    public Square(Point a, Point b, Point c, Point d) { super(a,b,c,d); }
    public double area(double side) { return side * side; }
}

// Test Program
public class TestShapes {
    public static void main(String[] args) {
        Square sq = new Square(new Point(0,0), new Point(2,0), new Point(2,2), new Point(0,2));
        Rectangle rect = new Rectangle(new Point(0,0), new Point(4,0), new Point(4,2), new Point(0,2));
        System.out.println("Square area: " + sq.area(2));
        System.out.println("Rectangle area: " + rect.area(4,2));
    }
}