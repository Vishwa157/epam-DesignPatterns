/**
 * 
 */
package structuralPattern.decoratorPattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class NonVegBurger extends Burger {

	@Override
	double getBurgerCost() {
		return 120.0;
	}
	
	@Override
	String getDescription() {
		return Burger.description+" NonVegBurger";
	}
	
}
