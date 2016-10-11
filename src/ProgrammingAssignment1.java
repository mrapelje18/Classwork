

public class ProgrammingAssignment1 {
	public static void main(String[] args) {
		for (int l = 1; l<=7; l++) {
			for (int i = 1; i <= (7 - l); i++) {
				System.out.print("*");
			}
			for (int j = 1; j <= l; j++) {
				System.out.print(" ");
			}
			for (int fs = 1; fs <= (14 - 2*l); fs++) {
				System.out.print("/");
			}
			for (int bs = 1; bs <= (l - 1); bs++) {
				System.out.print("\\\\");
			}
			for (int j = 1; j <= l; j++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= (7 - l); i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}