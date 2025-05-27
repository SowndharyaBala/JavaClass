package com.array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
//		 int arr1[] = {4,5,7,89,23,46,10};
//		 for(int num : arr1) {
//			 System.out.println(num);
//		 }
//		 System.out.println(Arrays.toString(arr1));
		 
		 
//		 int arr[] = new int [5];
//		 arr[0] = 10;
//		 arr[1] = 11;
//		 arr[2] = 14;
//		 arr[3] = 15;
//		 arr[4] = 18;
//		 System.out.println(arr[0]);
//		 
//		 for(int i =0; i< arr.length; i++) {
//			 System.out.println("i " + arr[i]);
//		 }
		
//		String names[] = new String [2];
//		names[0] = "alice";
//		names[1] = "hi";
//		
		
//			System.out.println(Arrays.toString(names));
	
	// sort
			
//			String[] cars = {"BMW", "volvo", "Hondo" , "toyoto"};
//			Arrays.sort(cars);
//			System.out.println(Arrays.toString(cars));
			
   //Binary search
//			String[] cars = {"BMW", "volvo", "Hondo" , "toyoto"};
//			Arrays.sort(cars);
//			int index = Arrays.binarySearch(cars, "volvo");
//			
//			if(index > 0) {
//				System.out.println("found");
//			}else {
//				System.out.println("not found");
//			}
	
			//euals 
			
//			int[] age = {4,4,5,3,8};
//			int[] num = {4,4,5,3,8};
//			
//			boolean isEqual = Arrays.equals(age, num);
//			System.out.println(isEqual );

			//fill
			
//			int[] numbers= new int[5];
//			Arrays.fill(numbers, 54);
//			System.out.println(Arrays.toString(numbers));
		
		
			
			//copyOf
			
//			int[] age = {11,12,13,14,15,16,17};
//			int [] newAge = Arrays.copyOf(age, 4);
//			System.out.println(Arrays.toString(newAge));
		
		
		//copyOfRange()
	int[] age = {11,12,13,14,15,16,17};
	int [] newAge = Arrays.copyOfRange(age, 2, 4);
			System.out.println(Arrays.toString(newAge));

}
}
