
public class test {
	public static void main(String[] args){
		VolleyballPlayers vb = new VolleyballPlayers("Selena", 8, false, "middle blocker", 5);
		SportPlayers sp = new SportPlayers("Noah", 23, true);
		
		System.out.println(vb);
		System.out.println(sp);
		
		vb.isBallGame();
		sp.isBallGame();
	}
}