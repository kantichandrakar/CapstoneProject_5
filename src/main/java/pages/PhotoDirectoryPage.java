package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PhotoDirectoryPage extends BaseTest {

    WebDriver driver;

    public PhotoDirectoryPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.xpath("//input[@placeholder='Search photos']");
    By images = By.tagName("img");

    public void searchImage(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
        driver.findElement(searchBox).sendKeys(name);
        driver.findElement(searchBox).submit();
    }

    public int getImageCount() {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(images));
        return driver.findElements(images).size();
    }
}