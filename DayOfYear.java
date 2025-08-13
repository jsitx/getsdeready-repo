package com.demo1;

import java.util.GregorianCalendar;

public class DayOfYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNumberOfDays("2000-12-04"));
	}
	public static int getNumberOfDays(String date) {
		int monthDays[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		char chDate[]=date.toCharArray();
		char yearChar[]=new char[4];
		for(int i=0;i<4;i++) {
			yearChar[i]=chDate[i];			
		}		
		int year=Integer.parseInt(String.valueOf(yearChar));
		int month=Integer.parseInt(String.valueOf((chDate[5]-'0'))+String.valueOf(chDate[6]-'0'));
		int day=Integer.parseInt(String.valueOf((chDate[8]-'0'))+String.valueOf((chDate[9]-'0')));
		if(month==1) {
			return day;			
		}
		int monthDayCount=0;
		for(int i=0;i<month-1;i++) {			
			monthDayCount=monthDayCount+monthDays[i];
			if(new GregorianCalendar().isLeapYear(year) && month > 2) {
				monthDayCount=monthDayCount+1;			
			}
		}
		
		return monthDayCount+day;		
	}	

}
