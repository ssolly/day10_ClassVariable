package day10_ClassVariable;

public class Ex01_Overloading {

	/*
	 # �����ε�(Overloading)
	  - �޼ҵ� �̸��� �����ϰ� ����� ��
	  - �̸��� ���� ������ ���� �ٸ� �޼ҵ�� �ν��ϱ� ���ؼ��� �Ű�����(�ƱԸ�Ʈ)�� ������ Ÿ��(�ڷ���)�� �޶�� �Ѵ�
	 */
	
	public static void main(String[] args) {
		
		Ex01_Class ex = new Ex01_Class();
		System.out.println(ex.sumFunc(10, 20));
		System.out.println(ex.multiSumFunc(10, 30, 20));
		System.out.println(ex.sumFunc(10, 2.2222));
		System.out.println(ex.sumFunc("test", "+hello"));
		
		
		
	}
}
