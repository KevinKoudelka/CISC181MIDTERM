/**
 * 
 */
/**
 * @author kevinkoudelka
 *
 */
package pkgShape;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class ShapeTest {
	@Test
	public void RectangleGetTest() {
		Rectangle x = new Rectangle(2,2);
		assertTrue(x.getiWidth() == 2);
		assertTrue(x.getiLength() == 2);
		
	}
	@Test
	public void RectangleSetTest() {
		Rectangle y = new Rectangle(4,10);
		y.setLength(5);
		y.setWidth(6);
		
		assertTrue(y.getiWidth() == 6);
		assertTrue(y.getiLength() == 5);
	}
	@Test (expected = IllegalArgumentException.class)
	public void RectangleSet2Test() {
		Rectangle w = new Rectangle(2,2);
		w.setWidth(-2);
		assertTrue(w.getiWidth() < 0);
	}
	@Test (expected = IllegalArgumentException.class)
	public void RectangleSet3Test() {
		Rectangle w = new Rectangle(1,2);
		w.setLength(-2);
		assertTrue(w.getiLength() < 0);
	}
	@Test
	public void RectangleAreaTest() {
		Rectangle r = new Rectangle(6,6);
		assertTrue(r.area() == 36);
	}
	@Test
	public void RectanglePerimeterTest() {
		Rectangle t = new Rectangle(15,10);
		assertTrue(t.perimeter() == 50);
	}
	@Test
	public void RectanglecompareToTest() {
		Rectangle k = new Rectangle(5,6);
		Rectangle l = new Rectangle(3,4);
		ArrayList<Rectangle> arr = new ArrayList<>();
		arr.add(k);
		arr.add(l);
		Collections.sort(arr);
		assertTrue(arr.get(0).area() < arr.get(1).area());
	}
	@Test
	public void CuboidGetTest() {
		Cuboid c = new Cuboid(4,5,6);
		assertTrue(c.getiDepth() == 6);
	}
	@Test
	public void CuboidSetTest() {
		Cuboid g = new Cuboid(0,0,0);
		g.setWidth(5);
		g.setLength(4);
		g.setiDepth(3);
		assertTrue(g.getiWidth() == 5);
		assertTrue(g.getiLength() == 4);
		assertTrue(g.getiDepth() == 3);
	}
	@Test (expected = IllegalArgumentException.class)
	public void CuboidSet2Test() {
		Cuboid g = new Cuboid(1,2,4);
		g.setWidth(5);
		g.setLength(4);
		g.setiDepth(-3);
		assertTrue(g.getiWidth() == 5);
		assertTrue(g.getiLength() == 4);
		assertTrue(g.getiDepth() == -3);
	}
	@Test
	public void CuboidAreaTest() {
		Cuboid g = new Cuboid(3,4,5);
		assertTrue(g.area() == 94);
	}
	@Test
	public void CuboidVolumeTest() {
		Cuboid f = new Cuboid(2,1,3);
		assertTrue(f.volume() == 6);
	}
	@Test (expected = UnsupportedOperationException.class)
	public void CuboidPerimeterTest() {
		Cuboid h = new Cuboid(5,6,7);
		h.perimeter();
	}
	@Test
	public void SortByVolume() {
		Cuboid k = new Cuboid(5,6,7);
		Cuboid l = new Cuboid(3,4,5);
		ArrayList<Cuboid> arr = new ArrayList<>();
		arr.add(k);
		arr.add(l);
		Collections.sort(arr);
		assertTrue(arr.get(0).volume() < arr.get(1).volume());
		}	
	@Test
	public void SortByArea() {
		Cuboid k = new Cuboid(5,6,7);
		Cuboid l = new Cuboid(3,4,5);
		ArrayList<Cuboid> arr = new ArrayList<>();
		arr.add(k);
		arr.add(l);
		Collections.sort(arr);
		assertTrue(arr.get(0).area() < arr.get(1).area());
	}	
}

