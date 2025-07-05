package dependency;

public class A {
	//instance variable
	
	public A(B bRef) {
		bRef.printName();
	}
	
	public void print(B bRef) {
		
		bRef.printName();
		
	}
	
	public void print() {
		B bRef = new B("Tý");
		bRef.printName();
	}
	

}
