import java.util.*;

public class romanNumerals {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Type in a number. ");
		int bi = num.nextInt();
		if (bi >= 1) {
			if (bi < 5000) {
				hi(bi);
			} else {
				System.out.print("Cannot compute.");
			}
		}
		num.close();
	}
	public static void hi(int i) {//method to print the numerals;
		if (i >= 1000) {
			int w = i/1000;
			repeat(w,"M");
			i = i%1000;
		}
		if (i >= 100) {
			num(i, 100, "CM", "CD", "D", "C");
			i = i%100;
		}
		if (i >= 10) {
			num(i, 10, "XC", "XL", "L", "X");
			i = i%10;
		}
		if (i >= 1) {
			if (i == 9) {
				System.out.print("IX");
			} else if (i == 4) {
				System.out.print("IV");
			} else if (i >= 5) {
				System.out.print("V");
			} else {
				repeat(i,"I");
			}
		}
	}
	public static void repeat(int j, String s) {
		for (int x = 1; x <= j; x++) {
			System.out.print(s);
		}
	}
	public static void num(int i, int j, String s1, String s2, String s3, String s4) {
		int w = i/j;
		if (w == 9) {
			System.out.print(s1);
		} else if (w == 4) {
			System.out.print(s2);
		} else if (w >= 5) {
			System.out.print(s3);
			w = w%5;
			repeat(w,s4);
		}
	}
}