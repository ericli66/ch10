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

    public int getDen0m() {
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
}
