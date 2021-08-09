package day10_ClassVariable;

public class Ex05_MainClass {
	
	public static void main(String[] args) {

		Ex05_Variable.num = 999;	//static을 사용한 변수 : 객체 생성 전에도 클래스로 접근 가능
		System.out.println("num : " + Ex05_Variable.num);
		Ex05_Variable.func();
		
		//Ex05_Variable.cnt=888; 에러 : 객체 생성 되지 않은 상태
		Ex05_Variable ex = new Ex05_Variable();
		ex.cnt=888;
		System.out.println("cnt : " + ex.cnt);
	}
}
