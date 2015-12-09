/**
 * 
 */
package com.ap;

import java.util.HashMap;

/**
 * @author patil.arun
 *
 */
public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "java");
		map.put(2, "dotNet");
		map.put(1, "java");
		
		System.out.println(map);
	}

}
