package investing;

public class InvestmentPortfolio {
    
	private Investor investor;
	private Investment[] investments;

	public InvestmentPortfolio(Investor investor, Investment[] investments) {
		this.investor = investor;
		this.investments = investments;
	}

	public Investor getInvestor() {
		return investor;
	}

	public void setInvestor(Investor investor) {
		this.investor = investor;
	}

	public Investment[] getInvestments() {
		return investments;
	}

	public void setInvestments(Investment[] investments) {
		this.investments = investments;
	}

	public void printPortfolioSummary() {
		// notice how I can print investor without it showing the identity - the is the effect of toString()
		//investor.toString();
		System.out.println("Portfolio for " + investor + ":\n");
		double totalValue = 0;
		for (Investment inv : investments) {
			// notice how I can print investment without it showing the identity - the is the effect of toString()
			System.out.println(" - " + inv);
			totalValue += inv.getCurrentValue();
		}
		System.out.printf("\nTotal portfolio value: $%.2f\n", totalValue);
	}
	
	public double getTotalValue() {
		double total = 0;
		for (Investment inv : investments) {
			total += inv.getCurrentValue();
		}
		return total;
	}
	
}
