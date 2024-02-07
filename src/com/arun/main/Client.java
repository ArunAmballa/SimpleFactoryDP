package com.arun.main;

import java.util.Scanner;

public class Client {
	
	
	public static void main(String args[]) {
		
		System.out.println("Enter Logger You Want");
		
		Scanner sc=new Scanner(System.in);
		
		String input=sc.next();
		
		ILogger logger=Factory.getInstance(input);
		
		logger.Log();
		
		
	}

}
