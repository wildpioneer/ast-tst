package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.UIElement;

public class LoginPage extends BasePage {
    protected By emailSelector = By.id("name");
    protected By passwordSelector = By.id("password");
    protected By loginSelector = By.id("button_primary");

    public LoginPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    public LoginPage(WebDriver driver) {
        super(driver, false);
    }

    @Override
    protected void openPage() {

    }

    public boolean isPageOpened() {
        return new UIElement(driver, By.id("button_primary")).isDisplayed();
    }

    public UIElement getEmailField() {
        return new UIElement(driver, emailSelector);
    }

    public UIElement getPasswordField() {
        return new UIElement(driver, passwordSelector);
    }

    public UIElement getLoginButton() {
        return new UIElement(driver, loginSelector);
    }
}
