/**
 * 
 */
package structuralPattern.decoratorPattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class Panner extends ToppingsDecorator {
	
	Burger burgerObject;
	public Panner(Burger burgerObject) {
		this.burgerObject=burgerObject;
	}
	
	@Override
	double getBurgerCost() {
		return 50.0+burgerObject.getBurgerCost();
	}
	
	@Override
	String getDescription() {
		return burgerObject.getDescription()+" with Panner";
	}
	
}
