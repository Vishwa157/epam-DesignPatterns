/**
 * 
 */
package behaviourPattern.observerPattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class Dollar {

	double dollar;
	double rupee;

	public void convert(double rupee) {
		// TODO Auto-generated method stub
		this.rupee=rupee;
		dollar=(rupee)/ (double) 74.72;
		printValue();
	}

	public void printValue() {
		// TODO Auto-generated method stub
		System.out.println("The value of "+rupee+" is "+dollar+" dollar");
	}
	
}
