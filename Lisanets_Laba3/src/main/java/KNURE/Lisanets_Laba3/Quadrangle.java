package KNURE.Lisanets_Laba3;

public class Quadrangle {
	private Point leftUp;
	private Point leftDown;
	private Point rightUp;
	private Point rightDown;

	public Quadrangle(Point leftUp, Point leftDown, Point rightUp, Point rightDown) {

		this.leftUp = leftUp;
		this.leftDown = leftDown;
		this.rightUp = rightUp;
		this.rightDown = rightDown;
	}

	public Point getX1() {
		return leftUp;
	}

	public void setX1(Point leftUp) {
		this.leftUp = leftUp;
	}

	public Point getX2() {
		return leftDown;
	}

	public void setX2(Point leftDown) {
		this.leftDown = leftDown;
	}

	public Point getY1() {
		return rightUp;
	}

	public void setY1(Point rightUp) {
		this.rightUp = rightUp;
	}

	public Point getY2() {
		return rightDown;
	}

	public void setY2(Point rightDown) {
		this.rightDown = rightDown;
	}

	public void move(Direction direction, double length) {

		if (direction == Direction.UP) {

			leftDown.setY(leftDown.getY() + length);
			leftUp.setY(leftUp.getY() + length);
			rightDown.setY(rightDown.getY() + length);
			rightUp.setY(rightUp.getY() + length);

		}

		if (direction == Direction.DOWN) {

			leftDown.setY(leftDown.getY() - length);
			leftUp.setY(leftUp.getY() - length);
			rightDown.setY(rightDown.getY() - length);
			rightUp.setY(rightUp.getY() - length);
		}

		if (direction == Direction.LEFT) {
			leftDown.setX(leftDown.getX() - length);
			leftUp.setX(leftUp.getX() - length);
			rightDown.setX(rightDown.getX() - length);
			rightUp.setX(rightUp.getX() - length);

		}

		if (direction == Direction.RIGHT) {
			leftDown.setX(leftDown.getX() + length);
			leftUp.setX(leftUp.getX() + length);
			rightDown.setX(rightDown.getX() + length);
			rightUp.setX(rightUp.getX() + length);

		}

	}

	public void zoom(double length) {
		leftDown.setX(leftDown.getX() - length);
		leftDown.setY(leftDown.getY() - length);
		leftUp.setX(leftUp.getX() - length);
		leftUp.setY(leftUp.getY() + length);
		rightDown.setX(rightDown.getX() + length);
		rightDown.setY(rightDown.getY() - length);
		rightUp.setX(rightUp.getX() + length);
		rightUp.setY(rightUp.getY() + length);
	}

	public void demo(){
		System.out.println(toString());
	}

	@Override
	public String toString() {
	    
		return this.getClass().getSimpleName() + " [leftUp=" + leftUp + ", leftDown=" + leftDown + ", rightUp=" + rightUp + ", rightDown="
				+ rightDown + "]";
	}
	
	
	
//	@Override
//	public String toString() {
//
//		return "leftUpPoint = " + leftUp.toString() + ", leftDownPoint = " + leftDown.toString() + ", rightUpPoint = "
//				+ rightUp.toString() + ", rightDownPoint = " + rightDown.toString();
//	}

}
