package com.tnsif.encapsulation;

public class EncapsulationDemo {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Encapsulation ob= new Encapsulation();//object creation
			//ob.name="ruchi";//calling the variable
			//ob.age=23;
			//ob.serialNum=22;
			
			ob.setAge(22);
			ob.setName("ruchi");
			ob.setSerialNum(2);
			System.out.println(ob);

		}

	}

}
