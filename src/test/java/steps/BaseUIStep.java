package steps;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import support.MyWebDriver;

public class BaseUIStep {
    public final EventFiringWebDriver webDriver;

    public BaseUIStep(MyWebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
