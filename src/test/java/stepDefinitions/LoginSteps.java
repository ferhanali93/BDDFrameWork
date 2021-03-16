package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.java.en.*;
import objects.HomePage;
import objects.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginSteps extends ApplicationPageBase {

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

    @Given("^User need to be in the sign in page$")
    public void user_need_to_be_in_the_sign_in_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.getLogInPage();
    }

    @When("^Login in with invalid email and password$")
    public void login_in_with_invalid_email_and_password()  {
        // Write code here that turns the phrase above into concrete actions
        loginPage.login("shxdhfk@gmail.com", "shdgfv");
    }

    @Then("^User shall not be allowed to login, error message shown$")
    public void user_shall_not_be_allowed_to_login_error_message_shown() {
        // Write code here that turns the phrase above into concrete actions
      String actualText = loginPage.getErroMessage();
        Assert.assertEquals(actualText, "There is 1 error");
    }
}
