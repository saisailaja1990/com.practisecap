import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Color_find {
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sunee\\Desktop\\chrome105\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        String Url="https://www.axcrypt.net/";
        driver.get(Url);
        WebElement text= driver.findElement(By.xpath("//span[text()='encryption']"));
        String s = text.getCssValue("color");
        // convert rgba to hex
        String c = Color.fromString(s).asHex();
        System.out.println("Color is :" + s);
        System.out.println("Hex code for color:" + c);
        driver.quit();
    }
}
