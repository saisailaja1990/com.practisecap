import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_selenium {
    public static void main(String args [])
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sunee\\Desktop\\chrome105\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        String Url="https://www.axcrypt.net/";
        driver.get(Url);
        driver.manage().window().maximize();
        driver.quit();

    }
}
