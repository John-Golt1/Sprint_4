import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.id;

public class MainSamokat {
    private final WebDriver driver;
    private final By quests0 = id("accordion__panel-0");
    private final By quests1 = id("accordion__panel-1");
    private final By quests2 = id("accordion__panel-2");
    private final By quests3 = id("accordion__panel-3");
    private final By quests4 = id("accordion__panel-4");
    private final By quests5 = id("accordion__panel-5");
    private final By quests6 = id("accordion__panel-6");
    private final By quests7 = id("accordion__panel-7");
    private final By questsButton0 = id("accordion__heading-0");
    private final By questsButton1 = id("accordion__heading-1");
    private final By questsButton2 = id("accordion__heading-2");
    private final By questsButton3 = id("accordion__heading-3");
    private final By questsButton4 = id("accordion__heading-4");
    private final By questsButton5 = id("accordion__heading-5");
    private final By questsButton6 = id("accordion__heading-6");
    private final By questsButton7 = id("accordion__heading-7");
    private final By orderButton = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/button[1]"); //кнопка заказать вверху
    private final By scooterButton = By.xpath(".//img[@alt='Scooter']"); //кнопка в лендинге "Самокат"
    private final By scooterImg = By.xpath(".//img[@alt='Scooter blueprint']"); //картинка самоката на стартовой странице
    private final By statusOrderButton = By.xpath(".//button[@class='Header_Link__1TAG7']"); //кнопка статус заказа
    private final By inputNumberOrder = By.xpath(".//div/div/div/input"); //поле ввода номера заказа
    private final By clickButtonGO = By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']"); //кнопка Go
    private final By orderNotFoundImg = By.cssSelector("[alt='Not found']"); //картинка - заказ не найден

    public MainSamokat(WebDriver driver) {
        this.driver = driver;
    }
    public void scooterButton() { //кликаем на кнопку заказать и на кнопку Самокат
        driver.findElement(orderButton).click();
        driver.findElement(scooterButton).click();
    }
    public void orderButton() { //нажимаем на кнопку статус заказа
        driver.findElement(statusOrderButton).click();
        driver.findElement(inputNumberOrder).sendKeys("123");
        driver.findElement(clickButtonGO).click();
    }
    public boolean noFindImg() { //если картинка самоката на стартовой странице найдется, то вернем тру
        try {
            return driver.findElement(orderNotFoundImg).isDisplayed();
        }catch (NoSuchElementException e) {
            return false;
        }
    }
    public boolean scooterImgTrue() { //если картинка заказ не найден найдется, вернем тру
        try {
            return driver.findElement(scooterImg).isDisplayed();
        }catch (NoSuchElementException e) {
            return false;
        }
    }
    public String questionBut0() {  //возвращаем текст с 1 кнопки вопросов о важном
        driver.findElement(questsButton0).click();
        String text = driver.findElement(quests0).getText();
        return text;
    }
    public String questionBut1() {  //возвращаем текст с 2 кнопки вопросов о важном
        driver.findElement(questsButton1).click();
        String text = driver.findElement(quests1).getText();
        return text;
    }
    public String questionBut2() {  //возвращаем текст с 3 кнопки вопросов о важном
        driver.findElement(questsButton2).click();
        String text = driver.findElement(quests2).getText();
        return text;
    }
    public String questionBut3() {  //возвращаем текст с 4 кнопки вопросов о важном
        driver.findElement(questsButton3).click();
        String text = driver.findElement(quests3).getText();
        return text;
    }
    public String questionBut4() {  //возвращаем текст с 5 кнопки вопросов о важном
        driver.findElement(questsButton4).click();
        String text = driver.findElement(quests4).getText();
        return text;
    }
    public String questionBut5() {  //возвращаем текст с 6 кнопки вопросов о важном
        driver.findElement(questsButton5).click();
        String text = driver.findElement(quests5).getText();
        return text;
    }
    public String questionBut6() {  //возвращаем текст с 7 кнопки вопросов о важном
        driver.findElement(questsButton6).click();
        String text = driver.findElement(quests6).getText();
        return text;
    }
    public String questionBut7() {  //возвращаем текст с 8 кнопки вопросов о важном
        driver.findElement(questsButton7).click();
        String text = driver.findElement(quests7).getText();
        return text;
    }
}