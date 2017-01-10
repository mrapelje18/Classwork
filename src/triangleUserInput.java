import java.util.*;

public class triangleUserInput {
	public static void main(String[] args) {
		System.out.println("Please input valid side lengths of a triangle."); //side length
		Scanner userInput = new Scanner(System.in); //scans user input
		System.out.print("first side of triangle: ");
		int a = userInput.nextInt(); //assigns input to variable
		System.out.print("second side of triangle: ");
		int b = userInput.nextInt(); //assigns input to variable
		System.out.print("third side of triangle: ");
		int c = userInput.nextInt(); //assigns input to variable
		System.out.println("The angles of the triangle given in degrees is: " + angleA(a,b,c) + ", " + angleB(a,b,c) + ", and " + angleC(a,b,c) + "."); //prints result
		userInput.close();
	}
	public static double angleA(double a, double b, double c) {
		double i = (-1)*(Math.pow(a,2)) + Math.pow(b,2) + Math.pow(c,2);
		double A = Math.acos(i/(2*b*c));
		return Math.toDegrees(A);
	}
	public static double angleB(double a, double b, double c) {
		double i = (-1)*(Math.pow(b,2)) + Math.pow(a,2) + Math.pow(c,2);
		double B = Math.acos(i/(2*a*c));
		return Math.toDegrees(B);
	}
	public static double angleC(double a, double b, double c) {
		double n = Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,2);
		double C = Math.acos(n/(2*a*b));
		return Math.toDegrees(C);
	}
}
