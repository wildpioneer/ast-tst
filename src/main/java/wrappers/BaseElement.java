package wrappers;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import utils.Waiters;

import java.util.List;

public abstract class BaseElement {
    protected WebElement element;
    protected WebDriver driver;
    private By by;
    private String name;
    private Waiters waiters;


    public BaseElement(WebDriver driver, By by) {
        this.driver = driver;
        this.by = by;
        waiters = new Waiters(driver);
    }

    public BaseElement(WebDriver driver, By by, String name) {
        this.driver = driver;
        this.by = by;
        this.name = name;
        waiters = new Waiters(driver);
    }

    public BaseElement(WebDriver driver, WebElement element) {
        this.element = element;
        this.driver = driver;
        waiters = new Waiters(driver);
    }

    protected abstract String getElementType();

    public WebElement getElement() {
        waitForIsElementPresent();
        return driver.findElement(by);
    }

    public List<WebElement> getElements() {
        //waiters.waitForPageLoad(driver);
        return driver.findElements(by);
    }

    public boolean isDisplayed() {
        element = getElement();
        return element.isDisplayed();
    }

    public boolean isElementPresent() {
        try {
            waitForIsElementPresent();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private By getLocator() {
        return this.by;
    }

    private String getName() {
        return this.name;
    }

    public void clearAll() {
        getElement().clear();
    }

    public String getAttribute(String attribute) {
        return getElement().getAttribute(attribute);
    }

    public void click() {
        element = getElement();
        element.click();
    }

    public void clickAndWait() {
        element = getElement();
        element.click();
    }

    public String getText() {
        element = getElement();
        return element.getText();
    }

    public String getElementText() {
        return this.element.getText();
    }


    public void moveAndClickByAction() {
        Actions actions = new Actions(driver);
        actions.moveToElement(getElement()).build().perform();
        actions.click(getElement()).build().perform();

    }

    public void moveToElement() {
        Actions actions = new Actions(driver);
        waitForIsElementPresent();
        actions.moveToElement(getElement()).build().perform();

    }

    public void clickByAction() {
        //waiters.elementToBeClickable(driver, by);
        Actions actions = new Actions(driver);
        actions.click(getElement()).build().perform();
        //waiters.waitForPageLoad(driver);
    }

    private void waitForIsElementPresent() {
        //waiters.presenceOfElementLocated(driver, by);
    }

    public void clickByJS() {
        WebElement mapObject = getElement();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", mapObject);
    }
}