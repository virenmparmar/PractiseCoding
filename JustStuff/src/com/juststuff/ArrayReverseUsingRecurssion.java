package com.juststuff;
public class ArrayReverseUsingRecurssion {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6,6};
		
		reverse(arr);
		
		for(int i: arr) {
			System.out.print(i);
		}
	}

	private static void reverse(int[] arr) {
		// TODO Auto-generated method stub
		swap(0,arr.length-1, arr);
	}

	private static void swap(int i, int j, int[] arr) {
		// TODO Auto-generated method stub
		if(i>arr.length/2)
			return;
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		swap(i+1,j-1,arr);
					
	}

}
