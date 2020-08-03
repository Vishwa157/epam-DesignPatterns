/**
 * 
 */
package structuralPattern.facadePattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class Verification {
	boolean AccountVerification(String userId, String password) {
		if(userId=="Vishwa157" && password=="3678")
			return true;
		else
			return false;
	}
}
