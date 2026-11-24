public class FractionDriver {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(6, 3);
        Fraction f3 = new Fraction("11/4");
        Fraction f4 = new Fraction(f3);
        Fraction half = new Fraction(1, 2);
        Fraction third = new Fraction(1, 3);
        Fraction product = Fraction.multiply(half, third);
        Fraction quotient = Fraction.divide(half, third);
        
        System.out.println(f1);
        System.out.println(f2);
        f2.reduce();
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4.toDouble());
		System.out.println(product);
		System.out.println(quotient);
    }
}
