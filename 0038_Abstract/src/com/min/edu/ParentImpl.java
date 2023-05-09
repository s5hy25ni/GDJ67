package com.min.edu;

public abstract class ParentImpl implements IParent {

	@Override
	public abstract void make();

	@Override
	public void print() {
		System.out.println("Abstract Class에서 구현했슴다~!");
	}

}
