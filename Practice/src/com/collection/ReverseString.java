package com.collection;

public class ReverseString {

	static String str;

	public ReverseString(String s) {
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		this.str = s1;
		System.out.println(s1);
	}

	
	public static String reverseString(String s) {
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		return s1;
	}

	public static void main(String[] args) {

		String s = "Pournima";

//		System.out.println(s.charAt(3));// it will the index value String

		String s2 = reverseString(s);

		System.out.println(s2);

		ReverseString rs = new ReverseString(s);

		System.out.println(str);

		
	}

}
