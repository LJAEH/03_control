package edu.kh.control.condition;


import java.util.Scanner;

public class SwitchExample {

	/*
	 * switch문
	 * - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문.
	 * -> 식의 결과롤 얻은 값과 같은 case 구문이 실행된다.
	 * 
	 * [작성법]
	 * 
	 * switch(식) {
	 * 
	 * 		case 결과값1 : 수행코드1; break;
	 * 		case 결과값2 : 수행코드2; break;
	 * 		case 결과값3 : 수행코드3; break;
	 * ...
	 * 		default : case 를 모두 만족하지 않을 경우 수행하는 코드(==else)
	 * 
	 * }
	 * 
	 */
	
	public void example1() {
		
		//키보드로 정수를 입력 받아
		// 1이면 빨강색
		// 2이면 주황색
		// 3이면 노란색
		// 4이면 초록색
		// 1~4 아니면 흰색 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		String result;
		
		/*if (input == 1 ) {
			result = "빨강";
		} else if (input == 2 ) {
			result = "주황";
		} else if (input == 3 ) {
			result = "노랑";
		} else if (input == 4 ) {
			result = "초록";
		} else {
			result = "흰색";
		} */
		
		switch(input) {
		
		case 1 : result = "빨강"; break;
		case 2 : result = "주황"; break;
		case 3 : result = "노랑"; break;
		case 4 : result = "초록"; break;
		default : result = "흰색"; break;
		}
		
		System.out.println(result);
	}
	
	public void example2() {
		
		// 연산자 (+ - * / %)
		// 정수 1 : 5
		// 정수 2 : 10
		// 연산자 : *
		// 계산 결과는 5*10=50
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int input2 = sc.nextInt();
		
		System.out.print("연산자 : ");
		String input3 = sc.next();
		
		
		String result;
		
		switch(input3) {
		
		case "+" : System.out.printf("%d + %d = $d/n",input1 , input2 ,input1 + input2); break;
		case "/" : 
			if(input2 == 0) {
				System.out.println("0으로 못나눔");
			} else {
				System.out.println("%d / %d = $d/n",input1 , input2 ,input1 / input2); break;
			}
		case input3 :
	}
}


