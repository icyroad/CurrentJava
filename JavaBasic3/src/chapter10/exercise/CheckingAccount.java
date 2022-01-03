package chapter10.exercise;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	@Override
	public boolean withdraw(int amount) {
		if (amount < 0) {
			System.out.println("금액은 음수일 수 없습니다.");
			return false;

		} else if (super.getBalance() - amount < 0) {
			this.protectedBy.withdraw(amount - super.getBalance());
			super.withdraw(super.getBalance());
			return true;

		} else {
			super.withdraw(amount);
			return true;
		}

	}

	@Override
	public String getAccountType() {
		return "당좌예금";
	}
}
