package day10_ClassVariable;

public class Ex03_MainClass {

	/*
	 # Ŭ���� ����
	  - ���α׷� ���� �� ����(�޸𸮿� �ö� ��)
	  - ��� ������ ��� ����(private ����)
	 # �ν��Ͻ�(��ü) ����
	  - �ν��Ͻ��� ������ �� (new�� ���� ��)
	 # ���� ����
	  - Ư�� �������� ������ ��
	  - �ش� ���������� ��� ���� �Ǵ� �ش� ������ ���ӵǾ� �ִ� ������ ��� ����
	 */
	
	public static void main(String[] args) {
		
		int cnt=0;
		if(cnt ==0) {
			int test = 1000;
			System.out.println("cnt : " + cnt);
			System.out.println("test : " + test);
		}
		//System.out.println("test : " + test); : test�� if�� ���� ��������
		
		Ex03_Variable ex = new Ex03_Variable();
		//ex.variable01();
		int a = ex.variable01();
		ex.variable02(a);
		
	}
}
