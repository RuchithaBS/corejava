package com.rbs.basicprograms;
import java.util.Scanner;
public class Firstprogram {
	public static void main(String args[]) {
		Scanner Sc=new Scanner(System.in);
		int age=Sc.nextInt();
		System.out.print(age + "is" );
		if(age>18) {
			System.out.print("ADULT");
		}
			else {
				System.out.print("NOT ADULT");
			}
	}

}
