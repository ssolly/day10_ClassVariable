package day10_ClassVariable;

public class Ex03_MainClass {

	/*
	 # 클래스 변수
	  - 프로그램 동작 시 생성(메모리에 올라갈 때)
	  - 모든 곳에서 사용 가능(private 제외)
	 # 인스턴스(객체) 변수
	  - 인스턴스가 생성될 때 (new를 만날 때)
	 # 지역 변수
	  - 특정 범위에서 생성될 떄
	  - 해당 범위에서만 사용 가능 또는 해당 범위에 종속되어 있는 곳까지 사용 가능
	 */
	
	public static void main(String[] args) {
		
		int cnt=0;
		if(cnt ==0) {
			int test = 1000;
			System.out.println("cnt : " + cnt);
			System.out.println("test : " + test);
		}
		//System.out.println("test : " + test); : test가 if문 안의 지역변수
		
		Ex03_Variable ex = new Ex03_Variable();
		//ex.variable01();
		int a = ex.variable01();
		ex.variable02(a);
		
	}
}
