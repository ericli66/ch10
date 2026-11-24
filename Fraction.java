public class Fraction {
    // instance variables (attributs, fields)
    private int numerator, denominator;

    // constructors
    public Fraction() { // defalt constuctor
        numerator = 1;
        denominator = 2;
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
		int num = a.getNum() * b.getDenom() + b.getNum() * a .getDenom()
	}
}
