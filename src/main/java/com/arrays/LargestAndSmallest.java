package com.arrays;

import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {
		int numbers[]=new int[5];
		
		System.out.println("Enter the Numbers :");
		Scanner sc =new Scanner(System.in);
		for (int i=0; i<numbers.length; i++) {
			numbers[i]= sc.nextInt();
		}
		int large=numbers[0];
		int small=numbers[0];
		for(int i=0; i<numbers.length; i++) {
			
			if(large<numbers[i]) {
				large=numbers[i];
			}else {
				small=numbers[i];
			}
			
			}
		System.out.println("Largest =" + large);
		System.out.println("Smallest =" + small);

		sc.close();

	}

}
