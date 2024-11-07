package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;


/**
 * This class write symptoms and their occurrences in a file
 * 
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

	
/**
 * Write the symptoms and occurrences in result.out
 * 
 * @param symptoms Map with symptom (String) for the key and occurrence (Integer) for the value  
 */
	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) {
		if(symptoms != null && !symptoms.isEmpty()) {
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("result.out"));
				Set<String> keys = symptoms.keySet();

				for(String key : keys) {
					writer.write(key + " " + symptoms.get(key));
					writer.newLine();

				}
				writer.close();		

			} catch (IOException e) {
				System.out.println("Erreur : " + e.getMessage());
			}
		} else {
			System.out.println("Aucun symptomes dans la liste");
		}
	}
}