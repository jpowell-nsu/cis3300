package vehicles;

public class InvalidSpeedException extends Exception {
	
	private static final long serialVersionUID = 6572616908570826999L;

	public InvalidSpeedException(String message) {
		super(message);
	}
}