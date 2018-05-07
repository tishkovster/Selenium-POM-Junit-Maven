package LoginPage;

import ResultPage.ResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(FirefoxDriver driver){
        this.driver = driver;
    }

    public ResultPage search(String text) {
        driver.findElement(By.id("firstName")).sendKeys(text);
        driver.findElement(By.id("lastName")).sendKeys(text);
        driver.findElement(By.id("firstName")).sendKeys(text);
        driver.findElement(By.id("email")).sendKeys(text);
        driver.findElement(By.id("pwd")).sendKeys(text);
        driver.findElement(By.id("checkPwd")).sendKeys(text);
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div/div[1]/div[1]/form/div[9]/span/button")).sendKeys(Keys.RETURN);
        return new ResultPage(driver);
    }
}
