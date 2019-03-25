package pkgShape;

import java.util.Comparator;
import java.util.*; 
import java.lang.*; 
import java.io.*; 

public class Cuboid extends Rectangle {
	private int iDepth;

	public Cuboid(int x, int y, int z) {
		super(x, y);
		iDepth = z;
	}
	
	public int getiDepth() {
		return iDepth;
	}
	
	public void setiDepth(int x) {
		if (x < 0)
			throw new IllegalArgumentException("Number must be positive");
		else
			iDepth = x;
	}
	public double area() {
		int w = getiWidth();
		int l = getiLength();
		return (2*l*w)+(2*l*iDepth)+(2*w*iDepth);
	}
	public double volume() {
		return super.area()*iDepth;
	}
	public double perimeter() {
		throw new UnsupportedOperationException("Can't use perimeter");
	}
	public class SortByVolume implements Comparator<Cuboid> {
		public int compare(Cuboid c, Cuboid c2) {
			return (int) c.volume() - (int) c2.volume();
		}
	}
	public class SortByArea implements Comparator<Cuboid> {
		public int compare(Cuboid a, Cuboid a2) {
			return (int) a.area() - (int) a2.area();
}
	}
}