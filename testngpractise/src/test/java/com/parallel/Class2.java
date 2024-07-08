package com.parallel;

import org.testng.annotations.Test;

public class Class2 {
	
	@Test
	public void p5() {
		System.out.println("sitha>>>"+Thread.currentThread().getId());
		
	}
	
	@Test
	public void p6() {
		System.out.println("ram>>>"+Thread.currentThread().getId());
		
	}
	
	@Test
	public void p7() {
		System.out.println("joh"+Thread.currentThread().getId());
		
	}
	
	@Test
	public void p8() {
		System.out.println("joe>>>"+Thread.currentThread().getId());
		
	}

}
