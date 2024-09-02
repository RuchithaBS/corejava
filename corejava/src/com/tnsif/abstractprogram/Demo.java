package com.tnsif.abstractprogram;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("enter the salary of christiano");
		double christianosalary=Sc.nextDouble();
		Taxpayer ob=new christiano(christianosalary);
		
		System.out.println("enter the salary of Ruchitha");
		double Ruchithasalary=Sc.nextDouble();
		Taxpayer obone=new christiano(Ruchithasalary);
		
		System.out.println("Tax christiano");
		ob.display();
		
		System.out.println("Tax Ruchitha");
		obone.display();
		Sc.close();
		
		
	}

}
