package com.interviewques;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("1.Check for number 153 \n"
	                + checkArmstrongNumber(153));
	 
	        System.out.println("\n2.Check for number 1634 \n"
	                + checkArmstrongNumber(1634));
	 
	        System.out.println("\n3.Check for number 1234 \n"
	                + checkArmstrongNumber(1234));
	}

	public static String checkArmstrongNumber(int number) {
		 
        // local variables
        int remainder = 0;
        int result = 0;
        int length = 0;
        
        int dividend = number;
        
        length = String.valueOf(number).length();
        
        
        while(number >0) {
        	
        	remainder = number %10;
        	
        	number = number/10;
        	int temp=1;
        	for(int index =0; index< length; index++) {
        		temp = temp * remainder;
        	}
        	result = result + temp;
  
        }
  
        if(dividend == result) {
        	return "The given number is ArmStrong";
        }else {
        	return "The given number is not armstrong";
        }
        
	}
}
