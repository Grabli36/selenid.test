import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.codeborne.selenide.WebDriverRunner;

public class TestSelenoid {
    static AndroidDriver driver;
    static DesiredCapabilities capabilities;

    public void init() {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("appActivity", ".presentation.launch.LaunchActivity");
        capabilities.setCapability("appPackage", "info.goodline.communals");
        capabilities.setCapability(MobileCapabilityType.APP,
                "Users/ukhatkin.ea/Desktop/webdraiver/communals.apk/");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 3");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UITest");
        capabilities.setCapability("uiautomator2ServerInstallTimeout", "90000");
        capabilities.setCapability("skipUnlock", true);
        capabilities.setCapability("uninstallOtherPackages", "true");

        driver  = new AndroidDriver(capabilities);

        WebDriverRunner.setWebDriver(driver);
        Runtime.getRuntime().addShutdownHook(new Thread());
    }

    @BeforeEach
    public void setup() {
        init();
    }

    @Test
    public void test() {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Phone\"]");
        el1.click();
    }

    @AfterEach
    public void end() {
        driver.quit();
    }
}
