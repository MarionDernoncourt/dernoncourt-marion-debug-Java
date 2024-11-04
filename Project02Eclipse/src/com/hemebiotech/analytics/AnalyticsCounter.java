package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
/**
 * This class counts the occurrences of the symptoms listed in the file symptoms.txt
 * First it reads the file, then counts the occurrences, sorts by alphabetics, 
 * and create a new file to write the symptoms in alphabetic with their occurrences
 */
public class AnalyticsCounter {
	
	private static int headacheCount = 0;	
	private static int rashCount = 0;		
	private static int pupilCount = 0;		
	
	public static void main(String args[]) throws Exception {
		/**
		 * This function read the file symptoms.txt
		 * 
		 * @param symptoms.txt, symptoms's list 
		 * @return list of symptoms with their occurrences, sort by alphabetics -> result.out
		 */
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String line = reader.readLine();

		int i = 0;	
		int headCount = 0;	
		while (line != null) {
			i++;	
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rush")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {
				pupilCount++;
			}

			line = reader.readLine();	

		}

		/**
		 * 
		 * This code create a new file to write the symptoms and their occurrences by alphabetics.
		 *
		 */
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}
