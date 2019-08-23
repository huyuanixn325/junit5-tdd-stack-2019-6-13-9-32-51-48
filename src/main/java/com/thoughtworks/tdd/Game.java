package com.thoughtworks.tdd;

public class Game {

	public static String FIZZ="Fizz";
	public static String BUZZ="Buzz";
	public static String WHIZZ="Whizz";
	
	public String fizzBuzz(int i) {
		String result="";
		if(i>120||i<1) return "Invalid";
		if(i%3==0)  result+=FIZZ;
		if(i%5==0)  result+=BUZZ;
		if(i%7==0)  result+=WHIZZ;
		if(result.equals("")) result+=i;
//		if(i%5==0&& i%7==0 && i%5==0) return FIZZ+BUZZ+WHIZZ;	
//		if(i%5==0&& i%7==0) return BUZZ+WHIZZ;		
//		if(i%3==0&& i%7==0) return FIZZ+WHIZZ;		
//		if(i%3==0&& i%5==0) return FIZZ+BUZZ;
//		if(i%3==0) return FIZZ;
//		if(i%5==0) return BUZZ;
//		if(i%7==0) return WHIZZ;
		return result;
	}
}
