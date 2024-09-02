//program to demonstrate the abstract class
package com.tnsif.abstractprogram;
//non concrete class
public abstract class Taxpayer {
	protected double salary;
	public Taxpayer(double salary) {
		super();
		this.salary = salary;
	}
	public abstract double calTax();
	public void display() {
		System.out.println("the tax payed is"+calTax());
	}

}
