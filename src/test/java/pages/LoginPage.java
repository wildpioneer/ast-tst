package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wrappers.UIElement;

public class LoginPage extends BasePage {
    private final By SIGNIN = By.cssSelector(".o-header__join .m-usermenu .a-button");

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
        return new UIElement(driver, By.cssSelector(".o-header__join .m-usermenu .a-button")).isDisplayed();
    }

    public UIElement getSignInButton() {
        return new UIElement(driver, SIGNIN);
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
