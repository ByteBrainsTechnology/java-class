package com.bytebrains;

public class StringExample5 {
	public static void main(String[] args) {

		String s1 = "Welcome to ByteBrains Technology";
		String[] str = s1.split(" ");
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}

	}

}
