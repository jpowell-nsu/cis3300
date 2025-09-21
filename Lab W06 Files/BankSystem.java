public class BankSystem {
	
    public static void main(String[] args) {
        BankAccount a = new BankAccount("Alice", 1000);
        BankAccount b = new BankAccount("Bob", 500);
        BankAccount c = new BankAccount("Charlie"); // overdraft enabled?

        // Deposit/withdraw confusion
        a.deposit(200);  // Static call via object
        b.withdraw(100); // Which balance?

        // Static print method doesn’t know which account
        BankAccount.showAccountInfo();

        // Interest calculation: shared vs per-account?
        System.out.println("Interest (Alice): " + a.calculateAnnualInterest());
        System.out.println("Interest (Bob): " + b.calculateAnnualInterest());

        // All owners tracked statically
        BankAccount.printAllOwners();

        // Access balance three different ways
        System.out.println("a.balance = " + a.balance);
        System.out.println("b.balance = " + b.balance);
        System.out.println("BankAccount.balance = " + BankAccount.balance);

        // Confusing behavior with mixed constructors
        BankAccount d = new BankAccount("Dana");
        System.out.println(d.getOwnerSummary());
    }
}