package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.deps.com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker;


public class Hooks extends {
	
	@Before
	public void beforeScenario(Scenario bsce)
	{
		
		/*System.out.println(bsce.getName());
		System.out.println(bsce.getId());
		System.out.println(bsce.getStatus());
		System.out.println(bsce.isFailed());*/
		startTestModule(testCaseName, testDescription);
		
			
	}
	
	
	@After
	public void afterScenario(Scenario asce)
	{
		/*System.out.println(asce.getName());
		System.out.println(asce.getId());
		System.out.println(asce.getStatus());
		System.out.println(asce.isFailed());*/
	

}
}
