/**
 * 
 */
package behaviourPattern.templatePattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class Football extends Sports{
	
	@Override
	void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Football game is ready to start");
		
	}

	@Override
	void startGame() {
		// TODO Auto-generated method stub
		System.out.println("Football game started");
	}

	@Override
	void endGame() {
		// TODO Auto-generated method stub
		System.out.println("Football game ended");
	}
	
}
