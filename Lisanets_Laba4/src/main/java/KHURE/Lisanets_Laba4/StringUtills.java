package KHURE.Lisanets_Laba4;

import java.util.HashSet;
import java.util.Set;

public class StringUtills {

	/**
	 * Task 1
	 * 
	 * 
	 */
	public String reverse(String str) {

		StringBuilder stringBuilder = new StringBuilder(str);
		stringBuilder.reverse();
		return stringBuilder.toString();

	}

	/**
	 * Task 2
	 * 
	 */
	public Set<Character> findDifChar(String strOne, String strTwo) {

		Set<Character> set = new HashSet<Character>();
		char tmpChar;
		for (int i = 0; i < strOne.length(); i++) {
			tmpChar = strOne.charAt(i);
			if (!strTwo.contains(tmpChar + "")) {
				set.add(tmpChar);
			}
		}

		return set;

	}

	// Task3
	public String changeSubstring(String text, String strOne, String strTwo) {

		return text.replaceAll(strOne, strTwo);

	}

	// Task4
	public void demoInColumn(String text) {

		String[] array = text.split(" ");

		for (int i = 0; i < array.length; i++) {

			if (array[i].length() > 0) {
				System.out.println(array[i]);
			}
		}

	}
}
