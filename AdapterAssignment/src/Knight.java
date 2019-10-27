/**
 * Knight Class that uses the warrior class
 * @author riley
 *
 */
public class Knight implements Warrior {
	/**
	 * Prints out the attacking statement
	 */
	@Override
	public void attack() {
		System.out.println("Attacking: I'm bringing you down!");
	}
	/**
	 * Prints out the defending statement
	 */
	@Override
	public void defend() {
		System.out.println("Defending: We must protect the castle");
	}

}
