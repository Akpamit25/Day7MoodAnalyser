
	 package com.day7moodanalyzer;
public class MoodAnalyzer {

	private String message;

	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyzeMood() throws MoodAnalysisException {
		try {
			if (message.isEmpty())
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY_MSG,
						"Empty Mood, Please Enter Proper Message");

			if (message.toLowerCase().contains("sad"))
				return "SAD";
			else if (message.toLowerCase().contains("happy"))
				return "HAPPY";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL_MSG,
					"Null Mood, Please Enter Proper Message");
		}
	}

}