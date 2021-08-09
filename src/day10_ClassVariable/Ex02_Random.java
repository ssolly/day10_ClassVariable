package day10_ClassVariable;

public class Ex02_Random {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			int ran = (int)(Math.random()*3)+1;
										// +1이 없으면 0-2까지의 값이 랜덤 출력
			System.out.println(ran);
		}
	}
}
