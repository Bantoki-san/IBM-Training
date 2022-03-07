package com.ibm.bank;

public final class AccountFactory {
	private AccountFactory() {
	}//The default constructor makes it possible to instantiate the class but the private access
	//specifer prevents it
	
	public static Account openSavings(String holder) {
		return new Savings(holder);
	}

	public static Account openCurrent(String holder) {
		return new Current(holder);
	}

}
//THE CLASS WAS MADE final TO PREVENT CREATION OF ITS SUBCLASSES
//BECAUSE STATIC METHODS OF THE CLASS CANNOT BE INHERITED AND IT WOULD BE WASTE OF TIME
