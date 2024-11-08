package com.interviewques;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // lets reverse year 1987
        System.out.println("The reverse of number 54321 is = "
                + reverseNumber(54321));
	}

	private static int reverseNumber(int number) {
		// TODO Auto-generated method stub
		 
		// local variable
        int reversed = 0;
        
        while(number !=0) {
        	reversed = (reversed*10) + (number %10);
        	number = number/10;
        	
        }
		return reversed;
	}
	
	 
	

}
