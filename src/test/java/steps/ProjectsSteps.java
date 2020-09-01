package steps;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.DashboardPage;
import support.MyWebDriver;

public class ProjectsSteps extends BaseUIStep {

    public ProjectsSteps(MyWebDriver webDriver) {
        super(webDriver);
    }

    @Then("^projects page is opened$")
    public void projectsPageIsOpened() {
        DashboardPage dashboardPage = new DashboardPage(webDriver);
        Assert.assertTrue(dashboardPage.getAddProjectButton().isDisplayed());
    }
}
