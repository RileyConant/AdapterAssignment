/**
 * 
 * @author riley
 *
 */
public class WizardAdapter implements Warrior{
private Wizard wizard;

public WizardAdapter(Wizard w) {
	this.wizard = w;
}
/**
 * 
 */
@Override
public void attack() {
	System.out.println("Attacking: I'm bringing you down!");
}
/**
 * 
 */
@Override
public void defend() {
	System.out.println("Defending: We must protect the castle");
}
}
