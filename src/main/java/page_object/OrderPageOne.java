package page_object;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Страница заказа
public class OrderPageOne {

 public static final String newURL = "https://qa-scooter.praktikum-services.ru/order";
 private WebDriver driver;
 // локатор поля "Имя"
 private By nameField = By.xpath(".//input[@placeholder='* Имя']");
 // локатор поля "Фамилия"
 private By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
 // локатор поля "Адрес: куда привезти заказ
 private By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
 // локатор поля "Станция метро"
 private By MetroStationField = By.className("select-search__input");
 // локатор поля "Телефон:"
 private By phoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
 // локатор кнопки "Далее"
 private By furtherButton = By.xpath("//div[contains(@class,'Order_NextButton')]//button[text()='Далее']");


 private By inputDay = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
 // локатор "срок аренды"
 private By rentalPeriod = By.className("Dropdown-placeholder");
 //список ответов периода аренды
 // public By faqRentalPeriod =By.xpath("//div[contains(@class,'Dropdown-menu')]");
 // локатор "Цвет самоката"
 private By scooterColour = By.id("black");
 //локатор поля "Комментарий для курьера"
 private By comment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
 // локатор кнопки "Заказать"
 private By orderButton = By.xpath("//div[contains(@class,'Order_Buttons')]//button[text()='Заказать']");
 // локатор кнопки "Да"
 private By yesButton = By.xpath("//div[contains(@class,'Order_Buttons')]//button[text()='Да']");
 public By orderPage = By.xpath("//div[contains(@class,'Order_Content')]");
 private By closeCookie = By.xpath(".//button[text()='да все привыкли']");
 //private By rentalPeriodText = By.className("Dropdown-menu");

 public OrderPageOne(WebDriver driver) {
  this.driver = driver; // Инициализировали в нём поле driver
 }

 //  Добавили методы для локаторов
 public void addNameField(String testName) {
  new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(nameField));
  driver.findElement(nameField).sendKeys(testName);
 }

 public void addSurnameField(String testSurname) {
  new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(surnameField));
  driver.findElement(surnameField).sendKeys(testSurname);
 }

 public void addAddressField(String newAddress) {
  driver.findElement(addressField).click();
  new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(addressField));
  driver.findElement(addressField).sendKeys(newAddress);
 }

 public void choiceMetroField(String metro) {
  driver.findElement(MetroStationField).click();
  new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(MetroStationField));
  driver.findElement(MetroStationField).sendKeys(metro);
   driver.findElement(By.xpath("//button[@value='29']")).click();

 }


 public void addPhoneField(String testPhone) {
  new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(phoneField));
  driver.findElement(phoneField).sendKeys(testPhone);
 }

 public void clickFurtherButton() {
  driver.findElement(furtherButton).click();
 }

 public void addInputDay(String newDate) {
  driver.findElement(inputDay).sendKeys(newDate, Keys.ENTER);
 }


 public void addRentalPeriod() {
  driver.findElement(rentalPeriod).click();
 //new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(rentalPeriod));
  driver.findElement(By.className("Dropdown-option")).click();
 }

 public void addScooterColour() {
  driver.findElement(scooterColour).click();
 }

 public void addComment(String newComment) {
  new WebDriverWait(driver, 3).until(ExpectedConditions.elementToBeClickable(comment));
  driver.findElement(comment).sendKeys(newComment);
 }

 public void clickOrderButton() {
  driver.findElement(orderButton).click();
 }

 public void clickYesButton() {
  driver.findElement(yesButton).click();
 }

 public void clickCloseCookie() {
  driver.findElement(closeCookie).click();
 }

 public WebElement orderPage() {
  return driver.findElement(orderPage);
 }

// public String addRentalPeriod() {
//  driver.findElement(rentalPeriod).click();
//  new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(rentalPeriodText));
//  return driver.findElement(rentalPeriodText).getText();
// }

}