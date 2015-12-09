package com.ap;

public class StringImmutability {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1 = "abc";
		
		System.out.println(s1);
		
		s1.concat(" xyz");
		
		System.out.println(s1);
	}
}
