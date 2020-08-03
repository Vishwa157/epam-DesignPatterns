/**
 * 
 */
package structuralPattern.decoratorPattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class VegBurger extends Burger {
	
	@Override
	double getBurgerCost() {
		return 100.0;
	}
	
	@Override
	String getDescription() {
		return Burger.description+" VegBurger";
	}
	
}
