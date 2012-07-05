package com.roman.numeral.strategy;

import com.roman.numeral.Numeral;

public class XCStrategy implements RomanStrategyIF {

	public long getComputedValue(long value) throws Exception {
		return Numeral.XC.computedValue(value);
	}

	public String getNumeralValue(long value) throws Exception {
		return Numeral.XC.value(value);
	}

}
