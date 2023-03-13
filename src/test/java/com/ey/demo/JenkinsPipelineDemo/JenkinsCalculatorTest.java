package com.ey.demo.JenkinsPipelineDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JenkinsCalculatorTest {

	@Test
	public void addNumberstest() {
		JenkinsCalculator calc=new JenkinsCalculator();
		assertEquals(10, calc.addNumbers(5, 5));
	}


	@Test
	public void subNumberstest() {
		JenkinsCalculator calc=new JenkinsCalculator();
		assertEquals(5, calc.subNumbers(10, 5));
	}

}
