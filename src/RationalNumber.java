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
	public RationalNumber() { //if no parameters specified, rn becomes 0/1
		this(0,1);
	}
	
	//methods
	public int getDenominator() {
		return den;
	}
	public int getNumerator() {
		return num;
	}
	public String toString() {
		return fraction;
	}
	private int gcd(int num, int den) { //calculates gcd
		while (den != 0) {
			num = num%den;
			int temp = den;
			den = num;
			num = temp;
		}
		return Math.abs(num);
	}
	public String add(int num, int den) { //adds rn in class and parameter rn
		den0(den);
		int temp = this.den;
		this.num *= den;
		this.den *= den;
		num *= temp;
		int gcd = gcd((num + this.num),(this.den));
		this.num = (this.num + num) / gcd;
		this.den /= gcd;
		negate();
		return this.num + "/" + this.den;
	}
	public String subtract(int num, int den) { //this fraction - parameter fraction
		den0(den);
		int temp = this.den;
		this.num *= den;
		this.den *= den;
		num *= temp;
		int gcd = gcd((-num + this.num),(this.den));
		this.num = (this.num - num) / gcd;
		negate();
		this.den /= gcd;
		return this.num + "/" + this.den;
	}
	public String multiply(int num, int den) {
		den0(den);
		this.num *= num;
		this.den *= den;
		int gcd = gcd(this.num,this.den);
		negate();
		this.num /= gcd;
		this.den /= gcd;
		return this.num + "/" + this.den;
	}
	public String divide(int num, int den) { //this rn / parameter rn
		den0(den);
		this.num *= den;
		this.den *= num;
		int gcd = gcd(this.num,this.den);
		negate();
		this.num /= gcd;
		this.den /= gcd;
		return this.num + "/" + this.den;
	}
	private void negate() {
		if (this.den < 0) {
			this.den *= -1;
			this.num *= -1;
		}
	}
	private void den0(int den) {
		if (den == 0) {
			throw new IllegalArgumentException("Don't put a 0 in the denominator!");
		}
	}
}