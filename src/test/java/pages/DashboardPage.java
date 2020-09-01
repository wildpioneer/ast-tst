package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {
    public By ADDPROJECTBUTTON = By.id("sidebar-projects-add");

    public DashboardPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    public DashboardPage(WebDriver driver) {
        super(driver, false);
    }

    @Override
    protected void openPage() {

    }

    public boolean isPageOpened() {
        return driver.getTitle().equalsIgnoreCase("All Projects - TestRail");
    }

    public WebElement getAddProjectButton() {
        return driver.findElement(ADDPROJECTBUTTON);
    }
}
