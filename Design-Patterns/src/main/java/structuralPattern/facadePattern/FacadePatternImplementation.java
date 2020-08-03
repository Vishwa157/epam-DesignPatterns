/**
 * 
 */
package structuralPattern.facadePattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class FacadePatternImplementation {
	
	Verification accountVerify=new Verification();
	
	void TransferAmount(String accountNumber1, String accountNumber2, int amount) {
		
		if(accountVerify.AccountVerification("Vishwa157", "3678")) {
			new DebitedAmount(accountNumber1, amount);
			new CreditedAmount(accountNumber2, amount);
		}
		else {
			System.out.println("Invalid Id or Pass try again");
		}
		
	}
	
	void creditedAmount(String accountNumber, int amount) {
		
		if(accountVerify.AccountVerification("Vishwa157", "3678")) {
			new DebitedAmount(accountNumber, amount);
		}
		else {
			System.out.println("Invalid Id or Pass try again");
		}
		
	}
	
	void debitedAmount(String accountNumber, int amount) {
		
		if(accountVerify.AccountVerification("Vishwa157", "3678")) {
			new CreditedAmount(accountNumber, amount);
		}
		else {
			System.out.println("Invalid Id or Pass try again");
		}
		
	}
	
}
