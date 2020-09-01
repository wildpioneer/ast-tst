package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wrappers.UIElement;

public class CustomerLoginPage extends BasePage {
    private final By USERNAME = By.cssSelector(".container.responsivegrid.l-container.l-container--narrow" +
            ".js-toggle__first-option.l-container--no-offset.section input[name='username']");
    private final By PASSWORD = By.cssSelector(".container.responsivegrid.l-container.l-container--narrow" +
            ".js-toggle__first-option.l-container--no-offset.section input[name='password']");
    private final By LOGIN = By.cssSelector(".container.responsivegrid.l-container.l-container--narrow" +
            ".js-toggle__first-option.l-container--no-offset.section button");

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return new UIElement(driver, By.cssSelector(".container.responsivegrid.l-container.l-container--narrow" +
                ".js-toggle__first-option.l-container--no-offset.section input[name='username']")).isDisplayed();
    }

    public CustomerLoginPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    public CustomerLoginPage(WebDriver driver) {
        super(driver, false);
    }

    public WebElement getUsernameField() {
        return new UIElement(driver, USERNAME);
    }

    public WebElement getPasswordField() {
        return new UIElement(driver, PASSWORD);
    }

    public WebElement getLoginButton() {
        return new UIElement(driver, LOGIN);
    }

    public By getLOGIN() {
        return LOGIN;
    }
}
