package com.divergent.string.question;

public class QuestionS17 {

	public static boolean isEmpty(String s) {
		return s == null || s.length() == 0;
	}

	public static int countMatches(String text, String str) {
		if (isEmpty(text) || isEmpty(str)) {
			return 0;
		}

//        int index = 0, count = 0;
//        while (true) {
//            index = text.indexOf(str, index);
//            if (index != -1) {
//                count ++;
//                index += str.length();
//            } else {
//                break;
//            }
//        }
		int count = 0;
		for (int index = 0; true; index++) {
			index = text.indexOf(str, index);
			if (index != -1) {
				count++;
				index += str.length();
			} else {
				break;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String text = "AABCCAAAAADCBBAADBBC";
		String str = "AA";

		int count = countMatches(text, str);
		System.out.println(count);
	}

}
