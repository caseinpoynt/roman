package com.roman.numeral.strategy;

import com.roman.numeral.Numeral;

public class IStrategy implements RomanStrategyIF {

	public long getComputedValue(long value) throws Exception {
		return Numeral.I.computedValue(value);
	}

	public String getNumeralValue(long value) throws Exception {
		return Numeral.I.value(value);
	}

}
