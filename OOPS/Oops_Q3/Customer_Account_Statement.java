package Oops_Q3;

public class Customer_Account_Statement extends Customer {

	private int cAID;
	private double amount;
	private double deposit_withdrawl;
	private String deposit_date;

	public Customer_Account_Statement(int custId, int accountno, String custname, String cust_dob,
			String cust_account_opening_date, Branch branch_Obj, int cAID, double amount, double deposit_withdrawl,
			String deposit_date) {

		super(custId, accountno, custname, cust_dob, cust_account_opening_date, branch_Obj);
		this.cAID = cAID;
		this.amount = amount;
		this.deposit_withdrawl = deposit_withdrawl;
		this.deposit_date = deposit_date;
	}

	public int getCAID() {
		return cAID;
	}

	public void setCAID(int cAID) {
		this.cAID = cAID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getDeposit_withdrawl() {
		return deposit_withdrawl;
	}

	public void setDeposit_withdrawl(double deposit_withdrawl) {
		this.deposit_withdrawl = deposit_withdrawl;
	}

	public String getDeposit_date() {
		return deposit_date;
	}

	public void setDeposit_date(String deposit_date) {
		this.deposit_date = deposit_date;
	}

	@Override
	public String toString() {
		return "Customer_Account_Statement [CAID=" + cAID + ", amount=" + amount + ", deposit_withdrawl="
				+ deposit_withdrawl + ", deposit_date=" + deposit_date + "]";
	}

}
