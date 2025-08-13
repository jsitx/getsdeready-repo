package com.demo;

import java.util.Arrays;

public class PlusOneLargeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {1,5,9};
		int y[]=getPromotedByOne(x);
		System.out.println(Arrays.toString(y));
	}
	
	public static int[] getPromotedByOne(int input[]) {
        for(int i=input.length-1;i>=0;i--) {
        	if(input[i] < 9) {
        		input[i]++;
        		return input;        		
        	}
        	input[i]=0;        	
        }
        int result[]=new int[input.length+1];
        result[0]=1;
        return result;
	}	
	
}
