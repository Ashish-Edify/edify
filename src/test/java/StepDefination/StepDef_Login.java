package StepDefination;

import PageObject.loginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDef_Login {

WebDriver driver;
loginPage logpg;

@Given("User open chrome browser")
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logpg= new loginPage(driver);
        driver.manage().window().maximize();
    }


    @And("click on login")
    public void clickOnLogin() throws InterruptedException {
        logpg.click_login_button();
    }

    @When("user navigates to {string}")
    public void userNavigatesTo(String url) {
        driver.get(url);
    }

    @And("User enter username as {string} and password as {string}")
    public void userEnterUsernameAsAndPasswordAs(String emailid, String password) throws InterruptedException {
        logpg.click_login_button();
        logpg.setEmail(emailid);
        logpg.setPassword(password);
    }

    @And("click on submit")
    public void clickOnSubmit() {
        logpg.click_submit();
    }

    @And("close browser")
    public void closeBrowser() {logpg.closeBrowser();}
}
