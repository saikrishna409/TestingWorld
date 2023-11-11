package com.practise;

public class test1 {

	public static void main(String[] args) {

		String input = "AAAAABBCCAAAD";
		String output = countChar(input);


		String output2 = countCharAll(input);
		
		/*
		 * int count=0; for (int i = 0; i < input.length(); i++) { char text
		 * =input.charAt(i); if(text=='A') { count++; output=output+text;
		 * 
		 * }
		 */

		/*
		 * else if(text=='B') { count++; output=output+(count*text); } else
		 * if(text=='C') { count++; output=output+(count*text); }
		 * 
		 * }
		 */
		System.out.println(output);
		System.out.println(output2);
	}

	private static String countCharAll(String input) {

		StringBuilder builder = new StringBuilder();
		
		int count[] = new int[256]; 
		
		for (int i=0;i<input.length();i++) {
			count[(int)input.charAt(i)]++;
		}

		for (int j = 0; j < count.length; j++) {
			if (count[j] > 0) {
				builder.append(count[j]).append((char)j);
			}
		}

		return builder.toString();
	}

	private static String countChar(String input) {
		StringBuilder sb = new StringBuilder();

		char current = input.charAt(0);
		int count = 1;

		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == current) {
				count++;
			} else {
				sb.append(count);
				sb.append(current);
				current = input.charAt(i);
				count = 1;
			}

		}
		sb.append(count);
		sb.append(current);

		return sb.toString();
	}

}
