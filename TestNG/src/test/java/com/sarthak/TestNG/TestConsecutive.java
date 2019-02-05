package com.sarthak.TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;

import org.testng.*;
import org.testng.annotations.Test;

public class TestConsecutive {
	@Test
	public void testConsLetter() {
		ArrayList<String> inputList = new ArrayList<String>(3); 
		inputList.add("google");
		inputList.add("facebook");
		inputList.add("somil");
		
		ArrayList<String> expected = new ArrayList<String>(3);
		expected.add("google");
		expected.add("facebook");
		
		Letter let = new Letter();
		ArrayList<String> actual=let.getCons(inputList);
		
		AssertJUnit.assertEquals(expected, actual);
	}
		
		
	}
	