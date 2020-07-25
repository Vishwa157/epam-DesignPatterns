/**
 * 
 */
package behaviourPattern.templatePattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class Cricket extends Sports{

	@Override
	void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Cricket game is ready to start");
		
	}

	@Override
	void startGame() {
		// TODO Auto-generated method stub
		System.out.println("Cricket game started");
	}

	@Override
	void endGame() {
		// TODO Auto-generated method stub
		System.out.println("Cricket game ended");
	}

}
