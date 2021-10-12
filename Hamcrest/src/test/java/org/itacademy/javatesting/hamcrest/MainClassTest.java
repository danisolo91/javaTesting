package org.itacademy.javatesting.hamcrest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.Test;

public class MainClassTest {
	
	@Test
	public void mordorLengthIsNot8() {
		assertThat("Mordor", length(not(8)));
	}
	
	@Test
	public void mordorLengthIs6() {
		assertThat("Mordor", length(is(6)));
	}
	
	public static  Matcher<String> length(Matcher<? super Integer> matcher) {
	    return new FeatureMatcher<String, Integer>(matcher, "the length of a String", "length") {
	    	
	        @Override
	        protected Integer featureValueOf(String actual) {
	          return actual.length();
	        }
	        
	    };
	}
	
}
