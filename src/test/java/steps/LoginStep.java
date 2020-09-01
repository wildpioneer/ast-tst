package steps;

import io.cucumber.java.en.*;
import pages.CustomerLoginPage;
import pages.LoginPage;
import services.ReadProperties;
import support.MyWebDriver;

public class LoginStep extends BaseUIStep {
    public LoginStep(MyWebDriver webDriver) {
        super(webDriver);
    }

    @Given("login page is opened")
    public void loginPageIsOpened() {
        webDriver.get(new ReadProperties().getURL());
    }

    @When("user enter login {string} and password {string}")
    public void userEnterLoginAndPassword(String username, String password) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.getSignInButton().click();
        CustomerLoginPage customerLoginPage = new CustomerLoginPage(webDriver);
        customerLoginPage.getUsernameField().sendKeys(username);
        customerLoginPage.getPasswordField().sendKeys(password);
        customerLoginPage.getLoginButton().click();
        waiters.waitForInvisibility(customerLoginPage.getLOGIN(), 20);
    }
}
