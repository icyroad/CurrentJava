package chaptor07.exercise;

public class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public boolean withdraw(int amount) {
		if (balance - amount < 0) {
			System.out.println("잔액이 부족합니다.");
			return false;
		} else {
			balance +=amount;
			return false;
		}
	}
	
	public boolean transfer(int amount, BankAccount otherAccount) {
		return false;
	}
}
