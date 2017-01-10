import java.lang.Math;

public class Ch3ProgrammingProject {
	public static double distance(double x1, double x2, double y1, double y2) { //Calculates distance
		double x = Math.pow((x2-x1),2);
		double y = Math.pow((y2-y1),2);
		double d = Math.sqrt(x+y);
		return d;
	}
	
	public static double roadTrip(double d) { //Calculates circumference
		double c = d*Math.PI;
		return c;
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
	
	public static void exercise3(double xx, double xy, double yx, double yy, double zx, double zy, String x, String y, String z) {
		double a = distance(xx,yx,xy,yy);
		double b = distance(yx,zx,yy,zy);
		double c = distance(zx,xx,zy,xy);
		System.out.println("    From " + x + ", turn " + angleB(a,b,c) + " degrees and walk " + a + " miles to reach " + y + ".");
		System.out.println("    From " + y + ", turn " + angleC(a,b,c) + " degrees and walk " + b + " miles to reach " + z + ".");
		System.out.println("    From " + z + ", turn " + angleA(a,b,c) + " degrees and walk " + c + " miles to reach " + x + ".\n");
	}
	
	public static double longestTrip(double xx, double xy, double yx, double yy, double zx, double zy, double rx, double ry) {
		double xa = distance(xx,yx,xy,yy);
		double xb = distance(xx,zx,xy,zy);
		double xc = distance(xx,rx,xy,ry);
		double ya = distance(yx,zx,yy,zy);
		double yb = distance(yx,rx,yy,ry);
		double za = distance(zx,rx,zy,ry);
		double t = Math.max(xa,xb);
		double tt = Math.max(xc,t);
		double ttt = Math.max(tt,ya);
		double tttt = Math.max(ttt,yb);
		return Math.max(tttt,za);
	}
	
	public static void main(String[] args) {
		System.out.println("Exercise 1"); //solution for exercise 1
		System.out.println("    Distance from Baltimare (29,16) to Manehattan (34,8)= " + distance(29, 34, 16, 8));
		System.out.println("    Distance from Los Pegasus (6,19) to Neighagra Falls (22,7)= " + distance(6, 22, 19, 7));
		System.out.println("    Distance from the Badlands (25, 24) to Ponyville (16, 14)= " + distance(25, 16, 24, 14) + "\n");
		
		System.out.println("Exercise 2"); //example for exercise 2
		System.out.println("    If diameter is 20, then the length of the trip is " + roadTrip(20));
		System.out.println("    If diameter is 3, then the length of the trip is " + roadTrip(3) + "\n");
		
		System.out.println("Exercise 3"); //example for exercise 3
		exercise3(29,16,6,19,25,24,"Baltimare","Los Pegasus","Badlands");
		
		System.out.println("Exercise 4"); //example for exercise 4
		System.out.println("    The longest trip out of the four locations is " + longestTrip(29,16,34,8,6,19,22,7));
		//This is between Baltimare, Manehattan, Los Pegasus, and Neighagra Falls (in order)
		//The longest should be from Los Pegasus to Manehattan
	}
}
