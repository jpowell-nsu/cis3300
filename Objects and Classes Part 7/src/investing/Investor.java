package investing;

public class Investor {

	private String name;
	private String email;
	private String phone;

	public Investor(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// this overrides the inherited toString and allows us to print the object easily
	//	(see printPortfolioSummary in InvestingPortfolio.java)
    public String toString() {
        return name + " (" + email + ", " + phone + ")";
    }

}
