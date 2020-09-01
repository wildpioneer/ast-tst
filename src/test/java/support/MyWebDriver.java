package support; /***
 * Excerpted from "The Cucumber for Java Book",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/srjcuc for more book information.
 ***/

import org.openqa.selenium.support.events.EventFiringWebDriver;
import services.BrowsersService;

public class MyWebDriver extends EventFiringWebDriver {
    public MyWebDriver() {
        super(new BrowsersService().getDriver());
    }
}