package com.paran.chapter18;

public class BankAccount {
	private AccountHolder owner;
	long balance;
	String accountNo;

	public void BankAccount(long balance, String accountNo, AccountHolder owner) {
		this.balance = balance;
		this.accountNo = accountNo;
		this.owner = owner;
	}
	
	public static void main(String[] args) {
		BankAccount bankinst = new BankAccount(1000000L, "1340127", new AccountHolder("홍길동", "Hong1234"));
		try {
			Bankinst
		}
	}
	
	public long withdraw(long amount) throws BalanceNotEnoughException {
		if ( balance - amount <= 0 ) {
			throw new BalanceNotEnoughException("잔액이 부족합니다");
		}
		balance = balance - amount;
		return amount;
	}
	public void deposite(long amount) {
		balance = balance + amount;
	}
	
	public AccountHolder getOwner() {
		return owner;
	}
	
	public void setOwner(AccountHolder owner) {
		this.owner = owner;
	}
}

class AccountHolder {
	String ownerName;
	String ownerId;
	String accoutNo;
	
	public AccountHolder(String ownerName, String ownerId) {
		this.ownerName = ownerName;
		this.ownerId = ownerId;
	}
}

class BalanceNotEnoughException extends Exception {
	public BalanceNotEnoughException() {
		super();
		
	}
	public BalanceNotEnoughException(String message) {
		super(message);
	}
}