package com.JavaPractice;

public class SecondLargeOfArray {
	
	public static void main(String[] args) {
		
		int arr[]= {2,5,8,1,9,9,3,4};
		int largest=arr[0];
		int secondLargest=arr[0];
		
		for(int i=0;i<arr.length;i++) { // 0, 1, 2, 3, 4, 5, 6
			if(arr[i]>largest) { //2>2, 5>2, 8>5, 1>8, 9>8, 3>9, 4>9
				secondLargest=largest; // sl=2, sl=2, sl=5, sl=8
				largest=arr[i]; // l=2, l=5, l=8, l=9
			}
			if(arr[i]>secondLargest && arr[i]!=largest) { // 
				secondLargest=arr[i];
			}
			
		}
		System.out.println("The second largest element in the array is: " + secondLargest);
	}

}
