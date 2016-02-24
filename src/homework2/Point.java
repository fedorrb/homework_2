package homework2;
/**
 * @author FedorRB
 * @version 1.2
 */
public class Point {
	private double x;
	private double y;
	/**
	 * ����������� � �����������
	 * @param �������� x ���������� ����� 
	 * @param �������� y ���������� �����
	 * 
	 */
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	/**
	 * 
	 * @param a ��������� ����� � (Point)
	 * @param b ��������� ����� b (Point)
	 * @return ���������� ����� �������
	 */
	public static double distance(Point a, Point b) {
        return Math.hypot(a.getX() - b.getX(), a.getY() - b.getY());
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
