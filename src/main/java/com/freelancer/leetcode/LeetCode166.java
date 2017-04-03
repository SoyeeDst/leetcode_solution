package com.freelancer.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Soyee on 2016/9/12.
 */
public class LeetCode166 {

	private static final String DECIMAL_FLAG = ".";
	private static final String PLACE_HOLDER = "0";
	private static final String PREFIX_BRACKET = "(";
	private static final String SUFFIX_BRACKET = ")";
	private static final String MINUS = "-";

	public String fractionToDecimal(int numerator, int denominator) {
		if (numerator == 0) {
			return PLACE_HOLDER;
		}

		if (denominator == 1) {
			return String.valueOf(numerator);
		}

		boolean negative = (numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0);

		Long legacy = new Long(numerator);
		boolean decimal = false;

		StringBuffer sBuffer = new StringBuffer("");
		Map<Long, Integer> modular = new HashMap<>();
		while ((legacy != 0)) {
			// before any business logic handling
			if (decimal) {
				if (modular.containsKey(legacy)) {
					break;
				}
				modular.put(legacy, sBuffer.length());
			}
			Long val = legacy / denominator;
			if (val != 0) {
				sBuffer.append(Math.abs(val));
				legacy = legacy - val * denominator;
			} else {
				if (!decimal) {
					if (sBuffer.length() == 0) {
						sBuffer.append(PLACE_HOLDER);
					}
					sBuffer.append(DECIMAL_FLAG);
					// Start recording possible duplication values
					modular.put(legacy, sBuffer.length());
					decimal = true;
				} else {
					sBuffer.append(PLACE_HOLDER);
				}
			}
			
			if (decimal) {
				legacy = legacy * 10;
			}
		}

		if (legacy != 0) {
			sBuffer.insert(modular.get(legacy), PREFIX_BRACKET);
			sBuffer.append(SUFFIX_BRACKET);
		}

		if (negative) {
			sBuffer.insert(0, MINUS);
		}
		return sBuffer.toString();
	}
}
