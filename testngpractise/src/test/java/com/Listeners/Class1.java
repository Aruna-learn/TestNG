package com.Listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;




//@Listeners({TestListenerClass.class}) class level listeners for suite level remove this
public class Class1 {
	
	@Test
	public void p1() {
		System.out.println("i'm inside p1");
		
	}
	
	@Test
	public void p2() {
		System.out.println("i'm inside p2");
		Assert.assertTrue(false);
		
	}
	
	@Test
	public void p3() {
		System.out.println("i'm inside p3");
		
	}
	
	
	@Test(timeOut=1000)
	public void p4() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("i'm inside p4");
		
	}

	
	@Test(dependsOnMethods = "p4")
	public void p5() {
		System.out.println("i'm inside p5");
		
	}

	
	@Test()
	public void p6() {
		System.out.println("i'm inside p6");
		
	}
	@Test
	public void p7() {
	System.out.println("i'm inside p7");
		
	}
}
