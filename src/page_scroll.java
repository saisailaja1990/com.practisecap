
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class page_scroll {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sunee\\Desktop\\chrome105\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        String Url="https://www.axcrypt.net/";
        driver.get(Url);
        driver.manage().window().maximize();
        JavascriptExecutor js= (JavascriptExecutor) driver;// Used to page scroll
        js.executeScript("window.scrollBy(0,3000)","");
        //WebElement affiliate= driver.findElement(By.linkText(" Affiliate "));
        WebElement affiliate= driver.findElement(By.xpath("//a[contains(@href,'/information/affiliate')]"));// Selecting Affiliate hyperlink from the sitemap

        affiliate.click();
        Thread.sleep(3000);

        WebElement affiliate_signup= driver.findElement(By.xpath("//a[contains(@href,'https://axcrypt.leaddyno.com')]"));
        affiliate_signup.click();
        // Affiliate program signup form
        WebElement Frist_Name= driver.findElement(By.xpath("//input[@id='affiliate-homepage-first-name']"));
        Frist_Name.sendKeys("TESTname");
        WebElement Last_Name=driver.findElement(By.xpath("//input[contains(@name,'last_name')]"));
        Last_Name.sendKeys("Lastname");
        WebElement Email=driver.findElement(By.xpath("//input[@name='email'][1]"));
        Email.sendKeys("testab@mailinator");
        WebElement Website_Url= driver.findElement(By.id("signupCustomWebsite URL"));
        Website_Url.sendKeys("www.AxCrypt.Net");
        WebElement Country= driver.findElement(By.id("signupCustomCountry"));
        Country.sendKeys("Sweden");
        WebElement Promote= driver.findElement(By.id("signupCustomHow you want to promote us"));
        Promote.sendKeys("To Increase your business");
        WebElement image_catcha= driver.findElement(By.cssSelector("//div[@class='recaptcha-checkbox-checkmark']"));
        image_catcha.click();
        WebElement signup_button=driver.findElement(By.id("affiliate-homepage-sign-up"));
        signup_button.click();






        driver.quit();
    }
}
