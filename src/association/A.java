package association;

public class A {
	
	private B bRef;//instance field thuộc về object
	private static int count;//static field không thuộc về object
	
	A(){
	}
	

	A(B _bRef){
		//biến instance
		this.bRef        = _bRef;
	}
	
	public void print() {
		System.out.println("mA ...");
		//sử dụng biến tham chiếu của object class B
		//để gửi thông điệp đến hành vi printName()
		//của object class B thực hiện hành vi printName()
		bRef.printName();
		
	}

}
