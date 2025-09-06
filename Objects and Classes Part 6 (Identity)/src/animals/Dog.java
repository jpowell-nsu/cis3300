package animals;

public class Dog {
	
    public String name;
    public int age;
        
    public Dog(String name, int age) {
    	this.name = name;
    	this.age = age;
    }
    
    public void print() {
    	System.out.println(name + " says bark.");
    	System.out.println(name + "is age " + age);
    }

}
