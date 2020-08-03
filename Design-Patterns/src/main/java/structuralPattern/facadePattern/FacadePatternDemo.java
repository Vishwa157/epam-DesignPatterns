/**
 * 
 */
package structuralPattern.facadePattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class FacadePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacadePatternImplementation facadePattern=new FacadePatternImplementation();
		facadePattern.TransferAmount("13232", "42134", 40000);
		facadePattern.creditedAmount("12345", 34500);
		facadePattern.debitedAmount("10000", 3450);
	}

}
