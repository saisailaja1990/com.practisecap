import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.charset.StandardCharsets;
import java.util.Set;

public class WindowsHandle {
    public static void main(String args []) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sunee\\Desktop\\chrome105\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String mainwindow=driver.getTitle();
        String mainwinId=driver.getWindowHandle();
        Set<String> winId=driver.getWindowHandles();
        System.out.print(mainwinId);
        System.out.println("\n" +"Subwindow "+ winId);
        driver.quit();
    }
}
