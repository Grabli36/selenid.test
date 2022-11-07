import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class TestSelenoid {

    @Test
    public void testAuthorization() throws InterruptedException {

        String buttonPhoneAuthorization = "/html/body/div[6]/div/div/div[2]/div/div/div[2]/button";
        String buttonProfile = "//*[@id=\"btn_profile\"]";
        String inputPhoneNumber = "/html/body/div[6]/div/div/div[2]/div/div/div[1]/div/div/div[1]/input";
        String buttonSend = "/html/body/div[6]/div/div/div[2]/div/div/div[1]/div/button";
        String inputCod = "/html/body/div[6]/div/div/div[2]/div/div/div[2]/div/div[1]/input";
        String buttonAuthorization = "/html/body/div[6]/div/div/div[2]/div/div/div[2]/button";


        open("https://saint-petersburg.kaverafisha.ru");
        $x(buttonProfile).click();
        $x(buttonPhoneAuthorization).click();
        $x(inputPhoneNumber).setValue("9999999999");
        $x(buttonSend).click();
        $x(inputCod).setValue("3376");
        $x(buttonAuthorization).click();

    }


}
