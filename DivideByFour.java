package com.demo;

public class DivideByFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divideByFour(64));

	}
	public static boolean divideByFour(int n) {
		while(n%4==0) {
			n=n/4;			
		}
		return n==1?true:false;		
	}

}
