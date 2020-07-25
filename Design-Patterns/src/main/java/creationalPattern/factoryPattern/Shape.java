/**
 * 
 */
package creationalPattern.factoryPattern;

/**
 * @author Vishwanath Reddy
 *
 */
public class Shape {
	
	Area getShape(String shape) {
		
		if(shape.equals("Rectangle")) {
			return new Rectangle();
		}
		else if(shape.equals("Square")) {
			return new Square();
		}
			
		return null;
	}
	
}
