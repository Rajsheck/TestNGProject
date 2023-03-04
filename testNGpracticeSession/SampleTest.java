package org.testNGpracticeSession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
	

	@BeforeClass
	private void beforeClass(){
		System.out.println("Beforeclass");
		}	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
	}	
	
	@Test private void tc01() {
		System.out.println("test-01 has been checked");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		
		
	}
	@Test
	private void tc02() {
		System.out.println("test-02 has been checked");
		
	}
	@Test
	private void tc03() {
		System.out.println("test-03 has been checked");
		
	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Method");
		
	}
	@AfterClass
private void afterClass() {
	System.out.println("After Class");
	
}
}
