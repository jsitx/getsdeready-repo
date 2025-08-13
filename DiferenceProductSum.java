package com.demo;

public class DiferenceProductSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(difference(160));

	}

	public static int difference(int num) {		
		int sum=0;
		int product=1;		
		while(num!=0) {
			int digit=num%10;
			sum=sum+digit;
			product=product*digit;
			num=num/10;			
		}
		return Math.abs(product -sum);

	}

}
