package com.demo1;

import java.util.GregorianCalendar;

public class CountOverLapDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countDaysTogether("08-15","08-18","08-18","08-19"));

	}
	
	  public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
		  int arriveAllice=getNumberOfDays(arriveAlice);
		  int arrivebob=getNumberOfDays(arriveBob);
		  int leavealice=getNumberOfDays(leaveAlice);
		  int leavebob=getNumberOfDays(leaveBob);
		  int overlap= Math.min(leavealice, leavebob) - Math.max(arriveAllice, arrivebob);
		  if(overlap < 0) {
			  return 0;			  
		  }
		  else {
			  return overlap+1;
			  }
	        
	    }
	
	
	public static int getNumberOfDays(String date) {
		int monthDays[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		char chDate[]=date.toCharArray();			
		int month=Integer.parseInt(String.valueOf((chDate[0]-'0'))+String.valueOf(chDate[1]-'0'));
		int day=Integer.parseInt(String.valueOf((chDate[3]-'0'))+String.valueOf((chDate[4]-'0')));
		if(month==1) {
			return day;			
		}
		int monthDayCount=0;
		for(int i=0;i<month-1;i++) {			
			monthDayCount=monthDayCount+monthDays[i];			
		}		
		return monthDayCount+day;		
	}	


}
