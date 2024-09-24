package com.SeleniumPractice;

public class sample {

	public static void main(String[] args) {
		
		String s = "SaiTEja";
		System.out.println(s.replace("a","s"));
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(" "+s.charAt(i));
		}
		
//		StringBuffer sb = new StringBuffer("SaiTeja");
//         System.out.println(sb.reverse());
	}

}
