package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		ISymptomReader readerSymtpoms = new ReadSymptomDataFromFile("symptoms.txt");
		ISymptomWriter writerSymptoms = new WriteSymptomDataToFile();
		
		AnalyticsCounter counterSymptoms = new AnalyticsCounter(readerSymtpoms, writerSymptoms);
	
			List<String> listSymptoms = counterSymptoms.getSymptoms();
			Map<String, Integer> mapSymptoms = counterSymptoms.countSymptoms(listSymptoms);
			Map<String, Integer> sortMapSymptoms = counterSymptoms.sortSymptoms(mapSymptoms);
			counterSymptoms.writeSymptoms(sortMapSymptoms);
			
	}
}