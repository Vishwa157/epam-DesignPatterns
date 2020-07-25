/**
 * 
 */
package creationalPattern.singletonPattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class ScoreCard {
	
	private static ScoreCard scoreCard=new ScoreCard();
	
	private ScoreCard() {
		
	}
	
	public static ScoreCard getScoreCard() {
		return scoreCard;
	}
	
	public void showScoreCard() {
		System.out.println("Displaying ScoreCard");
	}
	
}
