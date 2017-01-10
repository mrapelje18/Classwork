public class PokemonChallenge {
	public static void main(String[] args) {
		int rAttack = 90;
		int rDefense = 55;
		
		System.out.println("Raichu Attack: " + statsLv100(rAttack));
		System.out.println("Raichu Defense: " + statsLv100(rDefense));
	}
	public static int statsLv100(int base) {
		return base*2 + 5;
	}
	public static int hpLv100(int base) {
		return base*2 + 110;
	}
	public static int statsMax(int x, int y) {
		return Math.max(x,y);
	}
}
