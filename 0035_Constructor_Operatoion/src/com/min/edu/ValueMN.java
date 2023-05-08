package com.min.edu;

public class ValueMN {
	private double m;
	private double n;
	
	public ValueMN(double m, double n) {
		super();
		this.m = m;
		this.n = n;
	}

	// setter를 사용하여 유효값을 설정할 수 있음(제어 가능)
	public double getM() {
		return m;
	}

	public void setM(double m) {
		this.m = m;
	}

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "ValueMN [m=" + m + ", n=" + n + "]";
	}
	
	
}
