package com.roman.numeral.strategy;

import com.roman.numeral.Numeral;

public class IXStrategy implements RomanStrategyIF {

	public long getComputedValue(long value) throws Exception {
		return Numeral.IX.computedValue(value);
	}

	public String getNumeralValue(long value) throws Exception {
		return Numeral.IX.value(value);
	}

}
