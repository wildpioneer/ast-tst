package steps;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import support.MyWebDriver;
import utils.Waiters;

public class BaseUIStep {
    public final EventFiringWebDriver webDriver;
    public Waiters waiters;

    public BaseUIStep(MyWebDriver webDriver) {
        this.webDriver = webDriver;
        this.waiters = new Waiters(webDriver);
    }
}
