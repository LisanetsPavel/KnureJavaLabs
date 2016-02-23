package KNURE.Lisanets_Laba3;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Quadrangle quadrangle = new Quadrangle(new Point(2, 4), new Point(2, 2), new Point(4, 4), new Point(4, 2));
		quadrangle.demo();
		quadrangle.move(Direction.UP, 2);
		quadrangle.demo();
		Square square = new Square(new Point(2, 4), new Point(2, 2), new Point(4, 4), new Point(4, 2));
		square.demo();
		square.zoom(2);
		square.demo();
		Triangle triangle = new Triangle(new Point(4, 4), new Point(3, 2), new Point(5, 2));
		triangle.demo();
		triangle.move(Direction.RIGHT, 2);
		triangle.demo();
		triangle.zoom(2);
		triangle.demo();

	}
}
