
public class VolleyballPlayers extends SportPlayers {
	private String position;
	private int acesPerGame;
	
	public VolleyballPlayers(String name, int number, boolean ballGame, String position, int aces) {
		super(name, number, ballGame);
		this.position = position;
		acesPerGame = aces;
	}
	
	public String toString() {
		return getName() + " is a " + position + " and makes " + acesPerGame + " aces per game.";
	}
	public void isBallGame() {
		if (getBallGame() == false) {
			System.out.print("You liar.  ");
		}
		System.out.println("You play volleyball, huh?  Good for you.  It's a fun sport.");
	}
}
