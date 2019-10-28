/**
 * 
 * Sorcerer class which uses the Wizard interface
 * 
 * @author lance kevin
 *
 */
public class Sorcerer implements Wizard{
	public Sorcerer() {}
	public void performSpell() {
		System.out.println("Casting Spell: I put a spell on you, and now you're gone");
	}
	
	public void heal() {
		System.out.println("Healing: You should all feel healthy again");
	}
}
