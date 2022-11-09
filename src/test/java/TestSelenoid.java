import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class TestSelenoid {

    @Test
    @DisplayName("Тест авторизации")
    public void testAuthorization() throws InterruptedException {

        String buttonPhoneAuthorization = "//button[contains(text(),'По номеру телефона')]";
        String buttonProfile = "//*[@id=\"btn_profile\"]";
        String inputPhoneNumber = " //input[@class='sc-cSHVUG GWKti']";
        String buttonSend = "//button[@class='sc-kpOJdX rkQYm']";
        String inputCod = "//input[@class='sc-cSHVUG cYBPsl']";
        String buttonAuthorization = "//input[@class='sc-cSHVUG cYBPsl']";
        String iconVk = "//a[@href='/social-auth/vkontakte']";
        String iconGmail = "//a[@href='/social-auth/vkontakte']";
        String iconFaceBook = "//a[@href='/social-auth/facebook']";
        String Goodsession = "//button[contains(text(),'Вернуться назад')]";


        open("https://saint-petersburg.kaverafisha.ru");
        $x(buttonProfile).shouldBe(visible).click();
        $x(iconVk).shouldHave(attribute("class", "sc-kEYyzF cHBpjg"));
        $x(iconGmail).shouldHave(attribute("class", "sc-kEYyzF cHBpjg"));
        $x(iconFaceBook).shouldHave(attribute("class", "sc-kEYyzF cHBpjg"));
        $x(buttonPhoneAuthorization).shouldBe(visible).click();
        $x(inputPhoneNumber).setValue("9999999999");
        $x(buttonSend).click();
        $x(inputCod).setValue("3376");
        $x(buttonAuthorization).shouldBe(visible).click();
        $x(Goodsession).shouldHave(text("Вернуться назад"));




    }


}
