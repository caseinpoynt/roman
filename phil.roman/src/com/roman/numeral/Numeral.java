package com.roman.numeral;

public enum Numeral {
	M(1000), CM(900), D(500), CD(400), C(100), XC(90), L(50), XL(40), X(10), IX(9), V(5), IV(4), I(1);
	private long decimalValue;

	private Numeral(long decimalValue) {
		this.decimalValue = decimalValue;
	}

	public boolean greaterThan(long value) {
		return this.decimalValue > value;
	}

	public String value(long value) {
		long mFactor = this.factor(value);
		return this.repeat(mFactor);
	}

	private long factor(long value) {
		return value / this.decimalValue;
	}

	private String repeat(long factor) {
		return new String(new char[(int) factor]).replace("\0", this.name());
	}

	public long computedValue(long value) {
		return this.factor(value)*this.decimalValue;
	}
}
