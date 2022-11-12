package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {

WebDriver ldriver;
WebDriverWait wait;

public loginPage(WebDriver rdriver){
    ldriver=rdriver;
    PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    WebElement login;

    @FindBy(xpath = "//*[@name='email']")
    WebElement email;

    @FindBy(xpath = "//*[@name='password']")
    WebElement password;

    @FindBy(xpath = "//*[@name='submit']")
    WebElement submit;

    public void click_login_button() throws InterruptedException {
        Thread.sleep(5000);
        login.click();
    }

    public void setEmail(String emailid) {
        email.sendKeys(emailid);
    }

    public void setPassword (String pass){
        password.sendKeys(pass);
    }

    public void click_submit(){
        submit.click();
    }
    public void closeBrowser(){
        ldriver.quit();
    }
}
