package com.min.edu;

public class YaksuMain {

	public static void main(String[] args) {
	
		Yaksu ys = new Yaksu();
		boolean isc = ys.isCheck(10, 2);
//		System.out.println(isc?"약수":"약수아님"); // return에 쓰는 것과 같이 값을 던지면 println()이 받음 -> 반환타입 없어도 됨
		
//		Yaksu_SH sh = new Yaksu_SH();
//		sh.accYaksu(10);
		
//		ys.yasu_Sum(122);
		
//		PerfectNum_SH sh = new PerfectNum_SH();
//		sh.printPerfectNum(8128);
		
		PerfectNum pn = new PerfectNum();
//		isc = pn.isCheck(6, 3);
//		System.out.println(isc);
//		int sum = pn.yaksuSum(6);
//		System.out.println(sum);
//		long start = System.currentTimeMillis();
//		pn.perfectNum(50000);
//		long end = System.currentTimeMillis();
//		System.out.println("최종적으로 걸린 시간 : "+(end-start));
//		// for문 사용시 메모리 사용에 한계가 있기 때문에 메소드들을 분리해 작성 -> 범위를 다르게 해서 돌려야 한다.
		
		FriendlyNum_SH fnsh = new FriendlyNum_SH();
//		int sum = fnsh.yaksuSum(220);
//		System.out.println(sum);
		long start = System.currentTimeMillis();
		fnsh.findFriNum(50000);
		long end = System.currentTimeMillis();
		System.out.println("최종적으로 걸린 시간 : "+(end-start));
	}

}
