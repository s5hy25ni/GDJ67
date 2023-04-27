package com.min.edu;

public class SwitchMain {
	// 1) switch~case문 = 선택조건문
	// 2) if문(범위)과 다르게 선택된 한 개의 값만을 실행
	// 비교대상이 정수이다.
	// fall-through : break문이 없으면 하위 case도 다 실행
	public static void main(String[] args) {
		int x = 2;
		switch (x) {
		case 1:
			System.out.println("1");
			break;
		case 2:			
			System.out.println("2");
			break;

		default:
			System.out.println("X");
			break;
		} // 1) switch
		
		// 2)java7 1.7.0.5 버전부터 문자열 영역이 heap에 포함되면서
		// switch case문의 비교값으로 사용이 가능
		String str = "맑음";
		switch (str) {
		case "맑음":
			System.out.println("맑음");
			break;
			
		default:
			System.out.println("날씨가 추움");
			break;
		} // switch char
		
		// java14 부터는 case에 값이 아닌 표현식(값으로 평가되는 코드비교 =)가 사용 가능(1:1은 switch 범위는 if)
		String result;
		switch (x) {
		case 1:
			result="하나";
			break;
		case 2:
			result="둘";
			break;
		case 3:
			result="셋";
			break;

		default:
			result="많이";
			break;
		} // switch 표현식
		
		// 화살표(람다표현식:이름없이 메소드 작성) 레이블을 폴스로우를 허용하지 않으므로 break 키워드가 사용되지 않음
		String result2;
		switch(x) {
		case 1->result2="one"; 	// -> : public String 메소드명X() {return "one";}
		case 2->result2="two";
		case 3->result2="three";
		default->result2="many";
		} // 람다
		
		String result3 = switch(x) {
		case 1->"one"; 	// -> : public Strding 메소드명X() {return "one";}
		case 2->"two";
		case 3->"three";
		default->"many";
		}; // 세미콜론 필수
		
		// 하나 이상의 표현식이 필요한 경우 전체 코드블럭이 포함 될 수 있음(switch + if => yield)
		/*
		 * 이러한 블럭에서 yield문은 switch 표현식이 평가할 값을 지정하는데 사용
		 */
		String result4 = switch(x) {
		case 1->"one";
		case 2,3->"two or three"; // 두 개의 값을 하나의 케이스에서 처리
		default->{
			if(x>4) {
				yield"four";
			}else {
				yield"many";
			}
		}
		};
	}
	
}
