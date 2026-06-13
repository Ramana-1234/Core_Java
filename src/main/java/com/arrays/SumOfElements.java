package com.arrays;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		int numbers[]=new int[5];
		int sum=0;
		System.out.println("Enter the Numbers :");
		Scanner sc =new Scanner(System.in);
		for (int i=0; i<numbers.length; i++) {
			numbers[i]= sc.nextInt();
			sum = sum+numbers[i];
			}
		System.out.println(sum);
		sc.close();

	}

}
