package com.roman.numeral.strategy;

import com.roman.numeral.Numeral;

public class MStrategy implements RomanStrategyIF {

	public long getComputedValue(long value) throws Exception {
		return Numeral.M.computedValue(value);
	}

	public String getNumeralValue(long value) throws Exception {
		return Numeral.M.value(value);
	}

}
