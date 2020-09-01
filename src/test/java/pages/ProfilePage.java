package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.UIElement;

public class ProfilePage extends BasePage {
    private By PROFILETITLE = By.xpath("//h2[. = 'Profile Details']");

    public ProfilePage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    public ProfilePage(WebDriver driver) {
        super(driver, false);
    }

    public String getProfileTitle() {
        return new UIElement(driver, PROFILETITLE).getText();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return new UIElement(driver, By.cssSelector(".m-portal-navigation__item--active .m-portal-navigation__link-text"))
                .getText().equalsIgnoreCase("Dashboard");
    }
}
