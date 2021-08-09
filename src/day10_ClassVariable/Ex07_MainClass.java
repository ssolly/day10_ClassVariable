package day10_ClassVariable;

public class Ex07_MainClass {

	public static void main(String[] args) {
		
		User1 u1 = new User1();
		User2 u2 = new User2();
		u1.func();
		u2.func();
		
	}
}

class User1 {
	public void func() {
		System.out.println("KOREA : " + Ex07_Final.KOREA);
	}
}


class User2 {
	public void func() {
		System.out.println("KOREA : " + Ex07_Final.KOREA);
	}
}