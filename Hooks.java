package StepDefinitions;

import io.cucumber.java.After;

//import org.junit.Before;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@RegTest")
	public void beforehook()
	{
		System.out.println("Before Hook RegTest");
	}
	
	@After("@RegTest")
	public void afterhook()
	{
		System.out.println("After Hook RegTest");
	}
}
