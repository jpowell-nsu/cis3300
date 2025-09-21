package driver;

public class Player {
	
	private int ID;
	
	public Player(int ID) {
		this.ID = ID;
		System.out.printf("Player %d sees count: %d\n",
				this.ID, StaticGame.playercount);
		StaticGame.playercount++;
		System.out.printf("Player %d incremented count: %d\n",
				this.ID, StaticGame.playercount);
	}
	
	public void playerInfo() {
		System.out.println("Player ID: " + this.ID);
	}
	
	public void cheat() {
		//StaticGame.incrementcount();
		StaticGame.playercount--;
	}

}
