package registration;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Registration {

    @Test
    void rgistR() {
        Configuration.browserSize = "1920x1080";
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("John");
        $("#lastName").setValue("Doe");
        $("#userEmail").setValue("johndoe@example.com");
        $(".custom-control-label").click();
        $("#userNumber").setValue("1234567890");

        // Установка даты рождения
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("June");
        $(".react-datepicker__year-select").selectOption("1990");
        $(".react-datepicker__day--015").click();

        $("#subjectsInput").setValue("Maths").pressEnter();
        $(".custom-control-label").click();
        $("#uploadPicture").uploadFromClasspath("wp1908606.jpg");
        $("#currentAddress").setValue("123 Street, City, Country");

        // Выбор значения из выпадающего списка (State и City)
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressEnter();

        $("#submit").click();

        // Проверка успешного отправления формы
        $(".modal-content").shouldHave(Condition.text("Thanks for submitting the form"));
    }
}
