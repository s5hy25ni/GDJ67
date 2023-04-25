package com.min.edu;
/*
 * TODO 002 조건을 가지고 중간 기점에서 증가/감소하여 반복의 횟수를 제어하자
 * 1) If 문과 3항연산자는 호환되지 않음
 * 2) 반환은 단 1회만 된다.
 * 3) 기능은 반드시 분리하여 메소드를 작성한다.
 */
public class Diamond_if {
	static int j2 = 0; // 중간지점과 현재 위치(index)의 값을 판단하여 증감 혹은 감소하는 class의 전체 변수
	
	public static void dia_if(int stage) {
		
		// 중간지점 
		int mid = stage/2; // stage가 5이면 몫은 2, index로 따지면 중간
		
		for (int i = 0; i < stage; i++) {
			for (int j = 0; j < mid-j2; j++) {
				System.out.print("☆");
			} // 공백
			for (int j = 0; j < j2*2+1; j++) {
				System.out.print("★");
			} // 그림
			
			System.out.println();
			
			// 1) 변화하는 층수(i)와 중간층(mid)를 판단하여 j2의 증감을 작성함
//			if(i<mid) {
//				j2++;
//			} else {
//				j2--;
//			}
			
			// 3) 기능은 분리하여 작성
			check_mid(i, mid);

		} // 층수 for문
	}

	private static int check_mid(int i, int mid) {
		// 2) 삼항연산자
//		(i<mid)?j2++:j2--; // 문법에 맞지 XX
//		j2 = (i<mid)?j2++:j2--; // 반환은 하나밖에 안됨
//		int x = (i<mid)?j2++:j2--;  선처리후증가 : j2가 x(버리는 변수)에 대입하고 ++이 j2에 들어감 
//		j2 = (i<mid)?--j2:++j2; 선증가후처리 : ++이 j2에 들아감(버리는 변수 필요 X)
		return (i<mid)?j2++:j2--; // 사용하지 않는 변수가 하나 만들어지는 것
	}

}
