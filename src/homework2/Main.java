package homework2;

public class Main {

	public static void main(String[] args) {
		Point a = new Point(0, 0);
		Point b = new Point(0, 3);
		Point c = new Point(4, 0);
		Point d = new Point(5, 5);
		Triangle triangleOne = new Triangle(a, b, c);
		Triangle triangleTwo = new Triangle(d, b, c);
		Rectangle rectOne = new Rectangle(a, d);
		Circle cicleOne = new Circle(a, 5);
		Circle cicleTwo = new Circle(d, 1);		
		Board board = new Board();
		System.out.println(board.getMaxNumberBoard());		
		board.addShape(cicleTwo);
		board.addShape(cicleOne);
		board.addShape(rectOne);
		board.addShape(triangleTwo);
		if(board.addShape(triangleOne) == 0){
			//board.delShape(1);
			//board.addShape(triangleOne);
			board.replaceShape(triangleOne, 1);
		}
		System.out.println(board);
		board.delShape(2);
		System.out.println(board.isPartHasShape(2));
		System.out.println(board.isPartHasShape(1));
	}

}
