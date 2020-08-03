/**
 * 
 */
package structuralPattern.decoratorPattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class DecoratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Burger vegBurger=new VegBurger();
		ToppingsDecorator tomatoDecorator=new Tomato(vegBurger);
		System.out.println(tomatoDecorator.getDescription()+" cost = "+tomatoDecorator.getBurgerCost());
		
		Burger nonVegBurger=new NonVegBurger();
		ToppingsDecorator pannerDecorator=new Panner(nonVegBurger);
		System.out.println(pannerDecorator.getDescription()+" cost = "+pannerDecorator.getBurgerCost());
		
	}

}
