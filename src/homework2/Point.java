package homework2;
/**
 * @author FedorRB
 * @version 1.2
 */
import java.text.DecimalFormat;

public class Point {
	private double x;
	private double y;
	/**
	 * constructor 
	 * @param value x coordinate of the point 
	 * @param value y coordinate of the point
	 */
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public String formatDouble(double format) {
		String formattedDouble = new DecimalFormat("#0.00").format(format);
		return formattedDouble;
	}	

	/**
	 * @param coordinate of the point � (Point)
	 * @param coordinate of the point b (Point)
	 * @return distance between points
	 */
	public static double distance(Point a, Point b) {
        return Math.hypot(a.getX() - b.getX(), a.getY() - b.getY());
    }	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}	
}
