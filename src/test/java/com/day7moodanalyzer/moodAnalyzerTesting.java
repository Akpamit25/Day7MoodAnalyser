
package com.day7moodanalyzer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class moodAnalyzerTesting  {
	private MoodAnalyzer moodObject;
	
	@Before
	public void initialize(){
		moodObject=new MoodAnalyzer();
	}
	
//	@Test
//	public void moodTest() {
//		assertEquals("Happy Mood",moodObject.analyzeMood("I am in Happy Mood"));
//		assertEquals("Sad Mood",moodObject.analyzeMood("I am in Sad Mood"));
//	}
	
	@Test 
	public void givenMood_WhenSad_ReturnSad() {
		moodObject=new MoodAnalyzer("I am in Sad Mood");
		assertEquals("SAD",moodObject.analyzeMood());
	}
	
	@Test 
	public void givenMood_WhenAny_ReturnHappy() {
		moodObject=new MoodAnalyzer("I am in Any Mood");
		assertEquals("HAPPY",moodObject.analyzeMood());
	}
	
	@Test
	public void givenMood_WhenNull_ReturnHappy() {
		moodObject=new MoodAnalyzer();
		assertEquals("HAPPY",moodObject.analyzeMood());
	}
}