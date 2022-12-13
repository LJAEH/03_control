package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {

	// [   ] <- 대괄호 안의 것들은 해도되고 안해도되는것 == 자바에서 문제로 삼지않는 부분
	// While 문은 무한루프가 일어나는 경우가 많음 그래서 꼭 탈출조건(증감식or분기문)을 두어야함
	
	// 아래 while 문 예시 매우 중요 (시험)
	
	/*
	 * 
	 * int i = 1;
	 * while(i <= 10) {
	 * 			System.out.println(i + " 출력");
	 * 			i++;
	 * }
	 * 
	 */
	
	/*
	 * while 문
	 * -별도의 초기, 증감식이 존재하지 않고
	 * 	반복 종료 조건을 자유롭게 설정하는 반복문
	 * 
	 * **확실히 언제 반복이 끝날지는 모르지만
	 *   언젠가 반복 조건이 false가 되는 경우 반복을 종료함.
	 * 
	 * [작성법]
	 * while( 조건식 ){
	 * 		조건식이 true 일 동안 반복 수행될 구문
	 * }
	 * 
	 */
	
	
	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		while(input != 9) {
			System.out.println("=======키오스크=======");
			System.out.println("=======메뉴선택=======");
			System.out.println("1) 떡볶이");
			System.out.println("2) 김밥");
			System.out.println("3) 쫄면");
			System.out.println("9) 종료");
			
			System.out.print("메뉴선택 >> ");
			
			input = sc.nextInt();
			
			switch(input) {
			
			case 1 : System.out.println("떡볶이먹어"); break;
			case 2 : System.out.println("김밥먹어"); break;
			case 3 : System.out.println("쫄면먹어"); break;
			case 9 : System.out.println("종료함다"); break;
			default : System.out.println("잘못눌럿다");
			}
		}
	}
	
	public void ex2() {
		// 입력되는 모든 정수의 합 구하기
		// 단, 0이 입력되면 반복 종료 후 결과 출력
		//       -> 0이 입력되지않으면 계속 반복
		//
		
		
		Scanner sc = new Scanner(System.in);
		
		int input = -1; // 초기값 설정
		int sum = 0;
		
		while(input != 0) {
			System.out.print("정수입력 : ");
			input = sc.nextInt();
			
			sum += input;
		}
		
		System.out.println("합계 : " + sum);
	}
	
	
	public void ex3() {
		
		// 1부터 입력한 값의 합
		// 단, 0을 초과한 숫자 입력
		// => 0이하의 숫자를 입력할 시 "1이상의 숫자를 입력해주세요" 문구 출력
		// EX) 입력값 : 5
		// => 1 + 2 + 3 + 4 + 5 = 출력해야하는 값 
		// EX) 입력값 : 10
		// => 1 + 2 + 3 + 4 ..... + 10 = 출력해야하는 값
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		
		int i = sc.nextInt();
		int sum = 0;
		
		
		if ( i > 0 ) {
			
			int one = 1;
			
			while ( one <= i ) {
				sum += one;
				one++;
			
		//	while (i > 0) {
		//		sum += i;
		//		i--;
			
			}
			System.out.println("1부터" + i + "까지의 합은" + sum + "입니다.");
			
		} else {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
		
	}
	
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		
		// do~while문
		// -> 최소 한번은 수행하는 반복문
		
		do {
			System.out.print("정수 : ");
			input = sc.nextInt();
			
			sum += input;
		} while (input !=0 );
		
		System.out.println("합계 : " + sum);
	}
}
