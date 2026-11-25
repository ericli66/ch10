import java.util.Scanner;

public class FractionQuiz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int correct = 0;
		int total = 0;
		boolean on = true;
		Fraction cAnswer = new Fraction();
		String symbol = " ";
		System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");
		
		while(on) {
			Fraction a = new Fraction();
			Fraction b = new Fraction();
			
			int operation = (int)(Math.random() * 4);
			
			if(operation == 0) { 
				cAnswer = Fraction.add(a, b);
				symbol = "+";
			} else if(operation == 1) {
				cAnswer = Fraction.subtract(a, b);
				symbol = "-";
			} else if(operation == 2) {
				cAnswer = Fraction.multiply(a, b);
				symbol = "*";
			} else {
				cAnswer = Fraction.divide(a, b);
				symbol = "/";
			}
			
			System.out.print(a + " " + symbol + " " + b + " = ");
			String answer = in.nextLine();
			
			if(answer.equals("quit")){
				on = false;
			} else {
				Fraction guess = new Fraction(answer);
				total ++;
				
				if(guess.equal(cAnswer)){
					correct ++;
					System.out.println("Correct!");
				} else {
					System.out.println("Wrong, the answer was " + cAnswer);
				}
			}
		}
	}
}
