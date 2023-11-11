package com.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interview1 {

	public static void main(String[] args) {

		
		
		
		//array =[1,3,2,6,5,4,9,8,7]  target =7
	int	array[]= {1,2,3,4,5,6,7,8,9};
	int target =7;
	List<Integer> numsset = new ArrayList<>();
	List<Integer> nums2 = new ArrayList<>();	
		for(int i=0;i<array.length;i++) {
		int nums=array[i];
		int result=target-nums;
		if(numsset.contains(result)) {
			 nums2.add(result);
			 nums2.add(nums);
		}else {
			numsset.add(nums);
		}	
		
	}
	
	for(Integer out:nums2) {
		System.out.println(out);
	}
	
	/* copyof arrays*/
	
	int[] firstArray= {10,11,12,13,14};
	
	int[] testArray = testArray(firstArray);
	for(int s:testArray) {
		System.out.println(s);
	}
	}

	private static int[] testArray(int[] a) {
		int[] secondArray =new int[a.length];
		for(int i=0;i<secondArray.length;i++) {
			if(i<a.length)
			secondArray[i]=a[i];
		}
		return secondArray;
		
	}

}
