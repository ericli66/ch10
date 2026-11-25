public class Fraction {
    // instance variables (attributs, fields)
    private int numerator, denominator;

    // constructors
    public Fraction() { // defalt constuctor
        setNum((int) (Math.random() * 9 + 1));
        setDenom((int) (Math.random() * 9 + 1));
    }

    public Fraction(int n, int d) { // parametoerized constructor
        numerator = n;
        setDenom(d);
    }

    public Fraction(String str) {
        String n = str.substring(0, str.indexOf("/"));
		String d = str.substring(str.indexOf("/") + 1);
		setNum(Integer.parseInt(n));
        setDenom(Integer.parseInt(d));
    }

    public Fraction(Fraction o) {
        numerator = o.numerator;
        denominator = o.denominator;
    }

    // behaviour methods (accessor, mutator, helper)
    // (accessor Methods)
    public int getNum() {
        return numerator;
    }

    public int getDenom() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public double toDouble() {
        double n = numerator;
        double d = denominator;
        return n / d;
    }
    
    public boolean equal(Fraction f) {
		return numerator == f.getNum() && denominator == f.getDenom();
	}
    
    // (Mutator Methods)
    public void setNum(int n){
		numerator = n;
	}
	
	public void setDenom(int d){
        if (d != 0) {
            denominator = d;
        } else {
            denominator = 1;
            System.out.println("Error: denominator cannot be zero");
        }
	}

	public void reduce() {
		int gcf = gcf(numerator, denominator);
		
		numerator = numerator / gcf;
		denominator = denominator / gcf;
	}
	
	
	
	// (Helper Methods)
	private static int gcf(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		
		while ( a != b) {
			if(a > b) {
				a -= b;
			} else {
				b-= a;
			}
		}
		return a;
	}
		
	// Static methods
	public static Fraction multiply(Fraction a, Fraction b) {
		int num = a.getNum() * b.getNum();
		int denom = a.getDenom() * b.getDenom();
		Fraction x = new Fraction(num, denom);
		x.reduce();
		return x;
	}
	
	public static Fraction divide(Fraction a, Fraction b) {
		if (b.getNum() == 0) System.out.println("Error: denominator cannot be zero");
		
		Fraction reciprocal = new Fraction(b.getDenom(), b.getNum());
		Fraction x = Fraction.multiply(a, reciprocal);
		
		return x;
	}
	
	public static Fraction add(Fraction a, Fraction b) {
		int num = a.getNum() * b.getDenom() + b.getNum() * a .getDenom();
		int denom = a.getDenom() * b.getDenom();
		
		Fraction r = new Fraction(num, denom);
		r.reduce();
		return r;
	}
	
	public static Fraction subtract(Fraction a, Fraction b) {
		int num = a.getNum() * b.getDenom() - b.getNum() * a .getDenom();
		int denom = a.getDenom() * b.getDenom();
		
		Fraction r = new Fraction(num, denom);
		r.reduce();
		return r;
	}
}
