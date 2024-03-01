import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailRuTest {
    public static void main(String[] args) {
        // Указываем путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:/Users/Hewlett Packard/Documents/chromedriver-win32/chromedriver.exe");

        // Инициализируем драйвер
        WebDriver driver = new ChromeDriver();

        // Открываем сайт mail.ru
        driver.get("https://mail.ru");

    }
}