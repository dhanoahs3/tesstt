package com.qtpselenium;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void testB1() throws InterruptedException{
		System.out.println("Starting TestA2");
		Thread.sleep(2000);
		System.out.println("Ending TestA2");

	}
	
	@Test
	public void testB2() throws InterruptedException{
		System.out.println("Starting TestB2");
		Thread.sleep(2000);
		System.out.println("Ending TestB2");

	}

}
