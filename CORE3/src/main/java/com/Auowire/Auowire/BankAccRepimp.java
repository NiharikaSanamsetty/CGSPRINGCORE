package com.Auowire.Auowire;


public abstract class BankAccRepimp implements BankAccRep {
	
	private void BankAccRepoImp(){
	  BankAcc bankaccount = new BankAcc();
	  bankaccount.setAccountHolderName("Harry");
	  bankaccount.setAccountId(43);
	  bankaccount.setAccountType("Savings");
	  bankaccount.setAccountBalance((long) 2394.434);


	}
}
