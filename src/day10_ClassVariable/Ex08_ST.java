package day10_ClassVariable;

import java.util.Scanner;

public class Ex08_ST {
// �ν��Ͻ� ������ ����
// �Է�, ��� ������� ������
	public String name;
	public int age;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
	}
	
	public void display() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}
