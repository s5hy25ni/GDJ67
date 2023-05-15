package com.min.edu;

public class CloneMain {

	// ProtoType Design Pattern
	public static void main(String[] args) {

		UserInfoVo vo1 = new UserInfoVo("푸린", "풍선포켓몬", 30);
		System.out.println(vo1);
		
//		UserInfoVo voDeep = (UserInfoVo) vo1.clone();
//		System.out.println(voDeep);
		
		UserInfoVo voClone = (UserInfoVo)vo1.createClone();
		System.out.println(voClone);
		
		System.out.println("원본 : "+vo1.hashCode());
		System.out.println("복제 : "+voClone.hashCode());
		
	}

}
