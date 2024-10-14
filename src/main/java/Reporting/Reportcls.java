package Reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reportcls {
	
	public static void generateJVMreport(String jsonpath)
	{
		File file = new File(jsonpath);
		
		Configuration conf = new Configuration(file,"sample report");
		conf.addClassifications("os", "windows11");
		conf.addClassifications("Browser", "chrome");
		conf.addClassifications("Browserversion", "119");
		
		List<String> files = new ArrayList<String>();
		
		files.add(jsonpath);
		
		ReportBuilder builder = new ReportBuilder(files, conf);
		
		builder.generateReports();
		
		
	}

}
