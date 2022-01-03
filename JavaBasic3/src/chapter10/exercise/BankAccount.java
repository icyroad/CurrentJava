package chapter10.exercise;

public abstract class BankAccount {
	protected int balance;

	protected BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public boolean withdraw(int amount) {
		if (amount < 0) {
			throw new IllegalArgumentException();
		} else if (balance - amount < 0) {
			return false;
		} else {
			balance -= amount;
			return true;
		}
	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (otherAccount == null) {
			throw new NullPointerException();
		} else if (amount < 0) {
			System.out.println("금액은 음수일 수 없습니다.");
			return false;
		} else if (balance - amount < 0) {
			throw new IllegalArgumentException();
		} else {
			balance -= amount;
			otherAccount.balance += amount;
			return true;
		}
	}

	public String toString() {
		return String.format("잔액: %,d", balance);
	}

	public abstract String getAccountType();
	//
}