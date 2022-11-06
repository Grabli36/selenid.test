import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;

public class TestSelenoid {

    @Test
    public void testGoogle() throws InterruptedException {
        open("https://saint-petersburg.kaverafisha.ru/");
        $x("//*[@id=\"btn_profile\"]").click();
        TimeUnit.SECONDS.sleep(1);
        $x("//*[@fill='#4C75A3']").click();
        




    }
}
