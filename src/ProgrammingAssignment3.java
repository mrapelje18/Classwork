

public class ProgrammingAssignment3 {
	public static final int SIZE = 4;
	public static void main(String[] args) {
		base();
	}
	public static void stick() {
		for (int l = 1; l <= SIZE; l++) {
			for (int i = 1; i <= (3*SIZE); i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= 1; i++) {
				System.out.println("||");
			}
		}
	}
	public static void base() {
		for (int l = 1; l <= SIZE; l++) {
			for (int i = 1; i <= (SIZE - l); i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= 1; i++) {
				System.out.print("/");
			}
			System.out.print("||");
			System.out.print("|");
		}
		for (int i = 1; i <= (SIZE*6); i++) {
			System.out.print("\"");
		}
	}
}