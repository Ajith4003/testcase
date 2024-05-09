package test2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshort {

	public static void caputecher( WebDriver driver, String filename) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		 File tsc = ts.getScreenshotAs(OutputType.FILE);
			File dst = new File("./Screenshort/"+filename);
			
			FileHandler.copy(tsc, dst);
	}

}
