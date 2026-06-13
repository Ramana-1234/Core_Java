package com.arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int a[] = new int[5];
		System.out.println("Enter the Numbers :");
		 Scanner sc= new Scanner(System.in);
		 for (int i=0; i<a.length; i++) {
		 a[i] = sc.nextInt();
		 }
		 for(int i=a.length-1; i>=0; i--) {
			 System.out.print(a[i]+" ");
		 }
		 
		sc.close();

	}

}
