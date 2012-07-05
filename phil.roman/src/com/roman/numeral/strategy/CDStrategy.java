package com.roman.numeral.strategy;

import com.roman.numeral.Numeral;

public class CDStrategy implements RomanStrategyIF {

	public long getComputedValue(long value) throws Exception {
		return Numeral.CD.computedValue(value);
	}

	public String getNumeralValue(long value) throws Exception {
		return Numeral.CD.value(value);
	}

}
