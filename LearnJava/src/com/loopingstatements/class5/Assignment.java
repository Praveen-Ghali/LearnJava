package com.loopingstatements.class5;

public class Assignment {

	public static void main(String[] args) {
   int num = 1234;
 int rev = 0; //123 
 
 
 
 
 
 while(num !=0) {
	 
	 rev = rev*10 + num%10;// 123 
	 num = num/10;  //123
	 
	 
 }
 
 System.out.println(rev);
	}

}
