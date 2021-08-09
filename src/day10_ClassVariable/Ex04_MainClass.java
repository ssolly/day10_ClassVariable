package day10_ClassVariable;

public class Ex04_MainClass {	//인스턴스변수

	public static void main(String[] args) {
		
		Ex04_Variable ex = new Ex04_Variable();
		ex.cnt = 12345;		//cnt변수가 public이기 때문에 사용 가능(private시 에러)
		ex.func01();
		ex.func02();
		
		//Ex04_Variable ex1 = new Ex04_Variable();
		//ex1.func01();
	}
}
