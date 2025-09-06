package animals;

public class Dog {
	
    private String name;
	private int age;
	private String color;
	private final int test;

	/*
	public Dog() {
		
	}
	*/

	public Dog() {
		
		//System.out.println("test");
		this("none", 0, "unknown");
		//test = 42;
		//this("none", 0);
		//this.name = "none";
		//this.age = 0;
		//this.color = "unknown";
		//System.out.println("test");
	}

    public Dog(String name, int age) {
    	this(name, age, "unknown");
    	//this.test = 42;
    	//this.name = name;
    	//this.age = age;
    	//this.color = "unknown";
    }

    public Dog(String name, int age, String color) {
    	this.test = 42;
    	//this.name = name;
    	this.setName(name);
    	//this.age = age;
    	this.setAge(age);
    	//this.color = color;
    	this.setColor(color);
    }   

	
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
		this.age = age;
	}    
        
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
    public void talk() {
    	System.out.println(name + " says bark.");
    }
    
    public void age() {
    	System.out.println(name + " is " + age + " years old and " + color + ".");
    }

}
