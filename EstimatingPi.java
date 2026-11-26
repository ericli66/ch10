public class EstimatingPi{
	public static void main(String[] args){
		Fraction MILU = new Fraction(355, 113);
		final double EPSILON = Math.abs( Math.PI - MILU.toDouble());
		Fraction guess = new Fraction(3,1);
		
		while(Math.abs(Math.PI - guess.toDouble()) >= EPSILON) {
			if(guess.toDouble() > Math.PI) {
				guess.setDenom(guess.getDenom() + 1);
			} else {
				guess.setNum(guess.getNum() + 1);
			}
		}
		
		System.out.println(guess);
	}
}
