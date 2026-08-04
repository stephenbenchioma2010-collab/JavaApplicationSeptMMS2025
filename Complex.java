public class Complex {
    private double real;
    private double imaginary;

    public Complex() { this(0, 0); }
    public Complex(double r, double i) { real = r; imaginary = i; }

    public Complex add(Complex other) {
        return new Complex(real + other.real, imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(real - other.real, imaginary - other.imaginary);
    }

    public String toString() {
        return String.format("(%.2f, %.2f)", real, imaginary);
    }
}

// Test:
Complex c1 = new Complex(3.5, 2.0);
Complex c2 = new Complex(1.5, 4.0);
System.out.println(c1.add(c2));
System.out.println(c1.subtract(c2));