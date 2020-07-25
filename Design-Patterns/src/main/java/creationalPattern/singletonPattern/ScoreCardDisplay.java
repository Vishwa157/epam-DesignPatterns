/**
 * 
 */
package creationalPattern.singletonPattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class ScoreCardDisplay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreCard scoreCard=ScoreCard.getScoreCard();
		scoreCard.showScoreCard();
	}

}
