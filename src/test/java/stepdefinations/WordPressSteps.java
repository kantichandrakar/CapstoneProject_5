package stepdefinations;

import base.BaseTest;
import pages.GetWordPressPage;
import pages.HomePage;
import pages.PhotoDirectoryPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class WordPressSteps extends BaseTest {

    HomePage home;
    GetWordPressPage getPage;
    PhotoDirectoryPage photoPage;

    @Given("User launches WordPress website")
    public void launchWebsite() {

        home = new HomePage(driver);
        getPage = new GetWordPressPage(driver);
        photoPage = new PhotoDirectoryPage(driver);
        home.openURL();
    }

    @Then("Verify page title")
    public void verifyTitle() {
        Assert.assertTrue(home.getTitle().contains("WordPress"));
    }

    @When("User performs mouse hover and clicks Get WordPress")
    public void mouseHover() throws InterruptedException{
        home.mouseOverAndClickGetWordPress();
    }

    @Then("Verify Get WordPress text")
    public void verifyText() {
        Assert.assertEquals(getPage.getHeadingText(), "Get WordPress");
    }

    @When("User navigates to Photo Directory")
    public void navigatePhoto() {
        home.clickCommunity();
        home.clickPhotoDirectory();
    }



    @And("User searches image {string}")
    public void searchImage(String imageName) {
        photoPage.searchImage(imageName);
    }

    @Then("Verify images displayed")
    public void verifyImages() {
        Assert.assertTrue(photoPage.getImageCount() > 0);
    }
}