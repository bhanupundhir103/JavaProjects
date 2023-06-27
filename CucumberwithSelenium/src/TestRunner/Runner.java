//package TestRunner;		
//
//import org.junit.runner.RunWith;		
//import cucumber.api.CucumberOptions;		
//import cucumber.api.junit.Cucumber;		
//
//@RunWith(Cucumber.class)				
//@CucumberOptions(features="Features",glue={"StepDefinition"})						
//public class Runner 				
//{		
//
//}

package TestRunner; 

import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.Steps) 
@Cucumber.Options(format = {"pretty", "html:target/cucumber"}) 

public class Runner { }