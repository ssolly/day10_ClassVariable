package day10_ClassVariable;

public class Ex04_MainClass {	//�ν��Ͻ�����

	public static void main(String[] args) {
		
		Ex04_Variable ex = new Ex04_Variable();
		ex.cnt = 12345;		//cnt������ public�̱� ������ ��� ����(private�� ����)
		ex.func01();
		ex.func02();
		
		//Ex04_Variable ex1 = new Ex04_Variable();
		//ex1.func01();
	}
}
