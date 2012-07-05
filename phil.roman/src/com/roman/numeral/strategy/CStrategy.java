package com.roman.numeral.strategy;

import com.roman.numeral.Numeral;

public class CStrategy implements RomanStrategyIF {

	public long getComputedValue(long value) throws Exception {
		return Numeral.C.computedValue(value);
	}

	public String getNumeralValue(long value) throws Exception {
		return Numeral.C.value(value);
	}

}
