package day10_ClassVariable;

import java.util.Scanner;

public class Ex06_Final {

	public final String KOREA="���ѹα�";
	public void func() {
		System.out.println("���� �� KOREA : " + KOREA);
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		//KOREA = sc.next(); final ���� �� KOREA ���� �� ���� �Ұ���
		System.out.println("���� �� KOREA : " + KOREA);
	}
}
