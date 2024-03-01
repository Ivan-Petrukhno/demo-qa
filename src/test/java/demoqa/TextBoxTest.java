package demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {
    @BeforeAll
    static void beforAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl =  "https://demoqa.com";
    }

    @Test
    void fillFormTest(){
        String userName = "Ivan";

        open("https://demoqa.com/text-box");
        $ (".text-center").shouldHave(text("Text Box"));
        $("#userName").setValue("Ivan");
        $("#userEmail").setValue("mymail@bg.net");
        $("#currentAddress").setValue("myAdres");
        $("#permanentAddress").setValue("myoemensadres");
        $("#submit").click();

        $("#output").shouldBe(visible);
        $("#output").$("#name").shouldHave((text("Ivan")));
        $("#output #email").shouldHave((text("mymail@bg.net")));




    }
}
