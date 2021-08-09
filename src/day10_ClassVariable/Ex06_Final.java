package day10_ClassVariable;

import java.util.Scanner;

public class Ex06_Final {

	public final String KOREA="대한민국";
	public void func() {
		System.out.println("변경 전 KOREA : " + KOREA);
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		//KOREA = sc.next(); final 지정 시 KOREA 변수 명 변경 불가능
		System.out.println("변경 후 KOREA : " + KOREA);
	}
}
