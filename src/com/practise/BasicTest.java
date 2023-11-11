package com.practise;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BasicTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		
		
		int x=100;
		byte ba=(byte)x;
		//System.out.println(ba);//ba =100
		int x1=1000;
		byte ba1=(byte)x1;
		System.out.println(ba1);//ba1 =-24
		boolean b = false;
		System.out.println(b == true ? "Yes" : "No");
		int[] a = { 1, 2, 3, 6, 1, 3, 21 };
		
		
		 
		
		
		
		for(int i=0;i<a.length;i++) {
			if(6==a[i]) {
				int j = a[i];
			}
		}
		
		
		//find day o fweek with date,month,year
		String findDay = BasicTest.findDay(10, 27, 2023);
		System.out.println(findDay);
		
		
		
		
//		ArrayList<Integer> arrayList = new ArrayList<>();
//		for(int i=0;i<10;i++) {
//			arrayList.add(i+1);
//		}
//		//List<Integer> collectList =
//				//arrayList.stream().filter(a-> a%2==0).forEach(System.out::println);
//				//.collect(Collectors.toList());
//				
////				  for(Integer a:collectList) { System.out.println(a); }
//		
//		
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("hi");	
//		int nextInt = scanner.nextInt();
	}
	
	
	public static String findDay(int month, int day, int year) {
	       
	      /*Another way, but Date() is depricated */
	      //SimpleDateFormat s = new SimpleDateFormat("dd/mm/yyyy");
	      // Date date= new Date(day+"/"+month+"/"+year);
	     //  s.applyPattern("EEEE");
	      //return s.format(date).toUpperCase();
	    
		
		/*short cut of below logic*/
	    //    Calendar c1 =Calendar.getInstance();
	    //    c1.set(year, month-1, day);
	    //    return c1.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("en","UK")).toUpperCase();

	       
	       Calendar c= Calendar.getInstance();
	       c.set(Calendar.MONTH,month-1);
	       c.set(Calendar.DATE,day);
	       c.set(Calendar.YEAR,year);
	       
	     String dayType = c.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,Locale.US).toUpperCase();
	return dayType;
	}

}
