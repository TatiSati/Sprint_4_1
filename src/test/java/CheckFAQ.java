import main_page.ElementsMainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class CheckFAQ {
    ChromeOptions options = new ChromeOptions();
    WebDriver driver = new ChromeDriver(options);
    ElementsMainPage elementsMainPage = new ElementsMainPage(driver);

    @Before
    public void preTestData(){
        driver.get(ElementsMainPage.url);
        elementsMainPage.clickCloseCookie();
       new WebDriverWait(driver,3);
      WebElement element = elementsMainPage.faqButtons();
      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    @Test
    public void openQHowMuch() {
        String actual = elementsMainPage.openQHowMuch();
        assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", actual);
    }
    @Test
    public void openQSeveralScooters() {
        String actual = elementsMainPage.openQSeveralScooters();
        assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", actual);
    }
    @Test
    public void openQRentalTime() {
        String actual = elementsMainPage.openQRentalTime();
        assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", actual);
    }
    @Test
    public void openQScooterForToday() {
        String actual = elementsMainPage.openQScooterForToday();
        assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", actual);
    }
    @Test
    public void openQExtendOrder() {
        String actual = elementsMainPage.openQExtendOrder();
        assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", actual);
    }
    @Test
    public void openQBringCharge() {
        String actual = elementsMainPage.openQBringCharge();
        assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", actual);
    }
    @Test
    public void openQCancelOrder() {
        String actual = elementsMainPage.openQCancelOrder();
        assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", actual);
    }
    @Test
    public void openQLiveOutsideMoscow() {
        String actual = elementsMainPage.openQLiveOutsideMoscow();
        assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.",actual);
    }
    @After
    public void tearDown() {
        // Закрой браузер
        driver.quit();
    }
}
