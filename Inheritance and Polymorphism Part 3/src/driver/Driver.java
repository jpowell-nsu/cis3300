package driver;

public class Driver {

	public static void main(String[] args) {
		Player player1 = new Player(42);
		player1.playerInfo();
		
		StaticGame.staticreport();
		
		Player player2 = new Player(37);
		StaticGame.staticreport();
		//player2.cheat();
		
		Player player3 = new Player(73);
		StaticGame.staticreport();
		
		
		StaticGame game = new StaticGame("Super Mario Brothers 2");
		System.out.println(game.playercount);
		game.staticreport();
		
	}
	

}
