package com.roman.numeral.strategy;

import com.roman.numeral.Numeral;

public class XLStrategy implements RomanStrategyIF {

	public long getComputedValue(long value) throws Exception {
		return Numeral.XL.computedValue(value);
	}

	public String getNumeralValue(long value) throws Exception {
		return Numeral.XL.value(value);
	}

}
