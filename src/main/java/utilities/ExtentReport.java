package utilities;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	//here will keep all the code related linking of the extent or generating HTML reports.
	public static ExtentReports getExtentReport() {
		String extentReportPath=System.getProperty("user.dir")+"\\reports\\extentreport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("BestBy Ecom Automation Report");
		reporter.config().setDocumentTitle("BestBy Ecom Automation Testing");
		
		ExtentReports extentReport = new ExtentReports();
		extentReport.attachReporter(reporter);
		
		return extentReport;
		}

}

