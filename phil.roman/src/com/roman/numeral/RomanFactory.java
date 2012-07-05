package com.roman.numeral;

import com.roman.numeral.strategy.*;

public class RomanFactory {

	public static RomanStrategyIF create(long value) {
		if (!Numeral.M.greaterThan(value)) {
			return new MStrategy();
		}
		if (!Numeral.CM.greaterThan(value)) {
			return new CMStrategy();
		}
		if (!Numeral.D.greaterThan(value)) {
			return new DStrategy();
		}
		if (!Numeral.CD.greaterThan(value)) {
			return new CDStrategy();
		}
		if (!Numeral.C.greaterThan(value)) {
			return new CStrategy();
		}
		if (!Numeral.XC.greaterThan(value)) {
			return new XCStrategy();
		}
		if (!Numeral.L.greaterThan(value)) {
			return new LStrategy();
		}
		if (!Numeral.XL.greaterThan(value)) {
			return new XLStrategy();
		}
		if (!Numeral.X.greaterThan(value)) {
			return new XStrategy();
		}
		if (!Numeral.IX.greaterThan(value)) {
			return new IXStrategy();
		}
		if (!Numeral.V.greaterThan(value)) {
			return new VStrategy();
		}
		if (!Numeral.IV.greaterThan(value)) {
			return new IVStrategy();
		}
		if (!Numeral.I.greaterThan(value)) {
			return new IStrategy();
		}
		return new NoStrategy();
	}


}
