package studio7;

public class Die {
	private int n;
	public Die (int initn) {
		n = initn;
	}
	public int getValue() {
		double value = (Math.random()*(n-1))+2;
		return (int) value;
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die die1 = new Die(4);
		System.out.println(die1.getValue());
		}
		
}
