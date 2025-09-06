package animals;

public class Dog {
	
    private String name;
    private int age;
    
    public Dog(String name, int age) {
    	this.name = name;
    	this.age = age;
    }
    
    public void talk() {
    	System.out.println(name + " says bark.");
    }
    
    public void talk(String say) {
    	System.out.println(name + " says " + say + ".");
    }
    
    /*
    public void updateAge(int age) {
    	if (age >= 0) {
    		this.age = age;
    	}
    }
     */
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
    	if (age >= 0) {
    		this.age = age;
    	}
	}
	
	public void birthday() {
		incrementAge();
	}
	
	private void incrementAge() {
		this.age++;
	}
	
}
