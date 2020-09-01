package steps;

import io.cucumber.java.en.*;
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
        loginPage.getEmailField().sendKeys(username);
        loginPage.getPasswordField().sendKeys(password);
        loginPage.getLoginButton().submit();
    }
}
