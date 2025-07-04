package association;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bắt đầu chạy chương trình");
		System.out.println("Đang chạy ...");
		/*
		 * cú pháp khởi tạo đối tượng vùng nhớ Heap
		 * new <khoảng trắng> <tên hàm khởi tạo đối tượng, constructor>
		 * 
		 */
		//Bước 1: khai báo biến tham chiếu đối tượng kiểu A
		
		A a = new A();
		
		A thamchieuA;
		     //Bước 3      //Bước 2
		thamchieuA =       new A();//một đối tượng của lớp / khuôn A được tạo ra trong Heap
		//gửi thông điệp đến hành vi
		// mA() tại đối tượng của class A
		thamchieuA.mA(); 
		System.out.println("Thoát khỏi chương trình ...");

	}

}
