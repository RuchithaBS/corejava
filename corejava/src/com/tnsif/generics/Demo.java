package com.tnsif.generics;

public class Demo {
	public static void main(String[] args) {
		Generic<String> Stringobj=new Generic();
		Stringobj.setData("hello");
		System.out.println("the string object " +stringobj.getdata());
		
		Generic<Integer> intobj=new Generic();
		Stringobj.setData("hello");
		System.out.println("the string object " +intobj.getdata());
		
		Generic<String> doubleobj=new Generic();
		Stringobj.setData("hello");
		System.out.println("the string object " +doubleobj.getdata());
	}

}
