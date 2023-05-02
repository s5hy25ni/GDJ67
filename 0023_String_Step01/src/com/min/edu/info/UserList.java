package com.min.edu.info;

public class UserList {
	
	private User_VO[] lists;

	public UserList() {
		lists = new User_VO[3];
	}
	
	public void addUser(User_VO inVo) {
//		int i = 0;
		for (int i = 0; i < lists.length; i++) {
			if(lists[i] == null) {
				lists[i] = inVo;
				break;
			}
			if(i == 2) {
				System.out.println("더 이상 추가할 수 없습니다.");
			}
		} // for문
//		if(i == 3) {
//			System.out.println("더 이상 입력할 수 없습니다.");
//		}
	} // addUser
	
	/**
	 * 멤버필드에 있는 값들과 입력 값을 비교하는 메소드
	 * @param inVo 입력받은 User_VO 객체
	 * @return true 같은 값이 있다.
	 */
	public boolean listCheck(User_VO inVo) {
		boolean isc = false;
		
		for (int i = 0; i < lists.length; i++) {
			if(lists[i].equals(inVo)) {
				isc = true;
			}
			// 각 값들을 분해해서 내부의 값을 각각 비교
			// 많은 값들이 있을 경우 불가능
//			if(lists[i].getName().equals(inVo.getName()) &&
//				lists[i].getAge() == inVo.getAge() &&
//				lists[i].getAddress().equals(inVo.getAddress())){
//				isc = true;
//			}
//			if(lists[i].equals(inVo)) { // 객체를 비교할 때는 equals 사용
//				isc = true;
//			}
//			if(lists[i]==inVo) { // 객체의 == 비교는 주소를 비교
//				isc = true;
//			}
		}
		
		return isc;
	}

	public User_VO[] getLists() {
		return lists;
	}
}
