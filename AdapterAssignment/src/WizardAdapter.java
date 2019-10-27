/**
 * Wizard Adapter class
 * @author riley
 *
 */
public class WizardAdapter implements Warrior{
private Wizard wizard;
/**
 * Constructor of WizardAdapter
 * @param w Wizard object that will be converted
 */
public WizardAdapter(Wizard w) {
	this.wizard = w;
}
/**
 * Calls the performSpell from the wizard object
 */
@Override
public void attack() {
	wizard.performSpell();
}
/**
 * Calls the wizards heal function
 */
@Override
public void defend() {
	wizard.heal();
}
}
