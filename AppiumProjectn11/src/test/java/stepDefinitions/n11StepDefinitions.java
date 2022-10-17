package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.n11Pages;
import util.DriverFactory;
public class n11StepDefinitions {
    n11Pages n11Pages = new n11Pages(DriverFactory.getDriver());
    @When("Kategorilere tiklanir")
    public void kategorilereTiklanir() {
        n11Pages.kategoriTiklama();
    }

    @When("Elektronik tiklanir")
    public void elektronikTiklanir() {
        n11Pages.elektronikTiklama();
    }

    @When("TelefonveAksesuarlari Secilir")
    public void telefonveaksesuarlariSecilir() {
        n11Pages.telefonVeAksesuarSecimi();
    }

    @When("Cep telefonu secilir")
    public void cepTelefonuSecilir() {
        n11Pages.cepTelefonuSecimi();
    }

    @When("Marka secilir")
    public void markaSecilir() {
        n11Pages.markaSecimi();
    }

    @When("Filtrelemeye tiklanir")
    public void filtrelemeyeTiklanir() {
        n11Pages.filtrelemeTiklama();
    }

    @When("Filtreleme yapilir")
    public void filtrelemeYapilir() {
        n11Pages.filtrelemeYap();
    }

    @When("Sonuclarigostere tiklanir")
    public void sonuclarigostereTiklanir() {
        n11Pages.sonuclariGosterTiklama();
    }

    @When("Urun sepete eklenir")
    public void urunSepeteEklenir() {
        n11Pages.urunSepeteEkleme();
    }

    @When("Sepetime gidilir")
    public void sepetimeGidilir() {
        n11Pages.sepeteGit();
    }

    @Then("Sepete urunun geldigi kontrol edilir")
    public void sepeteUrununGeldigiKontrolEdilir() {
        n11Pages.sepetKontrol();
    }
}
