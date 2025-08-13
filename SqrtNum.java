package com.demo;

public class SqrtNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrt(2));

	}
	
	public static int sqrt(int num) {
		int low=0;
		int high=num;
		while(low<=high) {
			int mid=low+(high-low)/2;
			int result=mid*mid;
			if(result==num) {
				return mid;				
			}
			if(result > num ) {
				high=mid-1;				
			}
			else {
				low=mid+1;
			}			
		}
		return high;
	}
	
	

}
