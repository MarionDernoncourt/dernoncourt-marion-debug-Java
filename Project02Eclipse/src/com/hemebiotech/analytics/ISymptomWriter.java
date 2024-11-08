package com.hemebiotech.analytics;

import java.util.Map;

/**
 * The important part is the parameter's value for the operation, which is a
 * collection of String and Integer with no duplications
 */

public interface ISymptomWriter {
/**
 * 
 * @param symptoms
 */
	void writeSymptoms(Map<String, Integer> symptoms);
}
