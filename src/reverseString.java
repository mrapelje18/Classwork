
public class reverseString {
	public static void reverse(String s) {
		if (s.length() == 1) {
			System.out.print(s);
		} else {
			reverse(s.substring(1));
			System.out.print(s.substring(0,1));
		}
	}
	public static void main(String[] args) {
		reverse("google");
	}
}
