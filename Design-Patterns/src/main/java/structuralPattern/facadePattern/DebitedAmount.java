/**
 * 
 */
package structuralPattern.facadePattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class DebitedAmount {
	public DebitedAmount(String accountNumber, int amount) {
		System.out.println(amount+" rupees debited to "+accountNumber);
	}
}
