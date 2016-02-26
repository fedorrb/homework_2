package homework2;

public class Rectangle extends Shape {
	public static final String NAME = "rectangle ";
	private Point a;
	private Point c;

	
	public Rectangle(Point a, Point c) {
		super();
		this.a = a;
		this.c = c;
	}

	@Override
	double perimetr() {
		return Math.abs(a.getX() - c.getX())*2 + Math.abs(a.getY() - c.getY())*2;
	}

	@Override
	double area() {
		return (Math.abs(a.getX() - c.getX()) * Math.abs(a.getY() - c.getY()));
	}

	@Override
	boolean isValid(){
		if(a.getX() != c.getX() && a.getY() != c.getY())
			return true;
		return false;
	}	

	@Override
	public String toString() {
		return String.format("Rectangle [a= %s, c= %s], perimetr()=%.2f, area()=%.2f",
				a, c, perimetr(), area());		
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}
}
