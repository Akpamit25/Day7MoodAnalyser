
package com.day7moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class moodAnalyzerTesting {
	private MoodAnalyzer moodObject;
	
	@Before
	public void initialize(){
		moodObject=new MoodAnalyzer();
	}
	
	@Test
	public void moodTest() {
		assertEquals("Happy Mood",moodObject.analyzeMood("I am in Happy Mood"));
		assertEquals("Sad Mood",moodObject.analyzeMood("I am in Sad Mood"));
	}	
}