package com.tnsif.abstractprogram;
public class christiano extends Taxpayer{

    public christiano(double salary) {
	super(salary);
}

	@Override
	public double calTax() {
		// TODO Auto-generated method stub
		if(salary<=500000) {
			return salary*0.10;
		}
		else
			return salary*0.20;
	}


	

}
