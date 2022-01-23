package StepDefinitions;

import com.qa.managers.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class PageSteps  extends PageObjectManager {
    @Given("^browser is open$")
    public void browser_is_open() throws Throwable {
       // throw new PendingException();
    }

    @When("^user enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
       // throw new PendingException();
    }

    @Then("^user is navigated to the home page$")
    public void user_is_navigated_to_the_home_page() throws Throwable {
        //throw new PendingException();
    }

    @And("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
       // throw new PendingException();
    }
}
