package driver;

import login.PersistentLogin;

public class Driver {

	public static void main(String[] args) {
       PersistentLogin login = new PersistentLogin();
       login.loadUsers();
       login.showLoginScreen();
	}

}
