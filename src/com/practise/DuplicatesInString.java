package com.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class DuplicatesInString {

	public static void main(String[] args) {

		 String inputs ="JavaProgramming";
		char[] charArray = inputs.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=1;i<charArray.length;i++) {
			if(charArray[i]==charArray[i-1]) {
				set.add(charArray[i]);
			}
		}
		
		System.out.println("Duplicates are:"+set);
		
		/*
		 * for(char c1:inputs.toCharArray()) { if(set.contains(c1)) { continue; }else {
		 * System.out.println(c1); } }
		 */
		
		/* using Hashmap to count*/
		
		 Map<Character, Integer> data = new HashMap<>();
		 
		for(int i=0;i<inputs.length();i++) {
			char c =inputs.charAt(i);
		data.put(c,data.getOrDefault(c, 0)+1);
		}
		
		ArrayList<Character> duplicateslist = new ArrayList<>();
		
		for(Map.Entry<Character, Integer>  entry:  data.entrySet()) {
			if(entry.getValue()>1) {
				duplicateslist.add(entry.getKey());
			}
		}
		
		System.out.println(duplicateslist);
	}

}
