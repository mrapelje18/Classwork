import java.util.*;
import java.lang.Math;

public class PokemonBattle {
	public static void main(String[] args) {
		Scanner battle = new Scanner(System.in); //new scanner
		
		battleStart(battle); //battle intro
		System.out.println();
		
		System.out.println("Zebstrika used Thunderbolt!"); //Battle start!
		damage(battle);
		System.out.println();
		
		System.out.print("Level: ");
		int level = battle.nextInt();
		System.out.print("Attack: ");
		int attack = battle.nextInt();
		System.out.print("Defense: ");
		int defense = battle.nextInt();
		System.out.print("SP. Attack: ");
		int spA = battle.nextInt();
		System.out.print("SP. Defense: ");
		int spD = battle.nextInt();
		System.out.print("HP: ");
		int hp = battle.nextInt();
		System.out.print("Speed: ");
		int sp = battle.nextInt();
		System.out.print("Ability: ");
		String ab = battle.next();
		System.out.print("Nature: ");
		String na = battle.next();
		System.out.print("Item: ");
		String item = battle.next();
		System.out.print("first move: ");
		String m1 = battle.next();
		System.out.print("second move: ");
		String m2 = battle.next();
		System.out.print("third move: ");
		String m3 = battle.next();
		System.out.print("fourth move: ");
		String m4 = battle.next();
		System.out.println();
		statsTable(m1, m2, m3, m4, level, hp, attack, defense, spA, spD, sp, ab, na, item);
		
		battle.close();
	}
	public static void battleStart(Scanner poke) {
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Zebstrika appeared.");
		System.out.print("Which Pokemon do you choose? ");
		String pokemon = poke.next();
		System.out.println("You chose " + pokemon + "!");
		System.out.println("It's a Pokemon battle between " + pokemon + " and Zebstrika! Go!");
	}
	public static void damage(Scanner stats){ //calculates and prints damage & hp
		System.out.println("Trainer, what are your Arcanine's stats?");
		System.out.print("Level: ");
		int level = stats.nextInt();
		System.out.print("Attack: ");
		int attack = stats.nextInt();
		System.out.print("Defense: ");
		int defense = stats.nextInt();
		System.out.print("Base: ");
		int base = stats.nextInt();
		/*System.out.print("STAB: ");
		int stab = stats.nextInt();*/
		System.out.print("HP: ");
		int hp = stats.nextInt();
		double modifier = Math.random();
		int damage = (int)((((2*level*10)/250)*(attack/defense)*base + 2)*modifier);
		System.out.println("Arcanine sustained " + damage + " points damage.  HP are now " + (hp - damage) + ".");
	}
	public static void statsTable(String m1, String m2, String m3, String m4, int lv, int hp, int attack, int def, int spA, int spD, int sp, String ab, String na, String item){
		System.out.println("Pikachu                Lv." + lv);
		System.out.println("DEX NO.          025 Pikachu");
		System.out.println("HP         " + hp + "/" + hp + "                                     (\\__/)");
		System.out.println("ATTACK           " + attack + "                                  (o^.^)");
		System.out.println("DEFENSE          " + def + "                                 z(_(\")(\")");
		System.out.println("SP.ATK           " + spA + "               electric");
		System.out.println("SP.DEF           " + spD + "              MOVES LEARNED");
		System.out.println("SPEED            " + sp + "                " + m1);
		System.out.println("NATURE       " + na + "                    " + m2);
		System.out.println("ABILITY      " + ab + "                  " + m3);
		System.out.println("ITEM         " + item + "                " + m4);
		
	}
}