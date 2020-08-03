/**
 * 
 */
package structuralPattern.decoratorPattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class Tomato extends ToppingsDecorator {
	
	Burger burgerObject;
	public Tomato(Burger burgerObject) {
		this.burgerObject=burgerObject;
	}
	
	@Override
	double getBurgerCost() {
		return 60.0+burgerObject.getBurgerCost();
	}
	
	@Override
	String getDescription() {
		return burgerObject.getDescription()+" with Tomatoes";
	}
}
