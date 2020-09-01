package steps;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ProfilePage;
import support.MyWebDriver;

public class ProjectsSteps extends BaseUIStep {

    public ProjectsSteps(MyWebDriver webDriver) {
        super(webDriver);
    }

    @Then("the customer's profile page is displayed")
    public void theCustomerSProfilePageIsDisplayed() {
        ProfilePage profilePage = new ProfilePage(webDriver);
        Assert.assertEquals(profilePage.getPageTitle(), "Dashboard - JuicePlus+");
    }
}
