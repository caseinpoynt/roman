package com.roman.numeral;

public class Converter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (null == args || args.length != 1) {
			usage();
		}
		String value = "";
		try {
			value = convert(args[0]);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-2);
		}
		System.out.format("%s\n", value);
	}

	private static String convert(String decimal) throws Exception {
		return Roman.valueOf(decimal);
	}

	private static void usage() {
		System.out.format("usage: java com.roman.numeral.Converter %s\n", "7");
		System.out.format(" > %s", "VII7");
		System.exit(-1);
	}

}
