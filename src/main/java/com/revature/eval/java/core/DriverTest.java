package com.revature.eval.java.core;

public class DriverTest {

	public static void main(String[] args) {

		System.out.println(getScrabbleScore("HELLO"));

	}

	public static int getScrabbleScore(String string) {
		String[] choice = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
				"T", "U", "V", "W", "X", "Y", "Z" };
		int[] points = { 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10 };
		// could refactor int array to match up with number of letters in alphabet with numerical options
		int score = 0;
		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < 26; j++) {
				if ((string.substring(i, i + 1).equals(choice[j].toLowerCase()) || string.substring(i, i + 1).equals(choice[j].toUpperCase()))) {
					score += points[j];
				}
			}	
		}
		return score;
	}

}