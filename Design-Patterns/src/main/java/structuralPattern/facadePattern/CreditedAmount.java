/**
 * 
 */
package structuralPattern.facadePattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class CreditedAmount {
	public CreditedAmount(String accountNumber, int amount){
		System.out.println(amount+" rupees credited to "+accountNumber);
	}
}
