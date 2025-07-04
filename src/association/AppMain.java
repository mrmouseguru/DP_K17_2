package association;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		//tạo object class B độc lập
		//bước 1
		B bRef;
		bRef = new B("Tý");//bước 2

		//tạo object class A độc lập
		//bước 1
		A aRef;
		//bước 3
		aRef =    new A();//bước 2
		
		aRef.setBRef(bRef);
		
		aRef.print();
		
	}

}
