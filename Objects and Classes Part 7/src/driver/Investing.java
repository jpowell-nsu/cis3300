package driver;

import investing.Investment;
import investing.InvestmentPortfolio;
import investing.Investor;

public class Investing {

    public static void main(String[] args) {

    	double highrisk = 0.15;
        Investor[] investors = new Investor[2];
        Investment[] jordanInvestments = new Investment[3];
        Investment[] mayaInvestments = new Investment[3];
        InvestmentPortfolio[] portfolios = new InvestmentPortfolio[2];
        
        // create an investor and their investments
        investors[0] = new Investor("Jordan Lee", "jordan@email.com", "555-1234");
        jordanInvestments[0] = new Investment("Apple", "Stock", 5000.0, 0.10);
        jordanInvestments[1] = new Investment("Ethereum", "Crypto", 2000.0, 0.25);
        jordanInvestments[2] = new Investment("Tesla", "Stock", 3000.0, 0.15);
        portfolios[0] = new InvestmentPortfolio(investors[0], jordanInvestments);
        
        // create a second investor
        investors[1] = new Investor("Maya Chen", "maya@email.com", "555-5678");
        mayaInvestments[0] = new Investment("US Treasury", "Bond", 4000.0, 0.03);
        mayaInvestments[1] = new Investment("Vanguard ETF", "Fund", 3500.0, 0.08);
        mayaInvestments[2] = new Investment("Dogecoin", "Crypto", 1000.0, 0.50);
        portfolios[1] = new InvestmentPortfolio(investors[1], mayaInvestments);

        // Loop through each investor portfolio
        for (int i = 0; i < portfolios.length; i++) {
            System.out.println("\n============================");
            
            // print the summary
            portfolios[i].printPortfolioSummary();

            double totalReturn = 0;
            int count = 0;

            // total each investment and identify any high risk investments
            Investment[] portfolio = portfolios[i].getInvestments();
            for (int j = 0; j < portfolio.length; j++) {
            	Investment inv = portfolio[j];
            	// determine the gain from the investment and accumulate it into the total gain
                totalReturn += inv.getCurrentValue() - inv.getAmountInvested(); // gain only
                count++;

                // Flag high-risk investments
                if (inv.getReturnRate() > highrisk) {
                    System.out.println("! High-risk investment detected: " + inv.getAssetName() +
                        " (" + (inv.getReturnRate() * 100) + "% return)");
                }
            }

            // determine average gain per investment
            double averageReturn = totalReturn / count;
            System.out.printf("Average gain per investment: $%.2f\n", averageReturn);
        }

        // Compare total values from the two portfolio
        System.out.println("\n============================");
        double value1 = portfolios[0].getTotalValue();
        double value2 = portfolios[1].getTotalValue();

        if (value1 > value2) {
            System.out.println(investors[0].getName() + " has a higher total portfolio value.");
        } else if (value2 > value1) {
            System.out.println(investors[1].getName() + " has a higher total portfolio value.");
        } else {
            System.out.println("Both investors have the same total portfolio value.");
        }
        
        // Challenge - use a tolerance when checking the doubles values
        // Challenge - write methods to accomplish these tasks instead of doing it all in main
        // Challenge - write the code to find the highest of more than two portfolios
        //				for example, come up with three to five portfolios and find out one is the highest
    
    }

}
