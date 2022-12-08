package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {

	public void ex1() {
		// if문
		// = 조건식이 true 일 때만 내부 코드 수행
		/*
		 * [작성법]
		 * if(조건식){
		 * 		조건식이 true 일 때 수행될 코드
		 * }
		 * 
		 * if - else문
		 * -조건식 결과가 true면 if문,
		 * false면 else 구문이 수행됨
		 * 
		 * [작성법]
		 * 
		 * if(조건식){
		 * 		조건식이 true 일 때 수행될 코드
		 * } else {
		 * 		조건식이 false 일 때 수행될 코드
		 * }
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		if (input > 0 ) {
			System.out.println("양수임다");
		} else {
			System.out.println("양수아임다");
		}
		
	}
	
	public void ex2() {
		//홀짝 검사
		//입력받은 값이 홀인지 짝인지 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		if ( num%2 == 0 ) {
			System.out.println("짝임다");
		} else {
			System.out.println("홀임다");
		}
	}
	
}
