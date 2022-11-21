import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;


public class TestSelenoid {
    static AndroidDriver driver;

        @BeforeTest
        public void setUp() throws MalformedURLException {

            DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UITest");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 3");
            cap.setCapability(MobileCapabilityType.APP, "Users/ukhatkin.ea/Desktop/webdraiver/communals.apk/");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        }

        @Test
        public  void test(){
            /*MobileElement el1 = (MobileElement) driver.findElementById();*/



        }

        @AfterTest
        public void end(){
            driver.quit();
        }
}
