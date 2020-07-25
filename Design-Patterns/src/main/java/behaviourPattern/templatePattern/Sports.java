/**
 * 
 */
package behaviourPattern.templatePattern;

/**
 * @author Vishwanath Reddy
 *
 */
public abstract class Sports {
	abstract void getReady();
	abstract void startGame();
	abstract void endGame();
	
	public final void startPlay() {
		getReady();
		startGame();
		endGame();
	}
	
}
