package com.java.array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
//		int arr[] <=> int[] arr		{both are equivalent}
		
		int arrContainer[] = new int[20];
		for (int i=0; i<arrContainer.length; i++) {
			arrContainer[i] = i*i*i*i*i;
		}
		
		for (int n: arrContainer) {
			System.out.print(n + " ");
		}
		
		System.out.println("\nSum: " + sum(arrContainer) + sum(arr));

	}

	private static int sum(int array[]) {
		int x = 0;
		for (int item: array)
			x = x+item;
		return x;
	}

}
