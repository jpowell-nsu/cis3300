package investing;

public class Investment {
	
	private String assetName;
	private String type;
	private double amountInvested;
	private double returnRate;

	public Investment(String assetName, String type, double amountInvested, double returnRate) {
		this.assetName = assetName;
		this.type = type;
		this.amountInvested = amountInvested;
		this.returnRate = returnRate;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmountInvested() {
		return amountInvested;
	}

	public void setAmountInvested(double amountInvested) {
		this.amountInvested = amountInvested;
	}

	public double getReturnRate() {
		return returnRate;
	}

	public void setReturnRate(double returnRate) {
		this.returnRate = returnRate;
	}

	public double getCurrentValue() {
		return amountInvested * (1 + returnRate);
	}

	// this overrides the inherited toString and allows us to print the object easily
	//	(see printPortfolioSummary in InvestingPortfolio.java)
	public String toString() {
		return type + " - " + assetName + ": $" + amountInvested + " invested, return rate: " + (returnRate * 100) + "%";
	}

}
