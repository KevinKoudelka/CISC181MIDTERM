package pkgShape;


public class Rectangle extends Shape {
	protected int iWidth;
	protected int iLength;
	
	public Rectangle(int x, int y) {
		iWidth = x;
		iLength =y;
	}
	public int getiWidth() {
		return iWidth;
	}
	public int getiLength() {
		return iLength;
	}
	public void setWidth(int x) {
		if (x < 0)
			throw new IllegalArgumentException("Number must be positive");
		else
			iWidth = x;
	}
	public void setLength(int y) {
		if (y < 0)
			throw new IllegalArgumentException("Number must be positive");
		else
			iLength = y;
	}
	public double area() {
		return iWidth * iLength;
	}
	public double perimeter() {
		return (iWidth*2) + (iLength*2);
	}
	public int compareTo(Object x) {
		Rectangle rec = (Rectangle) x;
		return (int) this.area() - (int) rec.area();
	}
}
