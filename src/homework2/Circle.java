package homework2;

public class Circle extends Shape {
	public static final String NAME = "circle ";
	private Point a;
	private double r;

	public Circle(Point a, double r) {
		super();
		this.a = a;
		this.r = r;
	}

	@Override
	double perimetr() {
		return 2*r*Math.PI; 
	}

	@Override
	double area() {
		return r*r*Math.PI;
	}
	
	@Override
	boolean isValid(){
		if(r > 0)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return String.format("Circle [center= %s, radius= %.2f], perimetr()=%.2f, area()=%.2f",
				a, r, perimetr(), area());		
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

}
