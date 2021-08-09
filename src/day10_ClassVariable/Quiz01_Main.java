package day10_ClassVariable;

import java.util.Scanner;

public class Quiz01_Main {
	
	/*
 	 # Up&Down Game
 	  - ���ο��� �⺻ �������� ȭ���� ����� ����� �޼ҵ�� ����
 	  - ��� : ������ �̴� ���, �ְ��� üũ, ������, �ְ��� Ȯ��
	 */
	public static void main(String[] args) {
		
		Quiz01 quiz = new Quiz01();
		Scanner sc = new Scanner(System.in);
		int choice,count;
		
		while(true) {
			quiz.countReset();
			
			System.out.println("===== UP & DOWN Game =====");
			System.out.println("   1. Game Start");
			System.out.println("   2. Game Best Record");
			System.out.println("   3. Finish Game ");
			System.out.print(" >>> ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1 :
				System.out.println("---- Game Start ----");
				quiz.random();
				System.out.println(quiz.random());
				
				while (true) {
					quiz.selectNum();
					if (quiz.trueNum()==true) {
						System.out.println(quiz.countPrint()+"ȸ ���� ������ ���߼̽��ϴ�!");
						if (quiz.best==0) {
							quiz.best = quiz.cnt;
						} else {
							if(quiz.cnt<quiz.best) {
								System.out.println("�ְ� ����� ����Ͽ����ϴ�");
							}
							quiz.best();
						}
						break;
					}
				}
				break;
				
			case 2 :
				if (quiz.best==0) {
					System.out.println("������ �������� �ʾҽ��ϴ�");
				} else {
					System.out.println("�ְ� ����� " + quiz.best +"ȸ �Դϴ�");
				}
				break;
			case 3 :
				System.out.println("���� ����");
				System.exit(1);
			}
		}
	}
}
