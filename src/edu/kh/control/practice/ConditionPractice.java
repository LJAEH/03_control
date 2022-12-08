package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		/*
		 * 키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
		 * 짝수가 아니면 “홀수입니다.“를 출력하세요.
		 * 양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		 * 
		 * [실행 화면 1]
		 * 숫자를 한 개 입력하세요 : 8
		 * 짝수입니다.
		 * 
		 * [실행 화면 2]
		 * 숫자를 한 개 입력하세요 : 17
		 * 홀수입니다.
		 * 
		 * [실행 화면 3]
		 * 숫자를 한 개 입력하세요 : -3
		 * 양수만 입력해주세요.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if (num > 0 ) {
			if (num %2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	public void practice2() {
		/* 
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		 * 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		 * (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		 * 합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		 * 불합격인 경우에는 “불합격입니다.”를 출력하세요.
		 * [실행화면 1]  [실행화면 2]
		 * 국어점수 : 88 국어점수 : 88
		 * 수학점수 : 50 수학점수 : 50
		 * 영어점수 : 40 영어점수 : 45
		 * 불합격입니다.  국어 : 88
		 *             수학 : 50
		 *             영어 : 45
		 *             합계 : 183
		 *             평균 : 61.0
		 *             축하합니다, 합격입니다!
		 * 
		 * 
		 * 
		 */
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		
		int kor = sc.nextInt();
		

		System.out.print("수학점수 : ");
		
		int math = sc.nextInt();
		

		System.out.print("영어점수 : ");
		
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		
		double avg = sum/3.0;
		
		if ( kor >= 40 && math >= 40 && eng >= 40 && avg >= 60 ) {
			System.out.println("국어 : "+kor);
			System.out.println("수학 : "+math);
			System.out.println("영어 : "+eng);
			System.out.println("합계 : "+sum);
			System.out.println("평균 : "+avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		/*
		 * 메소드 명 : public void practice4(){}
		 * 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		 * 저체중/정상체중/과체중/비만을 출력하세요.
		 * 
		 * BMI = 몸무게 / (키(m) * 키(m))
		 * BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		 * BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		 * BMI가 30이상일 경우 고도 비만
		 * 
		 * [실행 화면]
		 * 키(m)를 입력해 주세요 : 1.65
		 * 몸무게(kg)를 입력해 주세요 : 58.4
		 * BMI 지수 : 21.45087235996327
		 * 정상체중
		 * 
		 * 
		 */
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		
		double m = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		
		double kg = sc.nextDouble();
		
		double BMI = kg/(m*m);
		
		
		System.out.println("BMI 지수 : " + BMI);
		
		if (BMI >= 30) {
			System.out.println("고도비만");
		} else if (BMI < 30 && BMI >= 25) {
			System.out.println("비만");
		} else if (BMI < 25 && BMI >= 23) {
			System.out.println("과체중");
		} else if (BMI < 23 && BMI >= 18.5) {
			System.out.println("정상체중");
		} else { System.out.println("저체중");
		} 
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		
		int mid = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		
		int last = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		
		int homework = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		
		int check = sc.nextInt();
	
		String result;
		
		if ( check <= 20*0.7) {
			result = "[ 출석 횟수 부족 " + check + "/20 ]";
			
		} else if ( (mid*0.2 + last*0.3 + homework*0.3 + check*0.2) >= 70 ) {
			result = "FASSS";
		} else {
			result = "FAIL [점수 미달]";
		}
		
		System.out.println(result);
	}
	
}
