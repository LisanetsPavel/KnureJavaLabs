package KNURE.Lisanets_Laba3;

public class Triangle {

	private Point up;
	private Point leftDown;
	private Point rightDown;

	public Triangle(Point up, Point leftDown, Point rightDown) {

		this.up = up;
		this.leftDown = leftDown;
		this.rightDown = rightDown;
	}

	public void move(Direction direction, double length) {

		if (direction == Direction.UP) {

			up.setY(up.getY() + length);
			leftDown.setY(leftDown.getY() + length);
			rightDown.setY(rightDown.getY() + length);

		}

		if (direction == Direction.DOWN) {

			up.setY(up.getY() - length);
			leftDown.setY(leftDown.getY() - length);
			rightDown.setY(rightDown.getY() - length);
		}

		if (direction == Direction.LEFT) {

			up.setX(up.getX() - length);
			leftDown.setX(leftDown.getX() - length);
			rightDown.setX(rightDown.getX() - length);
		}

		if (direction == Direction.RIGHT) {

			up.setX(up.getX() + length);
			leftDown.setX(leftDown.getX() + length);
			rightDown.setX(rightDown.getX() + length);
		}

	}

	public void zoom(double length) {

		up.setY(up.getY() + length);
		leftDown.setX(leftDown.getX() - length);
		leftDown.setY(leftDown.getY() - length);
		rightDown.setY(rightDown.getY() - length);
		rightDown.setX(rightDown.getX() + length);
	}

	public void demo(){
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Triangle [up=" + up + ", leftDown=" + leftDown + ", rightDown=" + rightDown + "]";
	}

}
