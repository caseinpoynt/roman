package com.roman.numeral.strategy;

import com.roman.numeral.Numeral;

public class DStrategy implements RomanStrategyIF {

	public long getComputedValue(long value) throws Exception {
		return Numeral.D.computedValue(value);
	}

	public String getNumeralValue(long value) throws Exception {
		return Numeral.D.value(value);
	}

}
