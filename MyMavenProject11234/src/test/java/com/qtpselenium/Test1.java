package com.qtpselenium;

import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void testA1() throws InterruptedException{
		System.out.println("Starting TestA1");
		Thread.sleep(2000);
		System.out.println("Ending TestA1");

	}
@Test
	public void testB1() throws InterruptedException{
		System.out.println("Starting TestB1");
		Thread.sleep(2000);
		System.out.println("Ending TestB1");

	}

@Test
public void testB3() throws InterruptedException{
	System.out.println("Starting TestC1");
	Thread.sleep(2000);
	System.out.println("Ending TestC1");

}
	
}
