package banking;

/**
 * Represents a checking/savings bank account for a customer.
 */
public class BankAccount {
	
	//instance vars 
	
	/**
	 * Type of account (checking/savings)
	 */
	String accountType;
	
	/**
	 * Balance for bank account. 
	 */
	double balance; 
	/**
	 * Customer for this account. 
	 */
	Customer customer; 
	
	/**
	 * fixed amount for quick withdrawls
	 */
	double fastCashAmount;
	
	//constructor,<
	
	/** 
	 * Creates a bank account of given type for given customer.
	 * @param accountType for bank account
	 * @param customer for bank account 
	 */
	public BankAccount(String accountType, Customer customer) {
		this.accountType = accountType; 
		this.customer = customer; 
		
		//set initial default value for fast cash amount 
		this.fastCashAmount = 60;
		
	}
	
	//methods
	
	/** 
	 * Deposits the given amount. 
	 * @param amount to add to balance
	 */
	public void deposit(double amount) {
		if (amount > 0) {
		this.balance += amount; 
	}
	
	/**
	 * Withdraws the given amount from balance. 
	 * @param amount to withdraw 
	 * @throws Exception if given amount is larger than available balance
	 */
	
	public void withdraw(double amount) throws Exception {
		if (amount > this.balance) {
			throw new Exception ("Amount is greater than available balance.");
		}
		this.balance -= amount;
	}
	
	/** 
	 * withdraws the fast cash amount 
	 * @throws Exception if given fast cash amount is greater than available balance
	 */
	public void fastWithdraw() throws Exception {
		this.withdraw(this.fastCashAmount);
		
	}
	
	public void setFastCashamount (double amount) {
		if (amount > 0) {
		this.fastCashAmount = amount; 
		}
	}
	
	/**
	 * Returns account type and balance for this bank account.
	 * @returns string with all the info
	 */
	public String getAccountInfo() {
		return this.accountType + ": " + this.balance; 
	}
	
	/**
	 * Returns the customer name and address for this bank account. 
	 * @return string with all of the info 
	 */
	public String getCustomerInfo() {
		return this.customer.getName() + " from " + this.customer.getAddress();
	}
}
