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
		
		Point g = rectOne.getC();
		g.setXY(10, 10);
		
		Circle cicleOne = new Circle(a, 5);
		Circle cicleTwo = new Circle(d, 1);
		Board board = new Board();
		System.out.println(board.getMaxNumberBoard());
		board.addShape(cicleTwo);
		board.addShape(cicleOne);
		board.addShape(rectOne);
		board.addShape(triangleTwo);
		if (board.addShape(triangleOne) == 0) {
			// board.delShape(1);
			// board.addShape(triangleOne);
			board.replaceShape(triangleOne, 1);
		}
		System.out.println(board);
		board.delShape(2);
		System.out.println(board.isPartHasShape(2));
		System.out.println(board.isPartHasShape(1));
		/** test valid triangle */
		Triangle triangleThree = new Triangle(a, b, b);
		if (!triangleThree.isValid()) {
			System.out.println("It is not triangle! " + triangleThree);
			triangleThree = null;
		}
		Point e = new Point(2, 0);
		triangleThree = new Triangle(a, c, e);
		if (!triangleThree.isValid()) {
			System.out.println("It is not triangle! " + triangleThree);
			triangleThree = null;
		}
		/** */
	}

}
