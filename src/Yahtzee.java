import java.util.*;

public class Yahtzee {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int points1 = 0;
		int points2 = 0;
		int current = 1;
		System.out.println("Welcome to Yahtzee!");
		System.out.println("This version of Yahtzee is a simpler one.  The point system is the same, except you can only get points by 3 of a kind, 4 of a kind, small straight, large straight, and Yahtzee.");
		while ((points1 < 200) && (points2 < 200)) {
			int counter = 0;
			
			ArrayList <Integer> rolls = new ArrayList <Integer>();
			for (int i = 0; i < 5; i++) { //do at start of each turn of each player
				rollDi(rolls);
			}
			while (counter < 2) {
				Collections.sort(rolls);
				System.out.println("Player " + current + ", your rolls were: " + rolls);
				System.out.println("Which numbers would you like to reroll?  Please seperate the numbers with spaces and type the index of the number. (first di is 1)");
				System.out.println("If you would like to keep your rolls, type 0.");
				String reroll = userInput.nextLine();
				Scanner input = new Scanner(reroll);				
				ArrayList <Integer> rere = new ArrayList <Integer>();
				while (input.hasNext()) {
					rere.add(Integer.parseInt(input.next()));
				}
				Collections.sort(rere);
				if (rere.get(0) != 0) {
					for (int i = rere.size() - 1; i >= 0; i--) {
						rolls.remove(rere.get(i) - 1);
					}
					while (rolls.size() < 5) {
						rollDi(rolls);
					}
					counter++;
				} else {
					counter = 3;
				}
				input.close();
			}
		}
		userInput.close();
	}
	public static void rollDi(ArrayList <Integer> rolls) {
		Random r = new Random();
		int d = r.nextInt(6)  + 1;
		rolls.add(d);
	}
	public static void largeStraight(ArrayList <Integer> rolls) {
		for (int i = 0; i < 6; i++) {
			if (rolls.get(i + 1) == rolls.get(i) + 1) {
				
			}
		}
	}
	public static boolean smallStraight() {
		return false;
	}
	public static boolean threeOfAKind() {
		return false;
	}
	public static void fourOfAKind() {
		
	}
	public static void yahtzee() {
		
	}
}