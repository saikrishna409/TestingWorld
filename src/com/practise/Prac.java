package com.practise;

import java.io.Reader;
import java.util.Arrays;
import java.util.List;

public class Prac {

	static int count;

	public static void main(String[] args) {
		//testDemo();
		int[] a = { 1, 3, 4, 2, 5 };
		//System.out.println(secondLargest(a));
		
		
		printNumbersStructured(Arrays.asList(19,23,2,5,16,9));

		/*
		 * List<? extends String> a; write<chunk<? extends String> c>
		 * 
		 * }
		 * 
		 * class A{
		 * 
		 * @Bean public Reader reader() { return new Reader(); }
		 */
	}

	private static void printNumbersStructured(List<Integer> List) {
		List.stream().filter(l->l%2!=0).forEach(System.out::println);
	}

	private static int secondLargest(int[] a) {
		int largest = a[0];
		int slargest = Integer.MIN_VALUE;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > largest) {
				slargest = largest;
				largest = a[i];
			} else if (a[i] < largest&&a[i]>slargest) {
				slargest = a[i];
			}
		}
		return slargest;
	}

	private static void testDemo() {
		String[] arr = { "AB", "CD", "EF" };

		if (count < arr.length) {
			System.out.println(arr[count++]);
		} else {
			count = 0;
		}
	}

}
