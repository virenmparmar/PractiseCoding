package com.juststuff;

public class PalindroneUsingRecurssion {
	//Implementation of Palindrone using 
	public static void main(String[] args) {
		String temp = "abcdedcba";
		System.out.println(palindrone(temp));
	}

	private static boolean palindrone(String temp) {
		// This function checks if the following code 
		if(temp.length()<=1)
			return true;
		return verify(0, temp.length(), temp);
	}

	private static boolean verify(int i, int n, String temp) {
		/*
		 * If the first and last character match, then call the function verify second
		 * and second last and so on. If they dont match then return false. we do this
		 * until the centre of the string.
		 */
		boolean ans;
		if(temp.charAt(i)==temp.charAt(n-i-1)) {
				ans = true;
				if(i<n/2)
					ans = verify( i+1, n, temp);
		} else 
			ans = false;
		
		return ans;
	}

}
