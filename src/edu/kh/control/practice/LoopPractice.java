package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
		
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 :");
		
		int i = sc.nextInt();
		
		if( i > 0 ) {
		
			for(int dd = 1 ; dd <= i ; dd++ ) {
			System.out.print(dd+" ");
			}
		
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 :");
		
		int i = sc.nextInt();
		
		if( i > 0) {
			for(int dd = i; dd > 0; dd-- ) {
				
				System.out.print(dd+" ");
			} 
			
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 :");
		
		int i = sc.nextInt();
		int sum = 0;
		
		
		for (int dd = 1 ; dd <= i; dd++) {
			
			if(dd != i ) {
				System.out.print(dd + " + ");
			} else {
				System.out.print(dd + " ");
			}
			sum += dd;
		}
		System.out.println("= " + sum);
	}
		
	
	public void practice4() {
		
		
		System.out.print("첫 번째 숫자 :");
		int fir = sc.nextInt();
		
		System.out.print("두 번째 숫자 :");
		int sec = sc.nextInt();
		
		if (fir > 0 && sec > 0 ) {
		
		if ( fir <= sec ) {
			for ( int i = fir ; i <= sec; i++) {
				System.out.print(i+" ");
				
			}
			
		
		} else {
			for ( int i = sec ; i <= fir; i++) {
				System.out.print(i+" ");
				
			}
		}
		
		
		} else {
			System.out.println("1이상 치세여");
		}
		
	}
	
	public void practice5() {
		
		System.out.print("몇단을칠까요? :");
		int dan = sc.nextInt();
		
		System.out.println("===== " + dan + "단 =====");
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}
	
	public void practice6() {
		
		System.out.print("몇단부터칠까요? :");
		int dan = sc.nextInt();
		
		if (dan >= 2 && dan <= 9) {
			for (int a = dan; a <= 9; a++) {
				
				System.out.println("===== " + a + "단 =====");
				
				for (int i = 1; i <= 9; i++) {
					System.out.println(a + " * " + i + " = " + a*i);
				}
			}
		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}
		
	}
	
	public void practice7() {
		
		System.out.print("숫자 :");
		int i = sc.nextInt();
		
		for (int a = 1; a <= i ; a++) {
		
		for (int b = 1; b <= a ; b++) {
			System.out.print("*");
		}
		System.out.println();
		
		}
	}
	
	public void practice8() {
		
		System.out.print("숫자 :");
		int i = sc.nextInt();
		
		for (int a = i; a > 0; a--) {
			for ( int b = a; b > 0; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		
		System.out.print("숫자 :");
		int i = sc.nextInt();
		
		for(int line = i; line > 0; line--) {
			for(int blank = line-1; blank > 0; blank-- ) {
				System.out.print(" ");
			}
			for(int star = line; star <= i; star++) {
				System.out.print("*");
			}
			System.out.println();
		} 
	}
	
	public void practice9_2() {
		
		System.out.print("숫자 :");
		int i = sc.nextInt();
		
		for(int line = 1; line <= i; line++) {
			for(int a = 1; a <= line; a++) {
				
				if(a <= i-line) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}
	
	public void practice10() {
		
		System.out.print("숫자 :");
		int i = sc.nextInt();
		
		for (int a = 1; a <= i; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			} 
			System.out.println();
		}
		
		for (int c = i; c >= 1; c-- ) {
			for (int d = c-1; d >= 1; d--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice11() {
		
		System.out.print("피라미드층수 :");
		int i = sc.nextInt();
		
		for (int line = i; line >= 1; line--) {
			for (int blank = 1; blank <= line-1; blank++) {
				System.out.print(" ");
			}
			for (int star = i+(i-line); star >= line ; star--) {
				System.out.print("*");
			}
			
			System.out.println();
		} 
	}
	
	public void practice11_1() {
		
		System.out.print(" : ");
		int input = sc.nextInt();
		
		for (int row = 1; row <= input; row++) {
			for(int col = 1; col <= input; col++) {
				
			}
		}
		
	}
	
	
	public void practice12() {
		
		System.out.print("한변의 길이 :");
		int i = sc.nextInt();
		
		for (int top = 1; top <= i; top++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int a = 1; a <= i-2; a++) {
			System.out.print("*");
			for (int blank = 1; blank <= i-2; blank++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		for (int top = 1; top <= i; top++) {
			System.out.print("*");
		}
		
	}
	
	public void practice12_2(){
		
		System.out.print(" : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++ ) {
			for(int col = 1; col <= input; col++) {
				
				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("+");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public void practice13() {
		
		System.out.println("자연수 입력 :");
		int i = sc.nextInt();
		
		int count = 0;
		
		for (int a = 1; a <= i; a++) {
			if (a%3 != 0 && a%2 != 0) {
				continue;
			}
			System.out.print(a + " ");
		}
		System.out.println();
		
		
		for (int a = 1; a <= i; a++) {
			if (a%3 == 0 && a%2 == 0) {
				count++;
			}
		}
		System.out.println("2,3의 공배수 : " + count);
		
	}
	
	
	
	
	
	
	
	
	
}