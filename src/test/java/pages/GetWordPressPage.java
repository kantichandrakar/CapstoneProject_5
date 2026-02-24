package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GetWordPressPage extends BaseTest {

    WebDriver driver;

    public GetWordPressPage(WebDriver driver) {
        this.driver = driver;
    }

    By heading = By.xpath("//h1[text()='Get WordPress']");

    public String getHeadingText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(heading));
        return driver.findElement(heading).getText();
    }
}