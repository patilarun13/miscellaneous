package com.ap;

public class NonRepeating {

	public static void main(String[] args) {
		
		
		String s1 = "sttress";
		
		for(int i=0; i<s1.length() -1; i++) {
			char a = s1.charAt(i);
			int charOcc = 0;
			for(int j=0; j<s1.length() -1; j++) {
				if(a == s1.charAt(j)){
					charOcc++;
				}
				if(charOcc == 2) {
					break;
				}
			}
			if(charOcc == 1) {
				System.out.println("Here's your first non repetitive char: " +a);
				break;
			}
		}

	}

}
