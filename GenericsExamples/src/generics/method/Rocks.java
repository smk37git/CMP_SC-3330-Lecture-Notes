package generics.method;

public class Rocks {

	private String type;
	
	public Rocks() {
		
	}
	
	public <T> void printSomething(T rockType) {
		System.out.println(rockType);
	}
	
}
