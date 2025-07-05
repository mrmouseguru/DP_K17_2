package dependency;

public class App {

	public static void main(String[] args) {
		
		B bRef = new B("Tèo");
		
		new A(bRef);
	}

}
