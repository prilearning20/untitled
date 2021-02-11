package Suite;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Browser {
    public static RemoteWebDriver getDriver(String browser) throws MalformedURLException {
        return new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), getBrowserCapabilities(browser));
    }

    private static DesiredCapabilities getBrowserCapabilities(String browserType) {
        DesiredCapabilities dp = new DesiredCapabilities();
        switch (browserType) {
            case "firefox":
                System.out.println("Opening firefox driver");
                dp.setCapability(CapabilityType.BROWSER_NAME, browserType);
            case "chrome":
                System.out.println("Opening chrome driver");
                dp.setCapability(CapabilityType.BROWSER_NAME, browserType);
                //return DesiredCapabilities.chrome();

        }
        return dp;
    }
}
