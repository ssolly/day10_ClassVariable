package day10_ClassVariable;

public class Ex05_MainClass {
	
	public static void main(String[] args) {

		Ex05_Variable.num = 999;	//static�� ����� ���� : ��ü ���� ������ Ŭ������ ���� ����
		System.out.println("num : " + Ex05_Variable.num);
		Ex05_Variable.func();
		
		//Ex05_Variable.cnt=888; ���� : ��ü ���� ���� ���� ����
		Ex05_Variable ex = new Ex05_Variable();
		ex.cnt=888;
		System.out.println("cnt : " + ex.cnt);
	}
}
