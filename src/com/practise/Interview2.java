package com.practise;

public class Interview2 {

	public static void main(String[] args) {
int count =0;
		String input ="111rrfd444";
		String input1="sai";
		for(char s:input.toCharArray()) {
		//s!={$[A-Za-z]+^}	
			if(Character.isDigit(s)){
				count++;
			}
		}
		
		System.out.println(count);

	String stringReversal = stringReversal(input1);
	
	}

	private static String stringReversal(String input1) {
		String s2="";
		for(int i=input1.length()-1;i>=0;i--) {
			s2=s2+input1.charAt(i);
		}
		return s2;
		// TODO Auto-generated method stub
		
	}

}
