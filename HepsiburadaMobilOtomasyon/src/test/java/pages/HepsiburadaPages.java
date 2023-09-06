package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class HepsiburadaPages {
    //Elemanlar Gelecek
    By DontAllowButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_deny_button\")");
    By MyAccountButton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.pozitron.hepsiburada:id/account_menu_button_container\")");
    By GirisYapButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Giriş yap\")");
    By GirisYapButtoninLoginPage = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"btnLogin\")");
    By EpostaBox = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"txtUserName\")");
    By ErrorMessageAboutEMailAddress = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Geçerli bir e-posta adresi girmelisiniz.\")");
    By ErrorMessageAboutPhoneNumber = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Geçerli bir cep telefonu girmelisiniz\")");
    By girisYapButtoninPasswordPage = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"btnEmailSelect\")");
    By errorMessageAboutLogin = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Beklenmeyen bir hata oluştu.\")");
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public HepsiburadaPages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickToDontAllow() {
        driver.findElement(DontAllowButton).click();
    }

    public void clickToMyAccountSymbol() {
        driver.findElement(MyAccountButton).click();
    }

    public void clicktoGirisYapButton() {
        driver.findElement(GirisYapButton).click();
    }

    public void checkingGirisYapButton() {
        elementHelper.checkVisible(GirisYapButtoninLoginPage);
        
    }

    public void checkingEPostaBox() {
        elementHelper.checkVisible(EpostaBox);
    }

    public void writingofFalseEmail() {
        driver.findElement(EpostaBox).click();
        elementHelper.sendKeys(EpostaBox,"abcde");
        driver.findElement(GirisYapButtoninLoginPage).click();

    }

    public void checkingErrorMessageAboutEmail(String errorMessageEmail) {
        elementHelper.checkVisible(ErrorMessageAboutEMailAddress);
    }

    public void writingofFalsePhoneNumber() {
        driver.findElement(EpostaBox).click();
        elementHelper.sendKeys(EpostaBox,"12345");
        driver.findElement(GirisYapButtoninLoginPage).click();
    }

    public void checkingErrorMessageAboutPhoneNumber(String errorMessagePhone) {
        elementHelper.checkVisible(ErrorMessageAboutPhoneNumber);
    }

    public void writingofCorrectEmail() {
        driver.findElement(EpostaBox).click();
        elementHelper.sendKeys(EpostaBox,"aaaa@gmail.com");
        driver.findElement(GirisYapButtoninLoginPage).click();
    }

    public void writingOfFalsePassword() {
        List <WebElement> ListofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"txtPassword\")"));
        ListofElement.get(0).click();
        ListofElement.get(0).sendKeys("1234");
        driver.findElement(girisYapButtoninPasswordPage).click();
    }

    public void checkingErrorMessageAboutLogin(String errorMessageLogin) {
        elementHelper.checkVisible(errorMessageAboutLogin);
    }
}
