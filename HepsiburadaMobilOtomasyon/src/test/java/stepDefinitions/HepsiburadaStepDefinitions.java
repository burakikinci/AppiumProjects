package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HepsiburadaPages;
import util.DriverFactory;

public class HepsiburadaStepDefinitions {
    HepsiburadaPages hepsiburadaPages = new HepsiburadaPages(DriverFactory.getDriver());
    @When("Click to Don't Allow Button")
    public void clickToDonTAllowButton() {hepsiburadaPages.clickToDontAllow();
    }

    @When("Click to MyAccount Symbol")
    public void clickToMyAccountSymbol() {hepsiburadaPages.clickToMyAccountSymbol();
    }

    @When("Click to GirisYap Button")
    public void clickToGirisYapButton() {hepsiburadaPages.clicktoGirisYapButton();
    }

    @Then("Check to GirisYap Button is Available in Login Page")
    public void checkToGirisYapButtonIsAvailableInLoginPage() {hepsiburadaPages.checkingGirisYapButton();
    }

    @Then("Check E-Posta Box is Available in Login Page")
    public void checkEPostaBoxIsAvailableInLoginPage() {hepsiburadaPages.checkingEPostaBox();
    }

    @When("Write False Email Address")
    public void writeFalseEmailAddress() {hepsiburadaPages.writingofFalseEmail();
    }

    @Then("Check to {string} Message")
    public void checkToMessage(String errorMessageEmail) {hepsiburadaPages.checkingErrorMessageAboutEmail(errorMessageEmail);
    }

    @When("Write False Phone Number")
    public void writeFalsePhoneNumber() {hepsiburadaPages.writingofFalsePhoneNumber();
    }

    @Then("Check to {string} Message About Phone Number")
    public void checkToMessageAboutPhoneNumber(String errorMessagePhone) {hepsiburadaPages.checkingErrorMessageAboutPhoneNumber(errorMessagePhone);

    }

    @When("Write Correct Email Address")
    public void writeCorrectEmailAddress() {hepsiburadaPages.writingofCorrectEmail();
    }

    @When("Write False Password")
    public void writeFalsePassword() {hepsiburadaPages.writingOfFalsePassword();
    }

    @Then("Check to {string} Message About Login")
    public void checkToMessageAboutLogin(String errorMessageLogin) {hepsiburadaPages.checkingErrorMessageAboutLogin(errorMessageLogin);
    }
}
