package day10_ClassVariable;

import java.util.Scanner;

public class Quiz01_Main {
	
	/*
 	 # Up&Down Game
 	  - 메인에서 기본 보여지는 화면을 만들고 기능은 메소드로 구현
 	  - 기능 : 랜덤값 뽑는 기능, 최고기록 체크, 정답기능, 최고기록 확인
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
						System.out.println(quiz.countPrint()+"회 만에 정답을 맞추셨습니다!");
						if (quiz.best==0) {
							quiz.best = quiz.cnt;
						} else {
							if(quiz.cnt<quiz.best) {
								System.out.println("최고 기록을 경신하였습니다");
							}
							quiz.best();
						}
						break;
					}
				}
				break;
				
			case 2 :
				if (quiz.best==0) {
					System.out.println("게임을 시작하지 않았습니다");
				} else {
					System.out.println("최고 기록은 " + quiz.best +"회 입니다");
				}
				break;
			case 3 :
				System.out.println("게임 종료");
				System.exit(1);
			}
		}
	}
}
