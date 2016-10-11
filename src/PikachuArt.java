

public class PikachuArt {
	public static void main(String[] args) {
		base(' ',7);
		System.out.print('^');
		base(' ', 9);
		System.out.println('^');
		base(' ', 6);
		under('/', '_', '\\', 1);
		base(' ', 7);
		under('/', '_', '\\', 1);
		enter();
		base(' ', 5);
		System.out.print('/');
		base(' ', 3);
		under('\\', '_', '/', 5);
		base(' ', 3);
		System.out.println('\\');
		base(' ', 4);
		under('/', ' ', '\\', 15);
		enter();
		base(' ', 3);
		under('|', ' ', '(', 4);
		under(')', ' ', '(', 5);
		under(')', ' ', '|', 4);
		enter();
		base(' ', 4);
		under('\\', ' ', 'O', 2);
		base(' ', 4);
		System.out.print("o");
		base(' ', 4);
		under('O', ' ', '/', 2);
		enter();
		base(' ', 5);
		under('\\', ' ', '/', 13);
		enter();
		base(' ', 5);
		under('/', ' ', '\\', 13);
		enter();
		vertical();
		base(' ', 5);
		under('\\', ' ', '/', 13);
		enter();
		base(' ', 6);
		under('\\', '_', '/', 11);
		System.out.println("\n");
		for (int i = 7; i <= 11; i+=2) {
			base(' ', 12 - i);
			base('<', i);
			System.out.print('|');
			base('>', i);
			System.out.println();
		}
	}
	public static void vertical() {
		for (int l = 1; l <= 3; l++) {
			base(' ', 4);
			under('|', ' ', '|', 15);
			enter();
		}
	}
	public static void enter() {
		System.out.println();
	}
	public static void under(char ch, char hc, char tu, int num) {
		System.out.print(ch);
		base(hc, num);
		System.out.print(tu);
	}
	public static void base(char ch, int num) {
		for (int j = 1; j <= num; j++)
			System.out.print(ch);
	}
}