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
	
	public void ex3() {
		// 달 (month)를 입력받아 해당 달에 맞는 계절 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		// 사용자에게 온도를 받음.
		System.out.print("온도 입력 : ");
		int temp = sc.nextInt();
		
		String season;
		
		if (month == 3 || month == 4 || month == 5) {
			season = "봄";
			
		} else if (month >= 6 && month <= 9 ) {
			season = "여름";
			
			if (temp >= 33) {
				// season = 여름폭염경보
				season += "폭염경보";
			} else if (temp >= 30) {
				season += "폭염주의보";
			}
			
		} else if (month == 10 && month == 11) {
			season = "가을";
		} else if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else {
			season = "해당계절없음.";
					
		}
		
		System.out.println(season);
		
	}
	
	public void ex4() {
		// 나이를 입력 받아
		// 13세 이하면 " 어린이 입니다 "
		// 13세 초과 19세 이하면 " 청소년 입니다 "
		// 19세 초과 시 " 성인 입니다 "
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		
		int age = sc.nextInt();
		
		if ( age <= 13 && age >= 0 ) {
			System.out.println(" 어린이 입니다 ");
		} else if ( age > 13 && age <= 19 ) {
			System.out.println(" 청소년 입니다 ");
		} else if ( age > 19 ) {
			System.out.println(" 성인 입니다 ");
		} else {
			System.out.println(" 나이를 정확히 입력해주세요 ");
		}
	
	}
	
	
	public void ex5() {
		// 점수(100점만점)을 입력 받아
		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 60점 이상 70점 미만 : D
		// 60점 미만 : F
		// 0미만 , 100 초과 : " 잘못된 입력 "
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 점수 : ");
		
		int score = sc.nextInt();
		
		if ( score >= 90 && score <= 100 ) {
			System.out.println("A");
		} else if ( score >= 80 && score < 90 ) {
			System.out.println("B");
		} else if ( score >= 70 && score < 80 ) {
			System.out.println("C");
		} else if ( score >= 60 && score < 70 ) {
			System.out.println("D");
		} else if ( score < 60 && score >= 0 ) {
			System.out.println("F");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
	}
	
	
	public void ex6() {
		
		// 놀이기구 탑승 제한 검사 프로그램
		// 조건 - 나이 :12세 이상
		// 	   -  키 : 140.0cm 이상
		
		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		// 키를 0~200.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		// -> 입력이 되자 마자 검사를 실행하여 잘못된 경우 프로그램 종료
		
		// 나이 o 키 o : 적합
		// 나이 o 키 x : 키부적합
		// 나이 x 키 o : 나이부적합
		// 나이 x 키 x : 고홈


		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 나이 : ");
		
		int age = sc.nextInt();

		if (age >= 0 && age <= 100 ) {
		
			System.out.print(" 키 : ");
			
			int cm = sc.nextInt();
			
			if (cm >= 0 && cm <= 200 ) {
				
				if (cm >= 140 ) { 
					
					if (age >= 12) {
						System.out.println("적합");
					} else {
						System.out.println("나이부적합");
					}
				} else if (age >= 12) {
					System.out.println("키부적합");
				} else {
					System.out.println("부적합");
				}
				
				
//				System.out.println("키를 잘못 입력 하셨습니다.");
			} else { System.out.println("키를 잘못 입력 하셨습니다.");
			
			}
			
//			System.out.println("나이를 잘못 입력 하셨습니다.");
		} else { System.out.println("나이를 잘못 입력 하셨습니다.");
		
		}
	
	}
	
}
