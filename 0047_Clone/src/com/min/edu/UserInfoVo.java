package com.min.edu;

// 부모(java.lang.Object)가 자식을 복제
// 부모의 메서드인 clone을 사용하여 복제
// 부모 클래스는 자식에게 구현(기능) 강요 가능, 특징은 강요 X
// 값은 같은데 reference와 hashcode가 다른 객체를 부모를 통해 만듦
public class UserInfoVo implements Cloneable {
	private String name;
	private String addr;
	private int age;
	
	public UserInfoVo(String name, String addr, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfoVo [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
	// 사용시 예외가 발생할 수 있음
	// CloneNotSupportedException : 복제를 지원하지 않는다.
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	
	public Object createClone() {
		Object obj = null;
		
		try {
			obj = this.clone();
		} catch (CloneNotSupportedException e) { // this가 복제 가능한 클래스냐?
			e.printStackTrace();
		}
		
		return obj;
		
	}
	
	
}
