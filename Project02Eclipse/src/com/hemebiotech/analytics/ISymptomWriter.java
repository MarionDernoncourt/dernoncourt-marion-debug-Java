package com.hemebiotech.analytics;

import java.util.Map;

/**
 * The important part is the param's value for the operation, 
 * which is a collection of String and Integer with no duplications
 */

public interface ISymptomWriter {


		void writeSymptoms(Map<String, Integer> symptoms);
	}

