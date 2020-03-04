package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	// You might want this; if you're using Map<String, Integer> anywhere...
	// JUnit has an assertEquals(Object, Object) and an assertEquals(int, int).
	// When you give it assertEquals(Integer, int) it doesn't know which to use (but both would be OK!)
	// This method gets around that by forcing the (int, int) version.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	@Test
	public void testEmpty() {
		MapADT<String, String> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
		//Assert.assert
	}
	
	@Test
	public void testPutOnce() {
		MapADT<String, String> one = new JavaMap<>();
		one.put("A", "apple");
		assertEquals(one.size(), 1);
	}
	
	@Test
	public void testRepeatedPut() {
		MapADT<String, String> ab = new JavaMap<>();
		ab.put("A",  "apple");
		ab.put("B","bee");
		assertEquals(ab.size(),2);
	}
	
	@Test
	public void testGetOnce() {
		MapADT<String, String> one = new JavaMap<>();
		one.put("A", "apple");
		assertEquals(one.get("A"), "apple");
	}
	
	@Test
	public void testRepeatedGet() {
		MapADT<String, String> ab = new JavaMap<>();
		ab.put("A",  "apple");
		ab.put("B","bee");
		assertEquals(ab.get("A"), "apple");
		assertEquals(ab.get("B"), ("bee"));
	}
	
	@Test
	public void testSizeOnce() {
		MapADT<String, String> one = new JavaMap<>();
		one.put("A", "apple");
		assertEquals(one.size(), 1);
	}
	
	@Test
	public void testRepeatedSize() {
		MapADT<String, String> ab = new JavaMap<>();
		ab.put("A", "apple");
		ab.put("B","bee");
		assertEquals(ab.size(), 2);
	}
	
	@Test
	public void testRemoveOnce() {
		MapADT<String, String> one = new JavaMap<>();
		one.put("A", "apple");
		one.remove("A");
		assertEquals(one.size(), 0);
	}
	
	@Test
	public void testRepeatedRemove() {
		MapADT<String, String> ab = new JavaMap<>();
		ab.put("A", "apple");
		ab.put("B","bee");
		ab.remove("A");
		ab.remove("B");
		assertEquals(ab.size(), 0);
	}
}
