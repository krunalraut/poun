package org.example;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserManager extends Util
{
    public final static String URL = "https://kru90:6a4ebb96-fe8e-4134-a180-1d803118b1f6@ondemand.us-west-1.saucelabs.com:443/wd/hub";
public void openBrowser()
{

    boolean souce =true;
    String browser;
    if(souce = false) {
        System.setProperty("webdriver.chrome.driver", "src/test/Resourse/Drivers/chromedriver1.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }
    else
    {
        MutableCapabilities sauceOptions = new MutableCapabilities();

        EdgeOptions browserOptions = new EdgeOptions();
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "80.0");
        browserOptions.setCapability("sauce:options", sauceOptions);
        try {
            driver = new RemoteWebDriver(new URL(URL), browserOptions);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    driver.get("http://automationpractice.com/index.php");
}
public void closeBrowser()
{
    driver.close();
}
}
