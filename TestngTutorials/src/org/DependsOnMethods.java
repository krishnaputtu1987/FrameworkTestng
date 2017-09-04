package org;

	import org.testng.Assert;
import org.testng.Reporter;
	import org.testng.annotations.Test;

	public class DependsOnMethods {
	  
	  @Test(description="independent method")
	  public void test1() 
	   {
		  Reporter.log("suprem method test1",true);
		  Assert.fail("failed");
	   }
	  
	  @Test(description="test2 depends on test1",dependsOnMethods={"test1"})
	  public void test2() 
	   {
		  Reporter.log("Dependent method Test2", true);
	   }
	  
	  @Test(description="test3 depends on test2",dependsOnMethods={"test2"})
	  public void test3() 
	   {
		  Reporter.log("Dependent method ",true);
	   }
	  @Test(description="test4 depends on test1",dependsOnMethods={"test1"})
	  public void test4() 
	   {
		  Reporter.log("Dependent method ",true);
	   }
	}

