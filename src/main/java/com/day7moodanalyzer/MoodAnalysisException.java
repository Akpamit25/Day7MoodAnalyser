
package com.day7moodanalyzer;
public class MoodAnalysisException extends Exception {

	
	public enum ExceptionType{
		NULL_MSG, EMPTY_MSG;
	}
	private ExceptionType type;
	
	public MoodAnalysisException(ExceptionType type, String message) {
		super(message);
		this.type=type;
	}
	

}