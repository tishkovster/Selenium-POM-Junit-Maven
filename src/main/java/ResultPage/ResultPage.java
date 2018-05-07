package ResultPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {
    private WebDriver driver;


    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFirstLink()  {

        return driver.getTitle();
    }
}
