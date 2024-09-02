package com.tns.threads;

public class Firstway extends Thread{
	public void run() {
		System.out.println("creation o thread by extending thread class");
	}
	
	public static void main(strin[] args) {
		//TODO Auto-generated method stub
		
		Firstway ob=new Firstway();
		ob.start();
		
	}

}
