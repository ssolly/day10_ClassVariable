package day10_ClassVariable;

import java.util.Scanner;

public class Quiz01 {

	int ran, cnt, input, best=0;
	
	public int random() {
		ran = (int)(Math.random()*100);
		return ran;
	}
	
	public int selectNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number -->  ");
		input = sc.nextInt();
		countCheck();
		return input;
	}
	
	public int countCheck() {
		return cnt++;
	}
	
	public int countPrint() {
		cnt = countCheck();
		return cnt;
	}
	
	public int countReset() {
		cnt =0;
		return cnt;
	}
	
	public int best() {
		if(best==0) {
			return 0;
		} else {	
			if (best>=cnt) {
				best = cnt;
			} else if (best<cnt) {
				best = best;
			}
		}
		return best;
	}

		
		
	public boolean trueNum() {
		if(input == ran) {
			return true;
		} else {
			if (input > ran) {
				System.out.println("-- ¡édown¡é --");
			} else if (input < ran) {
				System.out.println("-- ¡èup¡è --");
			}
			return false;
		}
		
	}
}
