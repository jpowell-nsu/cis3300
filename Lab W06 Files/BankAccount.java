class BankAccount {
	
	static double balance = 0.0;    // BUG: shared across all accounts
	static double defaultInterest = 0.05;
	static int accountCounter = 0;
	static ArrayList<String> allOwners = new ArrayList<>();

	String owner;
	double interestRate;
	int accountId;
	boolean overdraftAllowed;

	public BankAccount(String name, double balance) {
		this.owner = name;
		this.balance = balance;  // BUG: static misuse
		this.interestRate = defaultInterest;
		this.accountId = accountCounter; // BUG: doesn’t increment
		accountCounter = accountId; // BUG: overwrites
		allOwners.add(owner);
	}

	public BankAccount(String name) {
		this.owner = name;
		balance = 0;   // BUG: resets static balance
		accountId = ++accountCounter; // Half-fix?
		overdraftAllowed = true; // Why only here?
	}

	public static void deposit(double amt) {
		balance += amt;
	}

	public void withdraw(double amt) {
		if (!overdraftAllowed && amt > balance) {
			System.out.println("Overdraft not allowed!");
		} else {
			balance -= amt; // BUG: affects all accounts
		}
	}

	public static void showAccountInfo() {
		System.out.println("Account ID: " + this.accountId);
		System.out.println("Owner: " + this.owner);
		System.out.println("Balance: " + balance);
		System.out.println("Rate: " + this.interestRate);
	}

	// Misleading "utility" method
	public static double calculateAnnualInterest() {
		// BUG: uses static balance instead of per account
		return balance * defaultInterest;
	}

	// Confusing extra method 
	public String getOwnerSummary() {
		return owner + " (#" + accountId + ")";
	}

	// A truly useless static method
	public static void printAllOwners() {
		System.out.println("Owners list (maybe outdated): " + allOwners);
	}
}