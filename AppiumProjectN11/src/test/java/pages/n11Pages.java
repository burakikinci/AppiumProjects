package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class n11Pages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By kategorilerbutonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By apple = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Apple\")");
    By filtrele = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/listingFilterRL\")");
    By dahiliHafiza = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Dahili Hafıza\")");
    By gb = MobileBy.AndroidUIAutomator("new UiSelector().text(\"128 GB\")");
    By uygulaButonu = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/applyBtn\")");
    By model = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Model\")");
    By iphone = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Iphone 13\")");
    By renk = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Renk\")");
    By mavi = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Mavi\")");
    By sonucGoster = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/giybiFilterShowResultsBTN\")");
    By artiButonu = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivAddToBasket\")");
    By sepetim = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepetim\")");
    By sepetKontrol = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/basketItemProductLayoutRoot\")");
    public n11Pages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void kategoriTiklama() {
        driver.findElement(kategorilerbutonu).click();
    }

    public void elektronikTiklama() {
        List <WebElement> ListofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        ListofElement.get(1).click();
    }

    public void telefonVeAksesuarSecimi() {
        List <WebElement> ListofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        ListofElement.get(0).click();
    }

    public void cepTelefonuSecimi() {
        List <WebElement> ListofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        ListofElement.get(0).click();
    }

    public void markaSecimi() {
        driver.findElement(apple).click();
    }

    public void filtrelemeTiklama() {
        driver.findElement(filtrele).click();
    }

    public void filtrelemeYap() {
        driver.findElement(dahiliHafiza).click();
        driver.findElement(gb).click();
        driver.findElement(uygulaButonu).click();
        driver.findElement(model).click();
        driver.findElement(iphone).click();
        driver.findElement(uygulaButonu).click();
        driver.findElement(renk).click();
        driver.findElement(mavi).click();
        driver.findElement(uygulaButonu).click();
    }

    public void sonuclariGosterTiklama() {
        driver.findElement(sonucGoster).click();

    }

    public void urunSepeteEkleme() {
        driver.findElement(artiButonu).click();
    }

    public void sepeteGit() {
        driver.findElement(sepetim).click();
    }

    public void sepetKontrol() {
        elementHelper.checkVisible(sepetKontrol);
    }
}
