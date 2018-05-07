import LoginPage.LoginPage;
import ResultPage.ResultPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private FirefoxDriver driver;

    @Before
    public void setUP(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.efficientlearning.com/cpa/products/free-trial/");
    }

    @After
    public void tearDown(){
        //driver.close();
    }

    @Test
    public void RegisterTest() {
        //WebDriver driver = new FirefoxDriver();
        //driver.navigate().to("http://yandex.ru");
        //Assert.assertTrue("Yandex", driver.getTitle().contains("Яндекс"));
        //driver.close();
        //driver.quit();
        LoginPage home = new LoginPage(driver);
        ResultPage  result = home.search("Alex");
        Assert.assertTrue(result.getFirstLink().contains("automated"));
    }


}
