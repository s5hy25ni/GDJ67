package com.edu.util;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 숫자 야구 게임에서 사용할 유틸 클래스
 * 한글과 숫자를 받는 메소드 2개
 * @since 2023.05.18
 *
 */
public class DefineUtil {
	
	/**
	 * <b>java.util.scanner</b><br>
	 * 객체를 사용하여 키보드로 입력받은 값을 int로 반환하는 메소드<br> 
	 * 예외처리를 통한 정확한 값을 입력 받을 수 있다.
	 * @return int 범위의 값
	 */
	@SuppressWarnings("resource")
	public static int getNum() {
		int n = 0;
		while (true) {
			try {
				System.out.println("정수만 입력해 주세요.");
				Scanner scan = new Scanner(System.in);
				n = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				//			e.printStackTrace();
				System.out.println("잘못된 타입의 값 입니다. \n 재입력 해주세요. \n" + e.getMessage());
			} 
		}
		return n;
	}
	
	/**
	 * <b>java.util.scanner</b><br>
	 * 객체를 사용하여 키보드로 입력받은 값을 String로 반환하는 메소드<br> 
	 * 한 줄의 값을 입력받아, 앞 뒤의 공백(Blank)를 제거하여 문자열 값만 반환<br>
	 * It is a Unicode space character (
	 * <a href=https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html#SPACE_SEPARATOR>SPACE_SEPARATOR</a>, 
	 * <a href=https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html#LINE_SEPARATOR>LINE_SEPARATOR</a>, 
	 * or <a href=https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Character.html#PARAGRAPH_SEPARATOR>PARAGRAPH_SEPARATOR</a>) 
	 * but is not also a non-breaking space ('\u00A0', '\u2007', '\u202F').
	 * @return 문자열 값
	 */
	@SuppressWarnings("resource")
	public static String getString() {
		String str = "";
		
		System.out.println("필요 값을 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine(); // 한 줄을 받음, 가 나 다
		
		// filter를 통해 작업
		// 정규화를 통해 작업
		// -> 숫자만 있는지 체크
		
		// -> 공백 체크
		return str.strip();
	}

}
