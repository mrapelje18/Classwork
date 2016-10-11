

public class ProgrammingAssignment2 {
	public static final int SIZE = 3;
	public static void main(String[] args) {
		topbottom();
		starline();
		up();
		down();
		starline();
		down();
		up();
		starline();
		topbottom();
	}
	public static void topbottom() {
		for (int l = 1; l <= (SIZE*2-1); l++) {
			for (int i = 1; i <= (SIZE*2-l); i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= l; i++) {
				System.out.print("/");
			}
			for (int i = 1; i <= 2; i++) {
				System.out.print("*");
			}
			for (int i = 1; i <= l; i++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}
	public static void starline() {
		System.out.print("+");
		for (int l = 1; l <= (2*SIZE); l++)
			System.out.print("=*");
		System.out.println("+");
	}
	public static void up() {
		for (int l = 1; l <= SIZE; l++) {
			System.out.print("|");
			for (int i = 1; i <= (SIZE - l); i++) {
				System.out.print(".");
			}
			for (int i = 1; i <= l; i++) {
				System.out.print("/\\");
			}
			for (int i = 1; i <= (SIZE - l); i++) {
				System.out.print(".");
			}
			for (int i = 1; i <= (SIZE - l); i++) {
				System.out.print(".");
			}
			for (int i = 1; i <= l; i++) {
				System.out.print("/\\");
			}
			for (int i = 1; i <= (SIZE - l); i++) {
				System.out.print(".");
			}
			System.out.println("|");
		}
	}
	public static void down() {
		for (int l = 1; l <= SIZE; l++) {
			System.out.print("|");
			for (int i = 1; i <= (l - 1); i++) {
				System.out.print(".");
			}
			for (int i = 1; i <= (SIZE - l + 1); i++) {
				System.out.print("\\/");
			}
			for (int i = 1; i <= (l - 1); i++) {
				System.out.print(".");
			}
			for (int i = 1; i <= (l - 1); i++) {
				System.out.print(".");
			}
			for (int i = 1; i <= (SIZE - l + 1); i++) {
				System.out.print("\\/");
			}
			for (int i = 1; i <= (l - 1); i++) {
				System.out.print(".");
			}
			System.out.println("|");
		}
	}
}