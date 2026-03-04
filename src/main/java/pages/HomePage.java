package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BaseTest {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By downloadExtend = By.xpath("//span[text()='Extend']");
    By getWordPress = By.xpath("//a[contains(text(),'Get WordPress')]");
    By community = By.xpath("//span[text()='Community']");
    By photoDirectory = By.xpath("//span[text()='Photo Directory']");

    public void openURL() {
        driver.get("https://wordpress.org/");
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void mouseOverAndClickGetWordPress() throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(downloadExtend)).click().perform();
        Thread.sleep(3000);
        driver.findElement(getWordPress).click();
    }

    public void clickCommunity() {
        driver.findElement(community).click();
    }

    public void clickPhotoDirectory() {
        driver.findElement(photoDirectory).click();
    }
}