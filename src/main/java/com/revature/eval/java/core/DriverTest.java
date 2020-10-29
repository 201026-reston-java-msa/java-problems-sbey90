package com.revature.eval.java.core;



public class DriverTest {

	public static void main(String[] args) {
		
		

		System.out.println(cleanPhoneNumber("(313) 273-8ab*    !066-89631"));

	}

	
	public static String cleanPhoneNumber(String string) {
		String s1 = string.replaceAll("\\D+", "");
		
		for(int i = 0; i < s1.length(); i++) {
			if(s1.length() == 11) {
				s1 = s1.substring(1);
			} else if(s1.length() > 11) {
				throw new IllegalArgumentException("IllegalArgumentException");
			}
		}
		//String s2 = s1.substring(0, 11);
			return s1;
		
	} 

	
	
}