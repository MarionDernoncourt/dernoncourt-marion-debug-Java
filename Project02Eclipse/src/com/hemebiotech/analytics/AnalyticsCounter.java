package com.hemebiotech.analytics;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * AnalyticsCounter's constructor 
 * 
 * @param reader object of type ISymptomReader 
 * @param writer object type ISymptomWriter 
 */
public class AnalyticsCounter {
	
	private ISymptomReader reader;
	private ISymptomWriter writer;
	
	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}
	/**
	 *  Read a list of symptoms
	 *  
	 *  @return list of String of the symptoms
	 */
	public  List<String> getSymptoms() {
		return this.reader.getSymptoms();
	}

	/**
	 * Generate a Map with symptoms as keys and their occurrences for value
	 * 
	 * @param List<String> symptoms
	 * @return Map<String, Integer>
	 */
	public  Map<String, Integer> countSymptoms(List<String> symptoms) {
		Map<String, Integer> countSymptomsList = new LinkedHashMap<String, Integer>();
		if (symptoms != null) {
			for (String symptom : symptoms) {
				if(countSymptomsList.containsKey(symptom)) {
					countSymptomsList.put(symptom, countSymptomsList.get(symptom) + 1);
				} else {
					countSymptomsList.put(symptom, 1);
				}
			}
		}
		return countSymptomsList;
	}
	
	/**
	 * sort the Map by alphabetics
	 * 
	 * @param Map(String, Integer) symptoms -> collection of symptoms and their occurrences not sorted
	 * @return Map(String, Integer) -> alphabetics sorted map of the symptoms and their occurrences 
	 */
	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
		TreeMap<String, Integer> sortedSymptomsList = new TreeMap<String, Integer>(symptoms);
		return sortedSymptomsList;
	}

	/**
	 * Write symptoms and their occurrences in a file
	 * @param symptoms
	 */
	public  void writeSymptoms(Map<String, Integer> symptoms) {
		this.writer.writeSymptoms(symptoms);
	}
	
	
}
