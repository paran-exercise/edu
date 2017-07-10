package com.paran.chapter19;

public class BankAccount {
	private static AccountHolder owner;
	public AccountHolder getOwner() {
		return owner;
	}
	public void setOwner(AccountHolder owner) {
		this.owner = owner;
	}
	long balance;
	public long withdraw(long amount) throws BalanceNotEnoughException{
		if(balance - amount <=0){
			throw new BalanceNotEnoughException("잔액이 부족합니다");
		}
		balance = balance - amount;
		return amount;
	}
	public void deposite(long amount){
		balance = balance + amount;
	}
	public static void main(String[] args){
		
		AccountHolder obj = new AccountHolder("홍길동","20140710","64112112312");
		System.out.println(owner.accountNo);
		System.out.println(owner.ownerId);
		System.out.println(owner.ownerName);
		
	}
	
}
class AccountHolder{
	String ownerName;
	String ownerId;
	String accountNo;
	public AccountHolder(String ownerName, String ownerId, String accountNo){
		this.ownerName =  ownerName;
		this.ownerId =  ownerId;
		this.accountNo = accountNo;
	}
}
class BalanceNotEnoughException extends Exception{
	public BalanceNotEnoughException(){
		super();
	}
	public BalanceNotEnoughException(String message){
		super(message);
	}

}