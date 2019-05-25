package com.tc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tcs {
	
	
	@Test
	public void m1(){
		
		System.out.println("hi");
		
	}
	
	@Test
	public void m2(){
		System.out.println("hello");
		
	}
	
	@Test
	public void m3(){
		
		Assert.fail();
		
	}

}
