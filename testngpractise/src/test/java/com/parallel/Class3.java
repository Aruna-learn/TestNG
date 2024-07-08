package com.parallel;

import org.testng.annotations.Test;

public class Class3 {
	
	@Test
	public void p9() {
		System.out.println("maish>>>"+Thread.currentThread().getId());
		
	}
	
	@Test
	public void p10() {
		System.out.println("jo>>>"+Thread.currentThread().getId());
		
	}
	
	@Test
	public void p11() {
		System.out.println("johnuuip>>>"+Thread.currentThread().getId());
		
	}
	
	@Test
	public void p12() {
		System.out.println("jyui>>>"+Thread.currentThread().getId());
		
	}
	@Test
	public void p13() {
		System.out.println("jpp>>>"+Thread.currentThread().getId());
		
	}
}
