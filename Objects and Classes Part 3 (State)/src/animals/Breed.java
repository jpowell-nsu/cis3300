package animals;

public class Breed {
	
	private final String name;
	private final String origin;

	public Breed(String name, String origin) {
		this.name = name;
		this.origin = origin;
	}

	public String getName() {
		return name;
	}

	public String getOrigin() {
		return origin;
	}

	/*
	public void setName(String name) {
		this.name = name;
	}
	*/	
}
