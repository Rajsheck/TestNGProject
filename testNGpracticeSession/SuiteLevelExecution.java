package org.testNGpracticeSession;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SuiteLevelExecution {
	
	@Test(priority=-10)
	private void tco1() {
		
		System.out.println("1");
		
	}
	@Parameters
	@Test(enabled=false)
	private void tc02(String url, String username,String password){
		System.out.println("2");
		
	}
@Test(invocationCount=2)
	 void tc03(){
		System.out.println("case3");
		
	}
@Test(enabled=true)
	 private void tc04() {
		System.out.println("4");
		System.out.println("5");
		assertTrue(true, "condinctoin");
		System.out.println("6");
		System.out.println("7");
	}
}
