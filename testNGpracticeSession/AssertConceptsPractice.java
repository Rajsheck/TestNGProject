package org.testNGpracticeSession;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertConceptsPractice {
	
	@Test(priority=5)
	private void tc01() {
		System.out.println("1");
	}
	
	@Test(priority=7)
	private void tc02() {
		System.out.println("2");
		
	}
	@Test
	private void tc03() {
		System.out.println("3");
		System.out.println("4");
		assertTrue(true);
		System.out.println("5");
		System.out.println("388");
		System.out.println("355");
		
	}
	@Test(priority=-5)
	private void tc04() {
		assertTrue(true);
		
		System.out.println("4");
		
	}
	@Test(invocationCount=2)
	private void tc05() {
		System.out.println("5");
		
		SoftAssert as= new SoftAssert();
		as.assertTrue(false, "tc passed");
		
		System.out.println("54");
		
	}
	@Test(enabled=false)
	private void tc06() {
		System.out.println("6");
		
	}


}
