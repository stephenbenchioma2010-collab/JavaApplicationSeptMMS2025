public class Rational {
    private int num, den;

    private int gcd(int a, int b) { return b==0?a:gcd(b,a%b); }

    public Rational(int n, int d) {
        if(d==0) throw new IllegalArgumentException("Denominator cannot be zero");
        int g = gcd(Math.abs(n), Math.abs(d));
        num = n/g; den = d/g;
        if(den<0) { num*=-1; den*=-1; }
    }
    public Rational() { this(0,1); }

    public static Rational add(Rational a, Rational b) {
        return new Rational(a.num*b.den + b.num*a.den, a.den*b.den);
    }
    public static Rational subtract(Rational a, Rational b) {
        return new Rational(a.num*b.den - b.num*a.den, a.den*b.den);
    }
    public static Rational multiply(Rational a, Rational b) {
        return new Rational(a.num*b.num, a.den*b.den);
    }
    public static Rational divide(Rational a, Rational b) {
        return new Rational(a.num*b.den, a.den*b.num);
    }

    public String toString() { return num+"/"+den; }
    public String toFloating(int precision) { return String.format("%."+precision+"f", (double)num/den); }
}