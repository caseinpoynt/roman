package com.roman.numeral.strategy;

public interface RomanStrategyIF {

	long getComputedValue(long value) throws Exception;

	String getNumeralValue(long value) throws Exception;

}
