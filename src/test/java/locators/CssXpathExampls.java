package locators;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
public class CssXpathExampls {
    void cssXpathExample(){
        $("data-testing-email").setValue("1");
        $(by("data-testing","email")).setValue("1");

        $("[id=email]").setValue("1");
        $("#email").setValue("1");
        $("input#email").setValue("1");
        $x("//input[@id='email']").setValue("1");
    }

}
