package edu.smith.cs.csc212.adtr;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

// Wow, this class really needs some comments...
public class Challenges {

	/**
	 * Union is the combination of two sets of strings 
	 * Return a set of unique elements by combing two different sets left and right 
	 * @param left set of elements
	 * @param right another set of elements
	 * @return a combined set of unique elements of the two
	 */
	public static SetADT<String> union(SetADT<String> left, SetADT<String> right) {
		SetADT<String> output = new JavaSet<>();
		for (String l:left.toList()) {
			output.insert(l);
		}
		for (String r:right.toList()) {
			output.insert(r);
		}
		
		return output;
	}
	
	/**
	 * Intersection of the two sets is the set of elements 
	 * that is common in both sets
	 * @param left set of elements
	 * @param right another set of elements
	 * @return set of elements that are common in both sets 
	 */
	public static SetADT<String> intersection(SetADT<String> left, SetADT<String> right) {
		SetADT<String> output = new JavaSet<>();
		for (String l: left.toList()) {
			for(String r: right.toList()) {
				if(l ==r) {
					output.insert(l);
				}
				else {
					continue;
				}
			}
		}
		
		return output;
	}
	
	/**
	 * Count the words in the list and put them on the map.
	 * @param words a list of words
	 * @return a map with the number of times it appears on the list
	 */
	
	//TODO fix the counting system 
	public static MapADT<String, Integer> wordCount(ListADT<String> words) {
		MapADT<String, Integer> output = new JavaMap<>();
		
		
		for (String wi : words) {
			Integer prevCount = output.get(wi);
			if (prevCount == null) {
				prevCount = 0;
			}
			output.put(wi, prevCount + 1);
		}
		
		return output;
	}

}
