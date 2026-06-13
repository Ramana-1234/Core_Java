package com.arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= new int[5];
		for (int i=0; i<a.length; i++) {
			b[i]=a[i];
			
		}
		System.out.print("Array a= " );

		for (int i=0; i<a.length; i++) {
			System.out.print( a[i]);
		}
		System.out.println("");
		System.out.print("Array b= " );

		for (int i=0; i<b.length; i++) {
			System.out.print(b[i]);
		}

	}

}
