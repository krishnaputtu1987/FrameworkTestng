package org;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngAttributes
{
//	description,timeout,priority,alwaysrun,enable,invocation count,invocation timeout,expected exception
		
	/**
	 * Priority Example 
	 *  
	 */
	    @Test(priority=-1)
		public void test1()
		{
		Reporter.log( "Priority one TC",true);
		}

		/**
		 * Description Example 
		 *  
		 */
	    
	    @Test(description="kd;lfkd;s")
		public void test2()
		{
		Reporter.log("Test Description",true);	
		}
		
	    
		/**
		 * always Run Example 
		 *  
		 */
	    
	    @Test(alwaysRun=true)
		public void test3()
		{
			Reporter.log("AlwaysRun",true);	
		}
		
		/**
		 * Enable true Example 
		 *  
		 */
	    
	    @Test(enabled=true)
		public void test4()
		{
			Reporter.log("enabled=true",true);	
		}
		
	    /**
		 * Enable false Example 
		 *  
		 */
	    
	    @Test(enabled=false)
		public void test41()
		{
			Reporter.log("enabled=false",true);	
		}
		
	    /**
		 * Invocation Count Example 
		 *  
		 */
	    
		@Test(invocationCount=2)
		public void test5()
		{
			Reporter.log("Invocating 2 times",true);	
		}
		
		/**
		 * InvocationTimeout Example 
		 *  
		 */
		
		@Test(invocationTimeOut=2000)
		public void test6()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Reporter.log("TimeOut=1ms->it may or may not occur",true);	
		}
		
		/**
		 *  Excepted Exception Example 
		 *  
		 */
		
		@Test(expectedExceptions=ArithmeticException.class)
		public void test7()
		{
			int a=0,b=10,c=0;
			Reporter.log("expectedException BEFORE ArithmeticException",true);	
			c=b/a;
			Reporter.log("expectedException after ArithmeticException",true);	
		}
		
		/**
		 * Method level Timeout Example 
		 * Test method has to complete its execution within time period
		 * Suite Level Timeout Example
		 * <Suite name ="Suite" time-out="4000">
		 * It applies to all the Test Method and all the test methods has to executes within the 4 seconds
		 * </Suite> 
		 *  
		 */
		
		@Test(timeOut = 2000)
		public void test8()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			Reporter.log( "Failing it as tutor mentioned");
		}
}

