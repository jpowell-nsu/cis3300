package driver;

public class StaticGame {

	// can it be private, proctected or default?
	
	public static int playercount = 0;
	//public int playercount = 0;
	public String name = "Super Mario Brothers";
	
	public static void staticreport() {
		//System.out.println("Game name: " + name);
		System.out.println("static report playercount: " + StaticGame.playercount);
		//report();
	}
	
	// we can have a constructor--we can have specific instances
	public StaticGame(String name) {
		this.name = name;
	}
	
	public void report() {
		//System.out.println("report playercount: " + playercount);
		System.out.println("report playercount: " + StaticGame.playercount);
		staticreport();
		StaticGame.staticreport();
	}
	
	public static int incrementcount() {
		// notice that we cannot refer to it as "this"
		playercount++;
		//return this.playercount;
		return playercount;
	}
	
}
