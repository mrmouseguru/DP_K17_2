package association;

public class B {
	private String name;
	
	public B() {
		name = "Tèo";
	}
	
	public B(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println("Name: " + name);
	}

}
