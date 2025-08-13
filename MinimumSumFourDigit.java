package com.demo;

import java.util.Arrays;

public class MinimumSumFourDigit {

	public static void main(String[] args) {
		System.out.println(sumFour(1745));

	}
	
	public static int sumFour(int num) {
		int digit[]=new int[4];
		int i=0;
		while(num!=0) {
			digit[i]=num%10;
			i++;
			num=num/10;		
		}
		Arrays.sort(digit);
		int num1=digit[0]*10+digit[2];
		int num2=digit[1]*10+digit[3];		
		return num1+num2;
		
	}

}
