package day10_ClassVariable;

public class Ex02_Random {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			int ran = (int)(Math.random()*3)+1;
										// +1�� ������ 0-2������ ���� ���� ���
			System.out.println(ran);
		}
	}
}
