

package com.day7moodanalyzer;

public class MoodAnalyzer {

	private String message;
	
	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyzeMood() {
		if(message.toLowerCase().contains("sad"))
			return "SAD";			
		else if(message.toLowerCase().contains("happy"))
			return "HAPPY";
		else
			return "HAPPY";
	}
	

}