package com.arrays;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
        int numbers[]=new int[3];
		
		System.out.println("Enter the Numbers :");
		Scanner sc =new Scanner(System.in);
		for (int i=0; i<numbers.length; i++) {
			numbers[i]= sc.nextInt();
		}
		int large=numbers[0];
		int SecondLarge=numbers[0];
		for(int i=0; i<numbers.length; i++) {
			
			if(large < numbers[i]) {
				large =  numbers[i];
			} 
			
		}
		for (int i=0; i< numbers.length; i++) {
			if(numbers[i]==large) {
				continue;
			}
			if (SecondLarge < numbers[i]) {
				SecondLarge = numbers[i];
			}
		}
		System.out.println("Largest =" + large);
		System.out.println("SecondLargest =" + SecondLarge);

		sc.close();

	}

}
