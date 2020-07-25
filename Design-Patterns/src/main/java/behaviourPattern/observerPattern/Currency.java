/**
 * 
 */
package behaviourPattern.observerPattern;

import java.util.Scanner;

/**
 * @author Vishwanath Reddy
 *
 */
public class Currency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yuan yuan=new Yuan();
		
		Dollar dollar=new Dollar();
		
		CurrencyConvert convert=new CurrencyConvert(yuan, dollar);
		
		Scanner sc=new Scanner(System.in);
		
		//double rupee=sc.nextDouble();
		
		convert.convertCurrency(120.00);
		sc.close();
	}

}
