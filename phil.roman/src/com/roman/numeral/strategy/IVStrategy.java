package com.roman.numeral.strategy;

import com.roman.numeral.Numeral;

public class IVStrategy implements RomanStrategyIF {

	public long getComputedValue(long value) throws Exception {
		return Numeral.IV.computedValue(value);
	}

	public String getNumeralValue(long value) throws Exception {
		return Numeral.IV.value(value);
	}

}
