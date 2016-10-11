

public class DrawBoxes {
	public static void main(String[] args) 
	{
		drawBox();
		emptyLines();
		drawBox();
		emptyLines();
		drawBox();
	}
	
	public static void drawBox()
	{
		System.out.println("+----------+");
		System.out.println("|          |");
		System.out.println("|          |");
		System.out.println("|          |");
		System.out.println("|          |");
		System.out.println("+----------+");
	}
	
	public static void emptyLines()
	{
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

}
