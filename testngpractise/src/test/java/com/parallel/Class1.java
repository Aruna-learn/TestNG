package com.parallel;

import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	public void p1() {
		System.out.println("john>>>"+Thread.currentThread().getId());
		
	}
	
	@Test
	public void p2() {
		System.out.println("johny>>>"+Thread.currentThread().getId());
		
	}
	
	@Test
	public void p3() {
		System.out.println("johnu>>>"+Thread.currentThread().getId());
		
	}
	
	@Test
	public void p4() {
		System.out.println("johnpo>>>"+Thread.currentThread().getId());
		
	}

}
