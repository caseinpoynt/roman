package com.roman.numeral.strategy;

import com.roman.numeral.Numeral;

public class CMStrategy implements RomanStrategyIF {

	public long getComputedValue(long value) throws Exception {
		return Numeral.CM.computedValue(value);
	}

	public String getNumeralValue(long value) throws Exception {
		return Numeral.CM.value(value);
	}

}
