
public class RationalNumber {
	private int num;
	private int den;
	private String fraction;
	
	public RationalNumber(int num, int den) { //constructs rational number to represent ratio num/den
		if (den == 0) {
			throw new IllegalArgumentException("Don't put a 0 in the denominator!");
		} else if () {
			int x = 
			while ()
		} else {
			this.num = num;
			this.den = den;
			if (den == 1) {
				fraction = num + "";
			} else {
				fraction = num + "/" + den;
			}
		}
	}
	public RationalNumber() {
		this(0,1);
	}
	
	public int getDenominator() {
		return den;
	}
	public int getNumerator() {
		return num;
	}
	public String toString() {
		return fraction;
	}

}
