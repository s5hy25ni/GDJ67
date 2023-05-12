package com.min.edu;

public class GarbageCollection_Main {

	public static void main(String[] args) throws InterruptedException {

		System.out.println(new ObjectVO().hashCode());
		System.out.println(new ObjectVO().hashCode());
		ObjectVO vo = new ObjectVO();
		System.out.println(vo.hashCode());
		
//		vo = null;
		new String("가");
		
		System.out.println("objectVO의 개수1 : "+ObjectVO.newObjectCont);
		System.gc();
		Thread.sleep(1000);
		System.out.println("objectVO의 개수2 : "+ObjectVO.newObjectCont);
		System.gc();
		System.out.println("메인 실행 완료"+vo.hashCode());
	}

}
