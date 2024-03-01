package demoqa;

import com.codeborne.selenide.Condition;
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
        System.out.println("it`s a 0 method");
        Configuration.browserSize = "1920x1080";
    }
    ;
    @Test
    void fillFormTest(){

        open("https://demoqa.com/text-box");
        $ (".text-center").shouldHave(text("Text Box"));
        $("#userName").setValue("Ivan");
        $("#userEmail").setValue("mymail@bg.net");
        $("#currentAddress").setValue("myAdres");
        $("#permanentAddress").setValue("myoemensadres");
        $("#submit").click();

        $("#output").shouldBe(visible);




    }
}
