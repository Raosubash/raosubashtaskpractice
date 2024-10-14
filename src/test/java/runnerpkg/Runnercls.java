package runnerpkg;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Reporting.Reportcls;
import basepkg.Basecls;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false,monochrome=true,features="src\\test\\java\\Feature\\Tasks.feature",glue="steppkg",publish = true,plugin= {"pretty","json:target\\index.json"},snippets = SnippetType.CAMELCASE,stepNotifications = true,tags="@Loginandplaceorder")
public class Runnercls extends Basecls {
	
	@BeforeClass
	public static void setup()
	{
		launch();
		maximize();
	}
	
	@AfterClass
	public static void end()
	{
		
		//Reportcls.generateJVMreport("C:\\Users\\Happy\\eclipse-workspace2\\tasks\\target\\report.html");
		if(driver!=null)
		{
		quit();
		}
	
	}

}
