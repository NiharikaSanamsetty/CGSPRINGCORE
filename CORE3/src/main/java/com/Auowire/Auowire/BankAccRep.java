package com.Auowire.Auowire;

public interface BankAccRep {

	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
	
	
}
