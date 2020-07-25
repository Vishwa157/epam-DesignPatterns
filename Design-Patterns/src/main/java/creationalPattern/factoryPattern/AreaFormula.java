/**
 * 
 */
package creationalPattern.factoryPattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class AreaFormula {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Shape();
		Area square=shape.getShape("Square");
		Area rectangle=shape.getShape("Rectangle");
		square.getArea();
		rectangle.getArea();
	}

}
