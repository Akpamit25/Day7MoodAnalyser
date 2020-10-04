
package com.day7moodanalyzer;

public class MoodAnalyzer {

	public String analyzeMood(String message) {
		if(message.toLowerCase().contains("sad"))
			return "Sad Mood";			
		else
			return "Happy Mood";
	}
	

}