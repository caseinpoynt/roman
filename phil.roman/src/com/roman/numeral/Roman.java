package com.roman.numeral;

import com.roman.numeral.strategy.RomanStrategyIF;

public class Roman {
	final long from;
	final StringBuilder to;

	private Roman(String decimal) {
		from = Long.valueOf(decimal);
		to = new StringBuilder();
	}

	public static String valueOf(String decimal) throws Exception {
		Roman numeral = new Roman(decimal);
		return numeral.romanValue();
	}

	private String romanValue() throws Exception {
		long delta = from;
		while (0 < delta) {
			RomanStrategyIF strategy = RomanFactory.create(delta);
			String numeralValue = strategy.getNumeralValue(delta);
			long computedValue = strategy.getComputedValue(delta);
			to.append(numeralValue);
			delta -= computedValue;
		}
		return to.toString();
	}

}
