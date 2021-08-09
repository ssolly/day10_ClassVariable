package day10_ClassVariable;

public class Ex01_Overloading {

	/*
	 # 오버로딩(Overloading)
	  - 메소드 이름을 동일하게 만드는 것
	  - 이름이 같기 때문이 서로 다른 메소드로 인식하기 위해서는 매개변수(아규먼트)의 개수나 타입(자료형)이 달라야 한다
	 */
	
	public static void main(String[] args) {
		
		Ex01_Class ex = new Ex01_Class();
		System.out.println(ex.sumFunc(10, 20));
		System.out.println(ex.multiSumFunc(10, 30, 20));
		System.out.println(ex.sumFunc(10, 2.2222));
		System.out.println(ex.sumFunc("test", "+hello"));
		
		
		
	}
}
