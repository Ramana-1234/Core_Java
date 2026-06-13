package com.example;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("Enter a Number");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			
			sum=n*i;
			
			System.out.println(n+ "*"+ i+ "="+ sum);
			
		}

	}

}
