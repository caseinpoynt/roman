package com.roman.numeral.strategy;

import com.roman.numeral.Numeral;

public class VStrategy implements RomanStrategyIF {

	public long getComputedValue(long value) throws Exception {
		return Numeral.V.computedValue(value);
	}

	public String getNumeralValue(long value) throws Exception {
		return Numeral.V.value(value);
	}

}
