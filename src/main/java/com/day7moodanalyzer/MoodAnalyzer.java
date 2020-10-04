
package com.day7moodanalyzer;

public class MoodAnalyzer {

	public String analyzeMood(String message) {
		if(message.toLowerCase().contains("sad"))
			return "SAD";			
		else if(message.toLowerCase().contains("happy"))
			return "HAPPY";
		else
			return "HAPPY";
	}
	

}