import java.util.*;

public class HangmanProject {
	public static void main(String[] args) {
		Scanner guessInput = new Scanner(System.in);
		boolean victory = false;
		int counter = 0;
		int guesses = 10;
		String [] wrong = new String [10];
		String [] words = {"kilobyte","jigsaw","nintendo","dictionary","juice","computer","jazz","windward","rocket","scissors","president","bandwagon","knapsack","zombie","topaz","quiz","oxygen","dwarves","hyphen","khaki"};
		System.out.println("Welcome to Hangman!");
		System.out.println("Hanger, please type in a number from 1 to 20.");
		String answer = words[guessInput.nextInt() - 1];
		String [] correct = new String [answer.length()];
		String [] answers = new String [answer.length()];
		for (int i = 0; i < answers.length; i++) {
			answers[i] = answer.substring(i,i+1);
		}
		System.out.println("Guesser, please type a character. The word has " + answer.length() + " letters.  You have " + guesses + " misses before the man is dead.");
		while (victory == false && guesses != 0) {
			String guess = guessInput.next();
			if (check(answer, guess, wrong, counter, correct) == false) {
				counter++;
				guesses--;
			}
			System.out.println("Guesser, please type your next guess.  You have " + guesses + " misses before the man dies.");
			if (counter != 0) {
				System.out.print("You have missed ");
				for (int i = 0; i < counter; i++) {
					System.out.print(wrong[i]);
					if (i != counter - 1) {
						System.out.print(", ");
					}
				}
				System.out.println(".");
			}
			System.out.println("So far, you have " + returnCorrect(correct) + ".");
			if (Arrays.equals(correct,answers)) {
				System.out.println("Yay, you win.  You saved the man.");
				victory = true;
			}
		}
		if (victory == false) {
			System.out.println("You lose!  The man is dead.");
		}
		System.out.print("The word was " + answer + ".");
		guessInput.close();
	}
	public static boolean check(String s, String a, String[] wrong, int y, String[] correct) {
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (a.equals(s.substring(i,i+1))) {
				System.out.println("There is " + a + " as the " + (i + 1) + " letter in the word.");
				correct[i] = a;
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println("There is no " + a + " in the word!");
			wrong[y] = a;
			return false;
		}
		return true;
	}
	public static String returnCorrect(String[] correct) {
		String s = "";
		for (int i = 0; i < correct.length; i++) {
			if (correct[i] == null) {
				s += "_ ";
			} else {
				s += correct[i] + " ";
			}
		}
		return s;
	}
}
