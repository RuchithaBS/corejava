package com.rbs.basicprograms;
import java.util.Scanner;
public class prg3 {
	public static void main(String args[]) {
		Scanner Sc=new Scanner(System.in);
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		if(a==b) {
			System.out.print("Equal");
		}
		else if(a>b){
			System.out.print("a is greater than b");
			}
		else if(a<b) {
			System.out.print("a is lesser than b");
		}
	
	}

}
