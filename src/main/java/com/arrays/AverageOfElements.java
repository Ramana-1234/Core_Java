package com.arrays;

import java.util.Scanner;

public class AverageOfElements {
	public static void main (String args[]) {
		int numbers[]=new int[5];
		int sum=0;
		double average;
		System.out.println("Enter the Numbers :");
		Scanner sc =new Scanner(System.in);
		for (int i=0; i<numbers.length; i++) {
			numbers[i]= sc.nextInt();
			sum = sum+numbers[i];
			}
		average = (double)sum/numbers.length;
		System.out.println("Average = " + average);
		sc.close();
		
	}

}
