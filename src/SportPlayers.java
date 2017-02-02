
public class SportPlayers {
	private String name;
	private int number;
	private boolean ballGame;
	
	public SportPlayers(String name, int number, boolean ballGame) {
		this.name = name;
		this.number = number;
		this.ballGame = ballGame;
	}
	
	public String toString() {
		return name + " has jersey number " + number + ".";
	}
	public void isBallGame() {
		if (ballGame == true) {
			System.out.println("Good for you.");
		} else {
			System.out.println("You're missing out.");
		}
	}
	
	public String getName() {
		return name;
	}
	public boolean getBallGame() {
		return ballGame;
	}
}
