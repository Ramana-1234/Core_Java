package com.arrays;

import java.util.Scanner;

public class EvenAndOddCount {

	public static void main(String[] args) {
		int numbers[]=new int[5];
		int even=0;
		int odd=0;
		System.out.println("Enter the Numbers :");
		Scanner sc =new Scanner(System.in);
		for (int i=0; i<numbers.length; i++) {
			numbers[i]= sc.nextInt();
			if(numbers[i]%2==0) {
				even=even+1;
			}else {
				odd++;
			}
			}
		System.out.println("Eveno Count="+even);
		System.out.println("Odd Count="+odd);

		sc.close();

	}

}
