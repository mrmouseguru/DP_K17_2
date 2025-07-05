package composiiton;

public class A {
	private B bRef;
	
	public A() {
		//khởi tạo the part B bên
		//trong the whole A
		this.bRef = new B("Tèo");
	}
	
	public void print() {
		bRef.printName();
		
	}
	

}
