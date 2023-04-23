package main_page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsMainPage {
    public static final String url = "https://qa-scooter.praktikum-services.ru/";
    private WebDriver driver;

    // Кнопка «Заказать» вверху
    private By  orderButton= By.xpath("//div[contains(@class,'Header')]//button[text()='Заказать']");

    // Кнопка "Заказать" посередине
    private By finishButton =By.xpath("//div[contains(@class,'Home_FinishButton')]//button[text()='Заказать']");

    // локаторы для кнопок  "вопросы о важном"
    private By gHowMuch =By.xpath("//*[@id= 'accordion__heading-0']");
    private By gSeveralScooters =By.xpath("//*[@id= 'accordion__heading-1']");
    private By qRentaTime =By.xpath("//*[@id= 'accordion__heading-2']");
    private By qScooterForToday=By.xpath("//*[@id= 'accordion__heading-3']");
    private By qExtendOrder=By.xpath("//*[@id= 'accordion__heading-4']");
    private By qBringCharge=By.xpath("//*[@id= 'accordion__heading-5']");
    private By  qCancelOrder=By.xpath("//*[@id= 'accordion__heading-6']");
    private By qLiveOutsideMoscow =By.xpath("//*[@id= 'accordion__heading-7']");

    // локаторы на ответы раздела "вопросы о важном"
    private By gHowMuchText = By.id("accordion__panel-0");
    private By gSeveralScootersText = By.id("accordion__panel-1");
    private By qRentaTimeText = By.id("accordion__panel-2");
    private By qScooterForTodayText = By.id("accordion__panel-3");
    private By qExtendOrderText = By.id("accordion__panel-4");
    private By qBringChargeText = By.id("accordion__panel-5");
    private By qCancelOrderText = By.id("accordion__panel-6");
    private By qLiveOutsideMoscowText = By.id("accordion__panel-7");
    private By closeCookie = By.xpath(".//button[text()='да все привыкли']");
    public By faqButtons =By.xpath("//div[contains(@class,'Home_FAQ')]");

    //  Добавили конструктор класса page object
    public ElementsMainPage(WebDriver driver){
        this.driver = driver; // Инициализировали в нём поле driver
    }

    //  Добавили методы для локаторов кнопок "Заказать"
    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }
    public void clickFinishButton() {
        driver.findElement(finishButton).click();
    }
    //Добавили методы для локаторов вопросов - ответов
    public String openQHowMuch(){
        driver.findElement(gHowMuch).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(gHowMuchText));
        return driver.findElement(gHowMuchText).getText();
    }
    public String openQSeveralScooters() {
        driver.findElement(gSeveralScooters).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(gSeveralScootersText));
        return driver.findElement(gSeveralScootersText).getText();
    }
    public String openQRentalTime() {
        driver.findElement(qRentaTime).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(qRentaTimeText));
        return driver.findElement(qRentaTimeText).getText();
    }
    public String openQScooterForToday() {
        driver.findElement(qScooterForToday).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(qScooterForTodayText));
        return driver.findElement(qScooterForTodayText).getText();
    }
    public String openQExtendOrder() {
        driver.findElement(qExtendOrder).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(qExtendOrderText));
        return driver.findElement(qExtendOrderText).getText();
    }
    public String openQBringCharge() {
        driver.findElement(qBringCharge).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(qBringChargeText));
        return driver.findElement(qBringChargeText).getText();
    }
    public String openQCancelOrder() {
        driver.findElement(qCancelOrder).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(qCancelOrderText));
        return driver.findElement(qCancelOrderText).getText();
    }
    public String openQLiveOutsideMoscow() {
        driver.findElement(qLiveOutsideMoscow).click();
        new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(qLiveOutsideMoscowText));
        return driver.findElement(qLiveOutsideMoscowText).getText();
    }
    public void clickCloseCookie(){
        driver.findElement(closeCookie).click();
    }
    public WebElement faqButtons(){
        return driver.findElement(faqButtons);
    }
}
