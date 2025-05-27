package com.practice;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {


//		int arr[] = {1,2,3,4,5,6};
//		System.out.println(Arrays.toString(arr));
		
		
		//sum of elements
//		int arr[] = {2,4,6};
//		int result = 0;
//		for(int i =0; i<arr.length; i++ ) {
//			
//			 result+= arr[i]; 
//		}
//		
//		System.out.println(result);
		
		//largest element
//		int[] arr = {25, 10, 15, 2, 20};
//		int max = arr[0];
//		for(int i = 0; i <arr.length;i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		
//		System.out.println("Largest : " + max);
		
		
		
		//smallest
		
//		int arr1 [] = new int[4];
//		arr1[0]= 71;
//		arr1[1]= 11;
//		arr1[2]= 21;
//		arr1[3]= 31;
//		
//		int smallest = arr1[0];
//		for(int i = 1; i<arr1.length; i++) {
//			if(arr1[i] < smallest) {
//				smallest = arr1[i];
//			}
//		}
//		
//		System.out.println("Smallest : " + smallest);
		
		
		int []numbers = {1,2,7,9,5,3};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
//		int index = Arrays.binarySearch(numbers, 9);
//		if(index >0) {
//			System.out.println("Index : " + index);
//		}else {
//			System.out.println("ELEMENT NOT FOUND");
//		}
//System.out.println(index);
		
//		int arr1[] = {1,2,3};
//		int arr2[] = {1,3,2};
//		
//		System.out.println("Array eual : " + Arrays.equals(arr1, arr2));
		
		int [] fillArray = new int [5];
		Arrays.fill(fillArray, 10);
		System.out.println(Arrays.toString(fillArray));
		
		
		//copyof
		int[] copyOf = Arrays.copyOf(numbers, 2);
		System.out.println(Arrays.toString(copyOf));
		
		int[] Range = Arrays.copyOfRange(numbers, 2, 10);
		System.out.println(Arrays.toString(Range));
	}

}
