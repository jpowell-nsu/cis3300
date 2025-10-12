package animals;

public class Fox extends Animal {
	
	public Fox() {
		super("fox");
	}

	@Override
	public void says() {
		System.out.print("\"Ring-ding-ding-ding-dingeringeding!\r\n" + 
				"Gering-ding-ding-ding-dingeringeding!\r\n" + 
				"Gering-ding-ding-ding-dingeringeding!\"");
	}
	
	public void says(int a) {
		System.out.print("\"Wa-pa-pa-pa-pa-pa-pow!\r\n" + 
				"Wa-pa-pa-pa-pa-pa-pow!\r\n" + 
				"Wa-pa-pa-pa-pa-pa-pow!\"");		
	}
	
	public void says(char a) {
		System.out.print("\"Hatee-hatee-hatee-ho!\r\n" + 
				"Hatee-hatee-hatee-ho!\r\n" + 
				"Hatee-hatee-hatee-ho!\"");	
	}
	
	public void says(boolean a) {
		System.out.print("\"Joff-tchoff-tchoffo-tchoffo-tchoff!\r\n" + 
				"Tchoff-tchoff-tchoffo-tchoffo-tchoff!\r\n" + 
				"Joff-tchoff-tchoffo-tchoffo-tchoff!\"");			
	}
	
	public void says(String a) {
		System.out.print(a);
	}
	
}
