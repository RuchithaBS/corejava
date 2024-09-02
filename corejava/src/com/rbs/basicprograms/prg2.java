package com.rbs.basicprograms;

import java.util.Scanner;

public class prg2 {
	public static void main(String args[]) {
		Scanner Sc=new Scanner(System.in);
		int number=Sc.nextInt();
		System.out.print(number);
		if((number%2)==0) {
			System.out.print("is even");
			}
		else {
			System.out.print("is odd");
		}
	}
}
