package com.roman.numeral.strategy;

import com.roman.numeral.Numeral;

public class LStrategy implements RomanStrategyIF {

	public long getComputedValue(long value) throws Exception {
		return Numeral.L.computedValue(value);
	}

	public String getNumeralValue(long value) throws Exception {
		return Numeral.L.value(value);
	}

}
