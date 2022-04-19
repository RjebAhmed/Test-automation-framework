package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FirstPage {


    ///////////////////////////////////////////////////////////
    WebDriver driver;

    ///////////////////////////////////////////////////////////


    public FirstPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
