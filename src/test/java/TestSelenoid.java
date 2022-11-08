import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
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
        String iconVk = "/html/body/div[6]/div/div/div[2]/div/div/div[1]/a[1]";
        String iconGmail = "/html/body/div[6]/div/div/div[2]/div/div/div[1]/a[2]";
        String iconFaceBook = "/html/body/div[6]/div/div/div[2]/div/div/div[1]/a[3]";
        String Goodsession = "/html/body/div[1]/div/div[1]/h2";


        open("https://saint-petersburg.kaverafisha.ru");
        $x(buttonProfile).shouldBe(visible).click();
        $x(iconVk).shouldHave(attribute("class", "sc-kEYyzF cHBpjg"));
        $x(iconGmail).shouldHave(attribute("class", "sc-kEYyzF cHBpjg"));
        $x(iconFaceBook).shouldHave(attribute("class", "sc-kEYyzF cHBpjg"));
        $x(buttonPhoneAuthorization).shouldBe(visible).click();
        $x(inputPhoneNumber).setValue("9999999999");
        $x(buttonSend).click();
        $x(inputCod).setValue("`3376`");
        $x(buttonAuthorization).click();
        $x(Goodsession).shouldHave(text("Страница не найдена"));


    }


}
