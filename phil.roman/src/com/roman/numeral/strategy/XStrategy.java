package com.roman.numeral.strategy;

import com.roman.numeral.Numeral;

public class XStrategy implements RomanStrategyIF {

	public long getComputedValue(long value) throws Exception {
		return Numeral.X.computedValue(value);
	}

	public String getNumeralValue(long value) throws Exception {
		return Numeral.X.value(value);
	}

}
