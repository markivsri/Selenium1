package in.amazon;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage {

	public static void main(String[] args) throws MalformedURLException {
		//tttttest
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Drivers for selenium\\chromedriver.exe");
		WebDriver objWebDriver = new ChromeDriver();
		objWebDriver.get("https://www.amazon.in");
//		DesiredCapabilities objDesiredCapabilities = DesiredCapabilities.chrome();
//		objDesiredCapabilities.setBrowserName("chrome");
//		objDesiredCapabilities.setPlatform(Platform.WINDOWS);
//		WebDriver objWebDriver = new RemoteWebDriver(new URL("http://169.254.70.246:5556/wd/hub"), objDesiredCapabilities);
//		objWebDriver.get("https://www.amazon.in");
	}

}
