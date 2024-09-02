package com.tnsif.lambdaexp;

public class WithoutParameter {
	
	public static void main(String[] args) {
		
		Message m=()->{return "hello";};
		System.out.println(m.greet());
		
		
	}

}
