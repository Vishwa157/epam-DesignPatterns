/**
 * 
 */
package behaviourPattern.observerPattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class Yuan {
	
	double yuan;
	double rupee;

	public void convert(double rupee) {
		// TODO Auto-generated method stub
		this.rupee=rupee;
		yuan=(rupee)/ (double) 10.65;
		printValue();
	}

	public void printValue() {
		// TODO Auto-generated method stub
		System.out.println("The value of "+rupee+" is "+yuan+" yuan");
	}

}
