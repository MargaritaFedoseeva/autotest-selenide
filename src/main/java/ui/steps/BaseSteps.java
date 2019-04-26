package ui.steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.Before;


public class BaseSteps {
    @Before
    public void startScenario() {
        System.setProperty("webdriver.chrome.driver", "C://Users/MFedoseeva/Desktop/chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        Selenide.open(System.getProperty("URL"));
    }
}

