import org.junit.After;
import page_object.OrderPageOne;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;


public class TestOrderPage {
    ChromeOptions options = new ChromeOptions();
    WebDriver driver = new ChromeDriver(options);
    OrderPageOne orderPageOne = new OrderPageOne(driver);

    @Before
    public void preTestDataOne() {
        driver.get(OrderPageOne.newURL);
        orderPageOne.clickCloseCookie();
        new WebDriverWait(driver, 3);
        WebElement element = orderPageOne.orderPage();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    @Test
    public void addOrder() {
        OrderPageOne orderPage = new OrderPageOne(driver);
        orderPage.addNameField("Татьяна");
        orderPage.addSurnameField("Перепелицина");
        orderPage.addAddressField("Москва");
        orderPage.choiceMetroField("Белорусская");
        orderPage.addPhoneField("89097777888");
        orderPage.clickFurtherButton();
        orderPage.addInputDay("25.04.2023");
        orderPage.addRentalPeriod();
        orderPage.addScooterColour();
        orderPage.addComment("Написать смс на указанный номер по приезду");
        orderPage.clickOrderButton();
        orderPage.clickYesButton();

        String answer = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[1]")).getText();
        assertEquals("Заказ оформлен", answer);
    }
    @After
    public void tearDown() {
        // Закрой браузер
        driver.quit();
    }

    @Test
    public void addOrderTwo() {
        OrderPageOne orderPage = new OrderPageOne(driver);
        orderPage.addNameField("Кирилл");
        orderPage.addSurnameField("Смирнов");
        orderPage.addAddressField("Санкт-Петербург");
        orderPage.choiceMetroField("Белорусская");
        orderPage.addPhoneField("89097909555");
        orderPage.clickFurtherButton();
        orderPage.addInputDay("29.04.2023");
        orderPage.addRentalPeriod();
        orderPage.addScooterColour();
        orderPage.addComment("Доброго дня");
        orderPage.clickOrderButton();
        orderPage.clickYesButton();

        String answer = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[1]")).getText();
        assertEquals("Заказ оформлен", answer);
    }

}



