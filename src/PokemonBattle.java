/*  introduce battle (battleStart()) choose pokemon 
 * battleStart() returns pokemon name stored in variable
 * method damage() takes pokemon name as parameter and return hp
 * calculates damage= (((2*level+10)/250) + (attack/defense)*base+2)*modifier
 * modifier- random*STAB (between .85 and 1.0)
 * (low+(math.rand()*size) and (low+(math.rand()*(high-low)))
 * damage called from main and store as hp in variable
 * hard code statsTable
 */

import java.util.*;
public class PokemonBattle {

static Scanner userInput = new Scanner (System.in);

	public static void main(String[] args) {
		// string battleStart
		String name = battleStart();
		double pokeHP= damage(name);
		statsTable(name, pokeHP);

	}
	
	public static String battleStart() {
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Zebstrika appeared.");
		System.out.println("Which Pokemon do you choose? ");
		String name = userInput.nextLine();
		System.out.println("You chose " + name + "!");
		System.out.println("It's a Pokemon battle between " + name + " and Zebstrika! Go!");
		return name;
	}

	public static double damage(String name) {
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println("Trainer, what are your " + name + "'s stats?");
		System.out.println("Level: "); /*user enters stats*/
		int level = userInput.nextInt();
		System.out.println("Attack: ");
		int attack = userInput.nextInt();
		System.out.println("Defense: ");
		int defense = userInput.nextInt();
		System.out.println("Base: ");
		int base = userInput.nextInt();
		System.out.println("STAB: ");
		int stab = userInput.nextInt();
		System.out.println("HP: ");
		int hp = userInput.nextInt();
		System.out.println(" ");
		/*calculate modifier*/
		double modifier = 0.85 + (Math.random() * (1.0 - 0.85));
		/*calculate damage*/
		double damage = (((2*level+10)/250) + (attack/defense)*base+2)*modifier;
		System.out.println(name+ " sustained " + damage + " points damage.");
		double newHP = hp - damage;
		System.out.println("HP, after damage, are now " + newHP); 
		return newHP;
	}
	
	/*statsTable is mostly fully written in hard code*/
	public static void statsTable(String name, double pokeHP) {
		System.out.println("Name       " + name);
		System.out.println("Level      40");
		System.out.println("-------------------------");
		System.out.println("HP         96");
		System.out.println("ATTACK     52");
		System.out.println("DEFENSE    51");
		System.out.println("SP. ATK    121");
		System.out.println("SP. DEF    81");
		System.out.println("SPEED      107");
		System.out.println("-------------------------");
		
	}
}
