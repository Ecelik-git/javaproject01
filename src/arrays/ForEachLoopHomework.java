package arrays;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopHomework {

	public static void main(String[] args) {
		//Create an integer array find the sum of all elements 
		//by using for-each loop and print the sum on the console.
		
		//initializing array
		int arr[]= {2, 5, 6, 78, 34, 56, 1};
		//initializing sum variable
		int sum = 0;
		//calculating sum with for each
		for(int i : arr) {
			sum +=i;
		}
		//print the sum o the console
		System.out.println("Sum of Array is: "+sum);
		
		//Create a list find the sum of all elements 
		//by using for-each loop and print the sum on the console.
		
		sum =0;//reset sum to 0
		//initializing sum and list
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		
		//using for each, calculate sum of list
		for(int i : list1) {
			sum += i;
		}
		//print the sum o the console
		System.out.println("Sum of Array List is: "+sum);
		
		//Write a Java program to find the common elements 
		//between two arrays (string values).
		
		//initialize the first string list
		List<String> list2 = new ArrayList<>();
		list2.add("abc");
		list2.add("cba");
		list2.add("def");
		list2.add("fed");
		list2.add("gth");
		
		//initialize the second string list
		List<String> list3 = new ArrayList<>();
		list3.add("abc");
		list3.add("def");
		list3.add("klm");
		list3.add("string");
		
		//check if first list contains second list
		boolean list = list3.removeAll(list2);
		
		//we removed list2 items from list3 
		//let's add them back
		
		list3.add("abc");
		list3.add("def");
		list3.add("klm");
		list3.add("string");
		
		//if list2 is removable from list3
		if(list) {
			//print the common elements with for each
			for(String str : list2) {
				if(list3.contains(str)) {
					System.out.println(str);
				}
				
			}
			//if list2 is not removable from list3	
		}else {
			System.out.println("no common elements");
		}
		
		
	}

}
