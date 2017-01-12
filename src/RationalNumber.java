import java.lang.Math;
public class RationalNumber {
	private int num;
	private int den;
	private String fraction;
	
	public RationalNumber(int num, int den) { //constructs rational number to represent ratio num/den
		if (den == 0) {
			throw new IllegalArgumentException("Don't put a 0 in the denominator!");
		} else {
			if (den < 0) {
				den *= -1;
				num *= -1;
			}
			this.num = num / gcd(num, den);
			den /= gcd(num, den);
			this.den = den;
			if (den == 1) {
				fraction = this.num + "";
			} else {
				fraction = this.num + "/" + this.den;
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
	private int gcd(int num, int den) {
		while (den != 0) {
			num = num%den;
			int temp = den;
			den = num;
			num = temp;
		}
		return Math.abs(num);
	}
	/*public String add(int num, int den) {
		
	}*/
}
