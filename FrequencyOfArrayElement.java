package com.JavaPractice;

public class FrequencyOfArrayElement {
	public static void main(String[] args) {
		
		int a[]= {2,5,2,6,7,5,3,2};
		
		int freq[]=new int[a.length];
		int visited=-1;
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited) {
				freq[i]=count;
			}
		}
		System.out.println("Frequency of each element in the array:");
		for(int i=0;i<a.length;i++) {
			if(freq[i]!=visited)
				System.out.println(a[i] + " occurs " + freq[i] + " times");
		}
	}

}
