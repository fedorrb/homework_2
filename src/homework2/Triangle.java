package homework2;

import java.util.Arrays;

/**
 * 
 * @author FedorRB
 * @version 1.1
 */
public class Triangle extends Shape {
	public static final String NAME = "triangle ";
	private Point a;
	private Point b;
	private Point c;
	/**
	 * @param a apex of the triangle "a" 
	 * @param b apex of the triangle "b" 
	 * @param c apex of the triangle "c"
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
	boolean isValid(){
		double array[] = {Point.distance(a, b),Point.distance(a, c),Point.distance(b, c)};
		for(double side: array){
			if(side <= 0){
				return false;
			}
		}
		Arrays.sort(array);		
		if(array[0] + array[1] <= array[2])
			return false;
		
		return true;		
	}	
	
	@Override
	public String toString() {
		return String.format("Triangle [a= %s, b= %s, c= %s], perimetr()=%.2f, area()=%.2f",
				a, b, c, perimetr(), area());	
	}

}
