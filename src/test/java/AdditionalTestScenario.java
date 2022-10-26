import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;
import java.time.Duration;
public class AdditionalTestScenario {
    WebDriver driver = new ChromeDriver();
    //WebDriver driver = new FirefoxDriver();
    @Test
    public void examWorkButtonScooter() {  //проверяем, что после нажатия на кнопку Самокат - попадаем на стартовую страницу
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainSamokat object = new MainSamokat(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        object.scooterButton();
        assertTrue("Ops", object.scooterImgTrue());
    }
    @Test
    public void examStatusOrder() { //проверяем, что при неправильном номере заказа, появляется картинка "такого заказа нет"
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainSamokat object = new MainSamokat(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        object.orderButton();
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.
                visibilityOfElementLocated(By.cssSelector("[alt='Not found']")));
        assertTrue("Img true", object.noFindImg());
    }
    @After
    public void closeTest(){
        driver.quit();
    }
}