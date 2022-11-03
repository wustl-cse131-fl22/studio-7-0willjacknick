package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	public Fraction (int initnumerator , int initdenominator) {
		numerator = initnumerator;
		denominator = initdenominator;
	}
	public int getReciprocal(){
		int reciprocal1 = numerator;
		int reciprocal2= denominator;
		return reciprocal1 / reciprocal2;
	}
		
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction fraction1 = new Fraction(1,1);
		System.out.println(fraction1.getReciprocal());
	}

}
