package homework2;
/**
 * @author FedorRB
 * @version 1.1
 * An abstract class describing shapes methods
 */
public abstract class Shape {
	/**
	 * @return shape perimeter 
	 */
	abstract double perimetr();
	
	/**
	 * @return shape area
	 */
	abstract double area();
	
	/**
	 * @return check matching the figure type
	 */
	abstract boolean isValid();
}
