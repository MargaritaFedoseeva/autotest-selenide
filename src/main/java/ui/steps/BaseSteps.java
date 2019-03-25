package ui.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.Before;
import ui.util.TestProperties;

import java.util.Properties;
public class BaseSteps {
    public static Properties properties = TestProperties.getInstance().getProperties();


    @Before
    public void startScenario() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        Selenide.open(properties.getProperty("app.url"));
    }

//    @After
//    public void afterMethod() {
//
//    }
}
