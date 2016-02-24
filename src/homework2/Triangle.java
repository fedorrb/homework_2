package homework2;
/**
 * 
 * @author FedorRB
 * @version 1.1
 */
public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	/**
	 * ����������� � �����������
	 * @param a ������� ������������ "a" ������ Point
	 * @param b ������� ������������ "b" ������ Point
	 * @param c ������� ������������ "c" ������ Point
	 */
	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	double perimetr() {
		return Point.distance(a, b) + Point.distance(a, c) + Point.distance(b, c);
	}

	@Override
	double area() {
		double p = (Point.distance(a, b) + Point.distance(a, c) + Point.distance(b, c)) / 2;
		return  Math.sqrt(p*(p-Point.distance(a, b))*(p-Point.distance(a, c))*(p-Point.distance(b, c)));		
	}
	
	@Override
	public String toString() {
		return String.format("Triangle [a= %s, b= %s, c= %s], perimetr()=%.2f, area()=%.2f",
				a, b, c, perimetr(), area());	
	}

}
