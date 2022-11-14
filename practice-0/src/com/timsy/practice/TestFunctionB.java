package com.timsy.practice;

public class TestFunctionB {

	public String functionB(String sen) {
		String[] words = sen.toLowerCase().split("[^A-Za-z0-9]");
		int maxIndex = 0;

		for (int i = 1; i < words.length; i++) {
			if (words[i].length() > words[maxIndex].length()) {
				maxIndex = i;
			}
		}

		return words[maxIndex];
	}

	public static void main(String[] args) {
		TestFunctionB test = new TestFunctionB();
		String result = test.functionB("Fat-oum56DRA");	
		System.out.println(result);
	}

}
