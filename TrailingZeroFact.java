package com.demo1;

public class TrailingZeroFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNumTrailingZero(125));

	}
	public static int getNumTrailingZero(int num) {
		int numerator=num;
		int denom=5;
		int ans=0;
		while(denom<=numerator) {
			ans=ans+numerator/denom;
			denom=denom*5;			
		}
		return ans;
		
	}

}
