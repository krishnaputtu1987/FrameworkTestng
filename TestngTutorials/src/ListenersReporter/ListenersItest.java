package ListenersReporter;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersItest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("test method started its name is ::"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test method passed its name is ::"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test method Failed its name is ::"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("test method Skipped its name is ::"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
	  //dont know
		
	}

	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("Test Name of the Suite is started its name is ::"+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("Test Name of the Suite is finished its name is ::"+context.getName());
		
	}

}
