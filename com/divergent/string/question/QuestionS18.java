package com.divergent.string.question;

import java.util.Arrays;

public class QuestionS18 {

	static boolean areAnagram(char[] str1, char[] str2) {
		int n1 = str1.length;
		int n2 = str2.length;

		if (n1 != n2)
			return false;
		Arrays.sort(str1);
		Arrays.sort(str2);

		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;
		return true;
	}

	public static void main(String[] args) {
		char str1[] = { 'a', 'b', 'c', 'd' };
		char str2[] = { 'c', 'b', 'a', 'd' };

		if (areAnagram(str1, str2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
