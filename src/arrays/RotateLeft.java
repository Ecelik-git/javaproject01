package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateLeft {

	public static void main(String[] args) {
//		Type a program like; given an array whose length is 3, 
//		return an array with the elements "rotated left" abc
//		For example; if the array is [1, 2, 3] output will be [2, 3, 1].
		int arr[]= new int[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		for(int i=0; i<3; i++) {
			arr[i]=scan.nextInt();
		}
		//print previous array
		System.out.println("Before rotating "+Arrays.toString(arr));
		int temp = arr[0];
		arr[0]=arr[2];
		arr[2]= temp;
		//print the array
		System.out.println("Rotated List "+ Arrays.toString(arr));
		scan.close();
	}

}
