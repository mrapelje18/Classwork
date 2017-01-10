import java.util.*;
import java.io.*;

public class madLib {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner userInput = new Scanner(System.in);
		PrintStream story = new PrintStream(new File("story.txt"));
		Scanner input = new Scanner(new File("madlib.txt"));
		System.out.println("This is a mad lib based off of Part of Your World from Little Mermaid.");
		while (input.hasNextLine()) {
			String line = input.nextLine();
			process(line, story, userInput);
		}
		input.close();
		userInput.close();
		story.close();
	}
	public static void process(String line, PrintStream story, Scanner userInput) {
		while (line.indexOf(">") > -1) {
			System.out.print("Type " + line.substring(line.indexOf("<") + 1, line.indexOf(">")) + ": ");
			story.print(line.substring(0,line.indexOf("<")));
			story.print(userInput.nextLine());
			if (line.indexOf(">") != line.length()) {
				line = line.substring(line.indexOf(">") + 1);
			} else {
				line = "";
			}
		}
		story.println(line);
	}
}