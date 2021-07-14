package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;

public class BasePage {

    public WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    //метод для перехода на страницу
    public void goToUrl(String Url){
        driver.get(Url);
    }
        //метод для ожидания появления елементов на странице
    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait (driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return  element;
    }
}
