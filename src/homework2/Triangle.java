package homework2;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private double sideAB;
	private double sideAC;
	private double sideBC;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	double perimetr() {
		calcSide();
		return sideAB + sideAC + sideBC;
	}

	@Override
	double area() {
		calcSide();
		double p = (sideAB + sideAC + sideBC) / 2;
		return  Math.sqrt(p*(p-sideAB)*(p-sideAC)*(p-sideBC));		
	}
	
	@Override
	public String toString() {
		return String.format("Triangle [a= %s, b= %s, c= %s], perimetr()=%.2f, area()=%.2f",
				a, b, c, perimetr(), area());	
	}

	private void calcSide(){
		sideAB = Math.sqrt(Math.pow(a.getX() - b.getX(),2) + Math.pow(a.getY() - b.getY(),2));
		sideAC = Math.sqrt(Math.pow(a.getX() - c.getX(),2) + Math.pow(a.getY() - c.getY(),2));
		sideBC = Math.sqrt(Math.pow(b.getX() - c.getX(),2) + Math.pow(b.getY() - c.getY(),2));		
	}

}
