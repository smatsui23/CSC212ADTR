package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}
	
	@Test 
	public void testInsertOnce() {
		SetADT<String> one = new JavaSet<>();
		one.insert("A");
		assertEquals(one.size(), 1);
	}
	
	@Test
	public void testRepeatedInsert(){
		SetADT<String> ab = new JavaSet<>();
		ab.insert("A");
		ab.insert("B");
		ab.insert("B");
		assertEquals(ab.size(), 2);
		assertEquals(true, ab.contains("A"));
		assertEquals(true, ab.contains("B"));
	}
	
	@Test
	public void testContainsOnce() {
		SetADT<String> one = new JavaSet<>();
		one.insert("A");
		one.contains("A");
		assertEquals(one.size(), 1);
	}
	
	@Test
	public void testRepeatedContains() {
		SetADT<String> ab = new JavaSet<>();
		ab.insert("A");
		ab.insert("A");
		ab.insert("B");
		ab.contains("A");
		ab.contains("B");
		assertEquals(ab.size(), 2);
		assertEquals(true, ab.contains("A"));
		assertEquals(true, ab.contains("B"));
	}
	
	@Test 
	public void testRemoveOnce() {
		SetADT<String> one = new JavaSet<>();
		one.insert("A");
		one.remove("A");
		assertEquals(one.size(), 0);	
	}
	
	@Test
	public void testRepeatedRemove() {
		SetADT<String> ab = new JavaSet<>();
		ab.insert("A");
		ab.insert("A");
		ab.insert("B");
		ab.remove("A");
		assertEquals(ab.size(), 1);
		assertEquals(false, ab.contains("A"));
		assertEquals(true, ab.contains("B"));
		
	}
	
	
	
	
}
