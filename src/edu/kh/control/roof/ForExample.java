package edu.kh.control.roof;


import java.util.Scanner;

public class ForExample {

	/*
	 * For문 
	 *  - 끝이 정해져 있는(횟수가 정해져있는 반복문)
	 *  - 조건에 따라 한번도 수행되지 않을 수 있음
	 *  
	 *  [작성법]
	 *  
	 *  for(초기식; 조건식; 증감식) {
	 * 		반복 수행될 코드
	 * }
	 * 
	 *  - 초기식 : for문을 제어하는 용도의 변수 선언
	 *  - 조건식 : for문의 반복여부를 결정하는 식. ( 다음 반복 진행? )
	 *  		 보통 초기식에 사용된 변수를 이용하여 조건식을 작성함.
	 *  - 증감식 : 초기식에 사용된 변수를 for문이 끝날때 마다
	 *  		 증가 or 감소 시켜 조건식의 결과를 변하게 하는 식
	 *  
	 */
	
	
	public void ex1() {
		
		for (int i = 1 ; i <= 10 ; i ++) { // i => index
		//    1) 초기식   2) 조건문  4) 증감식
			System.out.println("i : " + i);
			// 3) 반복 수행될 코드
		}
		
	}
	
	public void ex2() {
		// 3에서 7까지 1씩 증가하며 출력
		
		for (int i = 3 ; i < 8 ; ++i) {
			System.out.println("i : " + i);
		}
	}
	
	public void ex3() {
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		
		int i = sc.nextInt();
		
		for (int num = 1 ; num <= i ; ++ num) {
			System.out.println("up" + num);
			
		}
		
	}
	
	public void ex4() {
		
		// 1.0부터 입력받은 실수 까지 0.5씩 증가하며 출력

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		
		double i = sc.nextDouble();
		
		for (double num = 1.0 ; num <= i ;  num = num + 0.5 ) { // <- 이거말고 num += 0.5 쓰면댐
			System.out.println("up" + num);
			
		}
	}
	
	public void ex5() {
		// 영어 알파벳 A 부터 Z 까지 한줄로 출력
		// ** char 자료형은? oo코드
		
		
		for (int i = 'A' ; i <= 'Z' ; i++) {
			//      유니코드 라서 문자로 입력해도댐
			System.out.print((char)i); // 강제형변환
			
		}
		
		
	}

	public void ex6() {
		// 영어 알파벳 A 부터 Z 까지 한줄로 출력
		// ** char 자료형은? oo코드
		
		
		for (char i = 'A' ; i <= 'Z' ; i++) {
				System.out.print(i); 
			
		}
		
		
	}
	
	public void ex7() {
		//응용문제!
		//1부터 10까지 모든 정수의 합 구하기
		
		int sum = 0; // 반복되어 증가되는 i값의 합계를 지정할 변수
					 // 0으로 시작하는 이유 : 아무것도 더하지 않음으로 정확히 결과를 도출 할 수 있기 때문에
		
		
		for (int i = 1 ; i < 11 ; i++) {
			
			sum += i;
		// sum = sum + i 	1 , (1)+2 , (1+2)+3 , (1+2+3)+4 ...
		}
		
		System.out.println(sum);
	}
	
	public void ex8() {
		
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 5의 배수에 ( ) 를 붙여서 출력  ==> 조건
		// ex) 1 2 3 4 (5) 6 7 8 . . .
		
		for ( int i = 1 ; i <= 20 ; i++) {
			if ( i % 5 == 0 ) {
				System.out.print( " (" + i + ") " );
			} else
			System.out.print( " " + i + " " );
		}
		
	}
	
	public void ex9() {
		//구구단 모두 출력하기
		
		for(int i = 2; i <= 9; ++i) {
			for(int dan = 1; dan <= 9; ++dan) {
				System.out.printf("%2d X %2d = %2d", i , dan, i*dan );
			}System.out.println();//줄바꿈
		} 
		
	}
	
	public void ex10() {
		//구구단 역순 출력
		for(int dan = 9; dan >= 2; dan--) {
			for (int su = 1; su <= 9; su++) {
				System.out.printf("%2d X %2d = %2d", dan , su, su*dan );
			}System.out.println();
		}
	}
	
	
	public void ex11() {
		
		for(int dd = 1; dd <= 5; dd++) {
			for(int i = 1; i <= 5; i++) {
				System.out.print(i);
			} System.out.println();
		}
	}
	
	public void ex12() {
		
		for(int dd = 1; dd <= 9; dd++) {
			for(char i = 9; i >= 1; i--) {
				System.out.print(i);
			} System.out.println();
		}
	}
	
	public void ex13() {
		//1
		//12
		//123
		//1234
		//============
		//4321
		//321
		//21
		//1
		
		
		for (int i = 1; i <= 8; i++) {
			for(int dd = 1; dd <= i; dd++ ) {
				System.out.print(dd);
			} System.out.println();
		}
		
		System.out.println("===============");
		

		for (int i = 1; i <= 8; i++) {
			for(int dd = 9-i; dd >= 1; --dd ) {
				System.out.print(dd);
			} System.out.println();
		}
		

		for (int i = 4; i >= 1; i--) {
			for(int dd = i; dd >= 1; --dd ) {
				System.out.print(dd);
			} System.out.println();
		}
		
	}
///////////////////********************* 복습해보기
		
}

